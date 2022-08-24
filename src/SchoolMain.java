public class SchoolMain {
    public static void main(String[] args) {
        Teacher teacher = new Student("철수");
        Student student = (Student) new Teacher(); // 캐스팅
        student.teach();
        student.study();
    }
}
