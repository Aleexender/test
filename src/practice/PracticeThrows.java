package practice;

public class PracticeThrows{



    public static void asd() {
        Integer a = null;
        try{
            if(a.equals("a")){
                System.out.println("not error");
            }
//            throw new Exception();

        } catch (NullPointerException npe){

            System.out.println("error");

        }
    }

    public static void main(String[] args){

        try{
            asd();

        } catch(Exception e){

            System.out.println("error 404");

        }

    }
}
