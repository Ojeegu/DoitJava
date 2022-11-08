package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas", 10000);
        Student studentEdward = new Student("Edward", 12000);

        Bus bus100 = new Bus(100);
        studentJames.takeBus(bus100);
        studentJames.showInfo(); //제임스의 정보(student 클래스)
        bus100.showInfo(); //버스100의 정보(bus 클래스)

        Subway subway2 = new Subway(2);
        studentTomas.takeSubway(subway2);
        studentTomas.showInfo(); //토마스의 정보(student 클래스)
        subway2.showInfo(); // 서브웨이2의 정보(subway 클래스)

        Taxi taxi7777 = new Taxi(7777);
        studentEdward.takeTaxi(taxi7777);
        studentEdward.showInfo();
        taxi7777.showInfo();
    }
}
