package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ivanov", "Inf");
        Student student = new Student("Romanov");
        teacher.evaluate(student);
    }
}
