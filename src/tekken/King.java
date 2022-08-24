package tekken;

public class King extends Character{

    public boolean hit(Character character){
        System.out.println("King King");
        character.hp -= this.power;
        return false;
    }
    public void special(Character character){

    }
    public void lastChance(Character character){

    }
    public Character tag(Character[] characters){
        for(Character character : characters){
            if(!(character instanceof King)){
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
