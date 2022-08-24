package appleCompany;

public class AppleMain {
    public static void main(String[] args) {
        AppleCo appleCo = new Iphone(); //IOS만 프린트 되겠지?
        appleCo.ios();
        int a = appleCo.ios();
//        Ipod apple = (Ipod) appleCo;
//        apple.ios();
//        apple.lte();
//        apple.touch();
        Ipod ipod = new Ipod();
        ipod.touch();
        ipod.ios();
        ipod.lte();
        Mac mac = new Macbook();
        mac.typing();
        mac.ios();
        Macbook macbook = new Macbook();
        macbook.typing();
        macbook.trackpad();
        macbook.ios();
        System.out.println(a);
    }
}
