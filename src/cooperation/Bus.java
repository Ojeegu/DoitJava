package cooperation;

public class Bus {
    int busNumber;
    int passengerCount;
    int money; //버스 수입

    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    public void take(int money){ // 승객이 버스에 탄 경우를 구현한 메서드
        this.money += money; //버스 수입 증가
        passengerCount++; //승객 수 증가
    }

    public void showInfo() {
        System.out.printf("버스 %d번의 승객은 %d명이고, 수입은 %d원 입니다.%n", busNumber, passengerCount, money);
    }
}
