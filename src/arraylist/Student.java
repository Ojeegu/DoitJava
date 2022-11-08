package arraylist;

import java.util.ArrayList;

public class Student {
    int studentId;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String subjectName, int scorePoint){
        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setScorePoint(scorePoint);
        subjectList.add(subject);
    }

    public void showStudentInfo(){
        int total = 0;
        for(Subject s : subjectList){
            total += s.getScorePoint();
            System.out.println("학생 " + studentName + "의 "
                                + s.getSubjectName() + " 과목 성적은 " + s.getScorePoint() + " 점 입니다.");
        }
        System.out.println("학생 " + studentName + "의 총점은 " + total + "점 입니다.");
    }

}
