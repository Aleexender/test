public class Student extends Teacher{
    int fool;
    int knowledge;
     public void study(){
         System.out.println("study");
     }

     public Student(){
         super(5);
         System.out.println("my knowledge is " + super.knowledge);
     }
}
