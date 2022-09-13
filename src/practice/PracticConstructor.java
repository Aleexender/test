package practice;

public class PracticConstructor {
    int carSize = 14;
    public PracticConstructor(int carSize){
        this.carSize =carSize;
    }

    public PracticConstructor(){
        this(12);
    }
