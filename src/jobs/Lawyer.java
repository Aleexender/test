package jobs;

/**
 * @author: Minwoo Kim
 * @date 2022/08/25
 */
public class Lawyer extends Person{

    public Lawyer(String name, int age, int height) {
        super(name, age, height);
    }

    public void introduceName(){
        System.out.println("OBJECTION! my name is " + this.name);
    }

}
