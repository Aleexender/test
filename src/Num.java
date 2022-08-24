public class Num {
    int i = 1;
    public static void main(String[] args) {

        char ch = 'H';   // '' 와 "" 차이가 뭐죠?? ch - '한글자'  string "여러글자"

        if (ch >= 'a' && ch <= 'z') {  // ch가 a 보다 크거나 같다, ch가 z보다 같거나 작다
            System.out.println("해당 문자는 영문 소문자이다");  // {} 이거 언제 쓰는지?
        }
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("해당 문자는 영문 대문자입니다"); // 7번째 줄이 대문자면 실행
        }
        if (ch >= 'A' && ch <= 'z'){
            System.out.println("해당 문자는 영문자가 아닙니다."); // 7번째 줄이 대문자 혹은 소문자가 아니면 실행

        }
    }
}