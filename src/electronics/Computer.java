package electronics;

public class Computer extends Electronics implements Interior{
    public String getClassName(){
    return "computer";
    }

    public void show(){
        System.out.println("interior comp");
    }

}
