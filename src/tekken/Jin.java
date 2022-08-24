package tekken;

public class Jin extends Character{
    public Jin(){
        this.hp = 300;
        this.power = 50;
        this.gauge = 0;
        this.mp = 10;
    }
    public boolean hit(Character character){
        System.out.println("jin punch");
        character.hp -= this.power;
        return false;
    }
    public void special(Character character){

    }
    public void lastChance(Character character){

    }
    public Character tag(Character[] characters){
        for(Character character : characters){
            if(!(character instanceof Jin)){
                return character;
            }
        }
        return this;
    }
}
