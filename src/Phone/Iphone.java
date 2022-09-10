package Phone;

public class Iphone extends Smartphone {

    @Override
    public void call() {
        System.out.println("iphone ringing");
    }

    @Override
    public void record() {
    }

    public void texting(){
        System.out.println("문자예약");
    }
}
