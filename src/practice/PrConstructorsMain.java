package practice;

public class PrConstructorsMain {
    public static void main(String[] args) {
        PracticConstructor practicConstructor = new PracticConstructor(30);
        practicConstructor.engine();
//        PracticeConstructorII practiceConstructorII = (PracticeConstructorII) practicConstructor;


        PracticeTest practiceTest = new PracticeTest();
        System.out.println(2 + practiceTest.sad("")); //만약에 2 라는 int 값 추가면 return 의 1이 추가
    }
}
