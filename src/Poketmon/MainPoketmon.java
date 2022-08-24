package Poketmon;


import animals.Cat;

public class MainPoketmon {
    public static void main(String[] args) { // static 을 넣으면 인스턴스를 호출안해도 출력 가능
         // 상위클레스에서 하위 클래스로 만든후에 케스팅
        Charmander charmander = new Charmander(5,2.0); // 메인에서 파라메터 값 입력
        charmander.cryingSound(); // 앞에 Charmander 의 기능만 호출할수있다
        Charmeleon charmeleon = new Charmeleon(3, charmander); // 이렇게 생성자 변수 이름을 입력 가능
        charmeleon.cryingSound();
        charmeleon.anger();
        Charizard charizard = new Charizard(50, charmeleon); //
        charizard.anger();
        charizard.cryingSound();
        charizard.fireflame();
        charizard.wingSize = 2; // wingSize 50이였는데 2로 덮어씌워지는건지?
        Charmander charmander2 = new Charizard(3,charizard); // new를 뭐를 설정하냐에 따라서 다른거같은데?
        Charizard charizard1 = (Charizard) charmander2; // 케스팅 하기전 19행에서 업캐스팅 할때 리자몽으로 설정하면 파이리로는 안대나? 왜 cat organism 은되는데 왜 이건 안댐

    }
}
