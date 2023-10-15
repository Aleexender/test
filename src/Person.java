public class Person  {

    Car car;
    String name = "정훈";
    Tesla tesla = new Tesla(); // 강한 결합
    int age = 10;


    public Person(Tesla tesla) { // DI
        this.car = car;
    }

    public void kiaMove() {
//        kia.move();
    }

//    public void KiaStop() {
//        kia.breakPedal();
//    }


    public void getCar() {
        car.move();
        car.breakPedal();
    }
}