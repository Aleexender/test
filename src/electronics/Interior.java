package electronics;

public interface Interior {

    void show();

    default String getInteriorName(){
        return this.getA();
    }

    default String getA(){
        return "A";
    }

}
