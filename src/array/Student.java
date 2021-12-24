package array;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;
    ArrayList<Subject> subjectArrayList;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        subjectArrayList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);

        subjectArrayList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        for(Subject subject : subjectArrayList){
            total += subject.getScore();
            System.out.println(studentName + "학생의 " + subject.getName() + " 과목의 성적은 " + subject.getScore() + "점 입니다.");
        }
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }
}
