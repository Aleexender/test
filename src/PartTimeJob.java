public class PartTimeJob {

    String name;
    int wage;
    String department;

    public void info(){
        System.out.println(this.name);
        System.out.println(this.wage);
        System.out.println(this.department);
    }
    PartTimeJob(String name,int wage, String department){
        this.name = "정훈";
        this.wage = 5000;
        this.department = "F&B";
    }
}
