package electronics;

public class Tv extends Electronics implements Interior,AspectComTv{
    public String getClassName(){
        return "Tv";
    }

    @Override // 있어도 없어도 상관없다 = 어노테이션
    public void show() {

    }

    public void turnOn(){
        System.out.println("turn off");
    }
    public void turnOn(String a){
        System.out.println(a);
    }

    public void screenImport(String text ){
        System.out.println("Welcome" + text);
    }
    public void connectHdmi(){
        System.out.println("connect completed");
    }
}
