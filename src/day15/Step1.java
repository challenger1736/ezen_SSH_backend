package day15;

public class Step1 {
    public static void main(String[] args) {
        // 1. 객체 생성 // 운전자 1명 생성
        Driver driver = new Driver();
        Driver driver2 = new Driver();

        // 2. 객체 생성 버스 하나 생성
        Bus bus = new Bus();
        driver.drive(bus); // driver.drive(new Bus())와 동일 // 버스 운전

        Taxi taxi = new Taxi();
        driver.drive(taxi); // driver.drive(new Taxi())와 동일 // 택시로 변경

        driver2.drive(taxi); // 같은 택시를 2명이서 운행.

    }//me
}//ce
/*
 다형성 : 자동타입변환 + 메소드 오버라이딩
        1. 자동타입변환 : 자식 타입 -> 부모 타입
        2. 메소드 오버라이딩 : 자식타입에서 부모 타입의 메소드 재정의
    필드[클래스 멤버]의 다형성
    매개변수[메소드의 변수]의 다형성
        - 1 메소드 호출 정석
               얘를 이런식으로 호출 method1(1) ----> void method1(int a){}
                                method2(new Car())  ----> void method2(Car car){}
        - 2 타입이 달라도 자식객체를 호출할 수도 있다. (왜? 자동타입변환으로 지원이 되니까)
                예를들어) method2(new sportsCar())  ----> void method2(Car car){}
 */
