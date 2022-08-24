package animals;

public class AnimalMain {
    public static void main(String[] args) {
//        Organism Mammal = new Cat();
//        org.feed();
//        org.meow();
//        Organism cat = new Cat();
//        Cat.meow();

//        Cat cat = new Cat(); // organism class에서는 mating은 되는데 왜 feeding(Mammal)은 안되지?
//        cat.mating();
//        cat.feeding();
//        cat.meow();

        Organism organism = new Cat();// 실제로 실행되는건 오른쪽 클래스타입 가진 레퍼런스 - 리모컨 abstract
        organism.mating();
        Organism organism1 = new Organism() {

        };
        Organism organism2 = organism; // call by reference
        organism = new Dog();
        organism = organism2;
        int a = organism.mating(); // **공통적으로 실행시키고 싶은 메소드가 있으면 상속된 다른놈들을 넣을 수있음
        Mammal mammal = new Cat();
        Cat mm = (Cat) mammal; // cat 이라는 리모컨으로 organism의 행동을 실행시키는 거였나? -- 이게 캐스팅? 케스팅의 정확한 예시 필요
        mm.meow();
        mm.feeding();
        System.out.println(a);

        Cat cat1 = new Cat(); // 생성자
        Cat cat2 = new Cat(); // 생성자
        System.out.println(cat2.getSize());
//        organism = new Dog();
//        organism.mating();
//        organism.meow(); // 이건 됐으면서 ㅆㅂ
//        organism = new Mammal();
//        organism.meow();  //???
////        organism.feeding(); //?? 이건 왜 또 안대 씨발진짜
//        organism = new Chicken();
//        organism.winging();  // 보니까 처음에 어떤 클래스를 입력하는것에 따라 차이가 있는듯?
////        organism.winging();//??? 왜 안되냐;;
////        organism.peaking(); //하 씨발 진짜
//
//        Cat cat = new Cat();
//        cat.meow();
//        cat.mating();
//        cat.feeding();
//
//        Birds birds = new Chicken();
//        birds.winging();
//
//        Birds organism1 = new Eagle();
//        organism1.winging();  // 이거는  또 되잖아 ㅆㅂ, Birds 와 Organism 의 차이인듯?
//


        }






    }
