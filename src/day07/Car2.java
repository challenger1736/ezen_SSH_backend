package day07;

public class Car2 {

    //클래스 멤버
    // 1. 필드
    String company= "현대자동차";// 공유하기 싫으면 new String("현대자동차")
    String model= "그랜져";
    String color= "검정";
    int maxSpeed= 350;
    int speed= 350;

    // 2. 생성자

    public Car2() {
    }

    public Car2(String company) {
        this.company = company;

    }
}
