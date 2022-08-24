package tekken;

public class Lee extends Character {
    public Lee() {
        this.hp = 500;
        this.power = 70;
        this.gauge = 0; // 스킬쓸수있게 해주는거
        this.mp = 10; // 스킬 혹은 떄리면 깍임
        this.skill = 60;
    }

    public boolean hit(Character character) {
        System.out.println("lee kick");
        ++this.gauge;
        --this.mp;
        character.hp -= this.power;
        return true;
    }
    public void special(Character character){
            System.out.println("류승룡 기모찌");
            this.mp -= 2;
            character.hp -= this.skill;
    }

    @Override
    public void lastChance(Character character){

    }

    public Character tag(Character[] characters){
        for(Character character : characters){ // Character 클래스 / enhanced for 문  하나하나씩 꺼낸다.
            if(!(character instanceof Lee)){ // Character 클래스 안에 Lee가 있냐 == lee 면 True
                return character;
            }
        }
        return this;
    }

    public int defence(Character character) { //인터페이스= 모든 캐릭터가 똑같은 기술을 쓰는것
        System.out.println("Tetkai!");
        this.hp += character.power;
        return 0; // 방어하는거 만들고 시펑 ㅠㅠㅠㅠ쓔밤 ㅠㅠㅠㅠㅠㅠㅠ
    }
}
