package Poketmon;

public class Charmander { // 파이리

    int size;
    public String type = "fire";
    public double friendliness;

    public Charmander(int size,double friendliness){
        this.size = size;
        this.friendliness = friendliness;
    }

    public void cryingSound() {
        System.out.println("CryingSound");
    }

}
