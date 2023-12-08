import java.util.Objects;

public class People {
    String name;

     int age = 15;

    public People(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public boolean equals(Object object) {
//        if (this == object) {
//            return true;
//        }
//
//        if (object == null || getClass() != object.getClass()) {
//            return false;
//        }
//
//        People people = (People) object;
//
//        return name != null ? name.equals(people.name) : people.name == null;
//    }

    @Override
    public int hashCode() {
//        return Objects.hash(name);
         return Objects.hash(name) % 2;
    }


    public static void main(String[] args) {
        int count= 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

            }
        }

        int num1 = 5, num2 = 6;

        int result;


        result = (num1 + num2 != 11) ? num1 : num2;

        System.out.println(result);
    }


}
