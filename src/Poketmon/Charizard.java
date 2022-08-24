package Poketmon;

public class Charizard extends Charmeleon {  // 리자몽

    int wingSize;


    public Charizard(int wingSize, Charmeleon charm){
        super(charm.scleraSize + 10, charm);// 상위 클래스의 생성자(메소드)를 가져온다
        this.wingSize = wingSize;
    }

    public void fireflame() {
        System.out.println("fireflame");
    }
}
