package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Vasya");
        Teacher teacher = new Teacher("Maryvanna", "Java");
        teacher.evaluate(student);
    }
}
