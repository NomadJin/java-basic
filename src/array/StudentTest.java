package array;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        Student studentKim = new Student(1002, "Kim");

        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 80);

        studentKim.addSubject("국어", 90);
        studentKim.addSubject("수학", 90);

        studentKim.showStudentInfo();
        studentLee.showStudentInfo();
    }
}
