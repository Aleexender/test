package Poketmon;

public class Charmeleon extends Charmander { // 리자드


    int scleraSize;


    public Charmeleon(int scleraSize, Charmander charm){ // 사이즈랑 친근함
        super(charm.size + 10, charm.friendliness);
        this.scleraSize = scleraSize;
    }

    public void anger() { // 메소드
        System.out.println("anger");
    }
}
