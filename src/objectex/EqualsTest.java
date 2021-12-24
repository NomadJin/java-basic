package objectex;

import java.util.Objects;

class Student {
    int studentNum;
    String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentNum == student.studentNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNum);
    }
}

public class EqualsTest {

    public static void main(String[] args) {

        Student Lee = new Student(80, "이순신");
        Student Lee2 = Lee;
        Student Shin = new Student(80, "이순신");

        System.out.println(Lee == Shin);
        System.out.println(Lee.equals(Shin));
        System.out.println(Lee.hashCode());
        System.out.println(Lee2.hashCode());
        System.out.println(Shin.hashCode());
    }
}
