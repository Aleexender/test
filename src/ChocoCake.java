/**
 * @author: Minwoo Kim
 * @date 2022/07/31
 */
public class ChocoCake extends Cake{ // Cake class 안에 상속
    String ingredient;
    int size;
     public ChocoCake(){ // 생성자
        System.out.println("i am choco"); // 메소드
        this.ingredient = "choco"; // 인변
         System.out.println(ingredient);
    }
    void cry(){ // 메소드
        System.out.println("ahhhhh");
    }
    public void introduce() {
        System.out.println("I am made with : " + this.ingredient);
    }
}
