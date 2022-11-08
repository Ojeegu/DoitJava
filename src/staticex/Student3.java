package staticex;

public class Student3 {
    private static int serialNum = 1000;
    int studentID;
    String studentName;
    int studentCard;

    public Student3(){
        serialNum++;
        studentID = serialNum;
        studentCard = studentID + 100;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public static int getSerialNum(){
        return serialNum;
    }
}
