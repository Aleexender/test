import java.util.*;

public class TeamMaker {

    private static int n;
    private static int[] selects, cycle, visited;
    private static int maxCycleSize = 0;

    public static int solution(int[] selects, int m) {
        n = selects.length;
        TeamMaker.selects = selects;
        cycle = new int[n];
        visited = new int[n];
        Arrays.fill(cycle, -1);
        Arrays.fill(visited, -1);

        for (int i = 0; i < n; i++) {
            if (visited[i] == -1) {
                dfs(i, i, 1);
            }
        }

        for (int i = 0; i < n && m > 0; i++) {
            if (cycle[i] == -1) {
                int target = i;
                while (cycle[target] == -1) {
                    target = selects[target];
                }
                if (m > 0) {
                    selects[i] = target;
                    m--;
                }
            }
        }

        Arrays.fill(visited, -1);
        for (int i = 0; i < n; i++) {
            if (visited[i] == -1 && cycle[i] != -1) {
                maxCycleSize = Math.max(maxCycleSize, dfs(i, i, 1));
            }
        }
        return maxCycleSize;
    }

    private static int dfs(int cur, int start, int count) {
        if (visited[cur] != -1) {
            if (cur == start) {
                int cycleSize = count - visited[cur];
                for (int i = 0; i < n; i++) {
                    if (visited[i] >= visited[cur]) {
                        cycle[i] = count - visited[i];
                    }
                }
                return cycleSize;
            }
            return 0;
        }
        visited[cur] = count;
        return dfs(selects[cur], start, count + 1);
    }

    public static void main(String[] args) {
        int[] selects = {1, 2, 3, 0, 5, 6, 4};
        int m = 2;
        System.out.println(solution(selects, m));
    }
}
