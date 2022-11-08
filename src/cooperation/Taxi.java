package cooperation;

public class Taxi {
    int taxiNumber; //택시 번호
    int money; //수입
    int passengerCount; //승객수

    public Taxi(int taxiNumber){
        this.taxiNumber = taxiNumber;
    }

    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println("택시 " + taxiNumber +"번의 승객은 " + passengerCount +
                                                                    "명이고, 수입은 " + money + "원 입니다.");

    }
}
