package Phone;

public class Samsung extends Smartphone {
    @Override
    public void call() {
        System.out.println("SM phone ringing");
    }
    public void record(){
        System.out.println("recording possible");
    }
}
