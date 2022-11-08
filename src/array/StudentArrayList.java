package array;

import java.util.ArrayList;

public class StudentArrayList {
    public static void main(String[] args) {
        ArrayList<Student> studentArr = new ArrayList<Student>();

        studentArr.add(new Student(1001, "James"));
        studentArr.add(new Student(1002, "Tomas"));
        studentArr.add(new Student(1003, "Edward"));

        for(Student s : studentArr){
            s.showStudentInfo();
        }
    }
}
