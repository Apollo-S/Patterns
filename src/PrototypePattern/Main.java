package PrototypePattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cache cache = new Cache();
        Student student = new Student("Mike", 25);
        cache.setStudent(student);

        Student clonedStudent = cache.getStudent();
        System.out.println(clonedStudent);
        System.out.println(clonedStudent.equals(student));
    }
}
