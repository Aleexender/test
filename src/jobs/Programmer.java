package jobs;

/**
 * @author: Minwoo Kim
 * @date 2022/08/25
 */
public class Programmer extends Person{

    public Programmer(String name, int age, int height) {
        super(name, age, height);
    }

    public void introduceName(){
        System.out.println("I'll code my name as " + this.name);
    }

}
