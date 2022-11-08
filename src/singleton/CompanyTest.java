package singleton;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();

        System.out.println(c1);
        System.out.println(c2); //주소값 출력 시 c1,c2 동일
        System.out.println(c1 == c2);

        Calendar cal = Calendar.getInstance(); //싱글톤으로 제공되는 기능
    }
}
