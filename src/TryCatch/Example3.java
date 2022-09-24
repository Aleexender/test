package TryCatch;

public class Example3 {



        static void handlingException() throws Exception{

//            try {

                throw new Exception();

//            } catch (NumberFormatException e) {

//                System.out.println("호출된 메소드에서 예외가 처리됨!");
//
//            }

        }



        public static void main(String[] args) throws Exception {

//            try {
//
                handlingException();
//
//            } catch (Exception e) {
//
//                System.out.println("main() 메소드에서 예외가 처리됨!");
//
//            }

        }
}
