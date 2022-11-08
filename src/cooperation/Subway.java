package cooperation;

public class Subway {
    int lineNumber;
    int passengerCount;
    int money; //전철 수입

    public Subway(int lineNumber){
        this.lineNumber = lineNumber;
    }

    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.printf("%s호선의 승객은 %d명이고, 수입은 %d원 입니다.%n", lineNumber, passengerCount, money);
    }
}
