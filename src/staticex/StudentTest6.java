package staticex;

public class StudentTest6 {
    public static void main(String[] args) {
        Student3 studentLee = new Student3();
        studentLee.setStudentName("이지원");
        System.out.println(studentLee.getSerialNum());
        System.out.printf("%s 학번 : %d, 카드번호 : %d%n", studentLee.studentName, studentLee.studentID, studentLee.studentCard);

        Student3 studentSon = new Student3();
        studentSon.setStudentName("손수경");
        System.out.println(studentSon.getSerialNum());
        System.out.printf("%s 학번 : %d, 카드번호 : %d%n", studentSon.studentName, studentSon.studentID, studentSon.studentCard);
    }
}
