package tekken;

public abstract class Character { // 추상 메소드
    int hp;
    int power;
    int gauge;
    int mp;
    int skill;
    int heal;


    public abstract boolean hit(Character character);

    public abstract void special(Character character);

    public abstract void lastChance(Character character);

    public abstract Character tag(Character[] characters);


    public int defence(Character character){ // 인터페이스 넣어놨다
        return 0;
    }


}
