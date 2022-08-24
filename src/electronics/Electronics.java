package electronics;

public abstract class Electronics {

    public int power;

    public abstract String getClassName();  // 실체가 없는놈 상속된놈들 안에서 구체적으로 설계한다!. 그치만 이거 없으면 오류냄 -메소드

    public void turnOn(){
        System.out.println("turn on "  + this.getClassName()); // 구체한 노 , this 는 현재 가르키고 있는 인스턴스

    }

    public void turnOn(String a){
        System.out.println(a);
    }
    public void show(){

    }

}
