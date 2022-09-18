package practice;

public class PracticeOverideChild extends PracticeOverridePerson{

    @Override
    public void cry(){
        System.out.println("엉엉");
    }

    public void study(String a) {
        System.out.println("study");
    }
}
