package Phone;

public class MainPhone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.call();
        iphone.texting();
        Samsung samsung = new Samsung();
        samsung.call();
        samsung.record();

        Smartphone smartphone = new Samsung();
        Samsung ss =(Samsung) smartphone;
        ss.record();
        ss.call();
        ss.texting();
    }
}