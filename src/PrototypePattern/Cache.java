package PrototypePattern;

public class Cache {

    private Student student;

    public Student getStudent() throws CloneNotSupportedException {
        return student.clone();
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
