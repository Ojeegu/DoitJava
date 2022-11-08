package singleton;

public class Company {

    private static Company instance = new Company(); //유일하게 사용될 변하지 않는 Company

    private Company(){}

    public static Company getInstance(){ //외부에서 instance를 가져다 쓸 수 있도록 메서드를 만듦
                                        //객체를 생성하지 않고 사용할 수 있도록 static을 붙임
        if(instance == null)
            instance = new Company(); //그럴리는 없겠지만 혹시 모르니 if를 쓸때도 있음(방어적인 코드)
        return instance; // instance를 반환해야하므로 리턴타입을 Company
    }
}
