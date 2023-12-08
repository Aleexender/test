public class Tesla implements Car{
    @Override
    public void move() {
        System.out.println("전기차가 움직인다");
    }

    @Override
    public void breakPedal() {
        System.out.println("electric Car is stopped");
    }
}
