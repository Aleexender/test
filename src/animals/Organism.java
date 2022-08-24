package animals;

public abstract class Organism { // 인스턴스를 못만든다 - abstract
    int size;
    String name;


    public int mating() {
        System.out.println("mating");
        return 1;  //
    }



}
