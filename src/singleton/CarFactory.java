package singleton;

public class CarFactory {
    private static CarFactory instance = new CarFactory();

    private CarFactory(){}; // 디폴트 생성자

    public static CarFactory getInstance(){
        if(instance == null)
            instance = new CarFactory();
        return instance;
    }

    public Car createCar(){
        Car car = new Car();
        return car;
    }

}
