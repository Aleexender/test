/**
 * @author: Minwoo Kim
 * @date 2022/07/31
 */
public class Cake {

    String ingredient;
    int size;

    public Cake(){
        this.size = 30;
    }


    public void introduce(){
        System.out.println("I am made with : " + this.ingredient);
    }
}
