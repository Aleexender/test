public class Kia implements Car {

    @Override
    public void move() {
        System.out.println("KoreaCar is moving");
    }

    @Override
    public void breakPedal() {
        System.out.println("KoreaCar is stopped");
    }
}
