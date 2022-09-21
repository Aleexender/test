package practice;

public class PracticeOverideChild extends PracticeOverridePerson{

    @Override
    public int cry(){
        System.out.println("엉엉");
        return 1;
    }

    public void study(String a) {
        System.out.println("study");
    }
}
