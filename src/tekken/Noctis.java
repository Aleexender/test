package tekken;

public class Noctis extends Character implements Skill{

    public Noctis(){
        this.hp = 500;
        this.power = 90;
        this.gauge = 0; // 스킬만 쓸수있음
        this.mp = 7;  // 0 이되면 한턴 못때림
        this.heal = 50;
        this.skill = 120;
    }
    public boolean hit(Character character){
        System.out.println("uppercut");
        ++this.gauge;
        --this.mp;
        character.hp -= this.power;
        return true;
    }
    public void lastChance(Character character){
        System.out.println("hero is not die");
        this.mp -= 3;
        character.hp += this.heal;
    }

    public void special(Character character){
        System.out.println("mudamudamuda");
        this.mp -= 4;
        character.hp-= this.skill;
    }

    public Character tag(Character[] characters){
        return null;
    }

    @Override // 예외적으로 그 메소드만 상속을 안따를꺼야.
    public int defence(Character character){ //인터페이스= 모든 캐릭터가 똑같은 기술을 쓰는것
        System.out.println("Tetkai!");
        this.hp += character.power; //  힐하는거 까진 성공 했는데 녹티스 파워로 힐을 하네
        return 0; // 방어하는거 만들고 시펑 ㅠㅠㅠㅠ쓔밤 ㅠㅠㅠㅠㅠㅠㅠ
    }
}
