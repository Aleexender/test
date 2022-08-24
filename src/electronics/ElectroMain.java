package electronics;

public class ElectroMain {
    public static void main(String[] args) {
        Electronics electronics = new Tv();
        electronics.turnOn();
        electronics.turnOn("aa");
        electronics = new Computer();
        electronics.turnOn();
        Interior interior = new Tv();
        interior.show();
        AspectComTv aspectComTv = new Tv();
        aspectComTv.screenImport("정훈");
        aspectComTv.connectHdmi();
        interior = new Computer();
        interior.show();
        interior.getInteriorName();
        Phone phone = new Phone();
        phone.turnOn();
    }
}
