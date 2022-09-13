package practice;

public class PracticConstructor {
    int carSize = 14;
    public PracticConstructor(int carSize){
        this.carSize =carSize;
    }

    public PracticConstructor(){
        this(12);
    }

    public void engine(){
        System.out.println("부릉부릉");
    }
}
