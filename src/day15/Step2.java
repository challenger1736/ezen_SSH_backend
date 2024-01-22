package day15;

public class Step2 {
    public static void main(String[] args) {
//        Phone phone = new Phone("홍길동"); // 객체를 만들수 없음
        SmartPhone smartPhone = new SmartPhone("홍길동");
        Phone phone1 = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

    }
}
// 클래스 : 라이브러리, 실행용도// 객체를 만들기위한 하나의 설계도

    /*
    *               클래스        vs      추상 클래스
    *               new가능      vs      new불가능
    *               객체생성O     vs      객체생성X
    *               부/자식/객체  vs      부모의클래스 용도
    * 목적:          객체 설계도    vs      필드/메소드 공통되는 특성을 추출 만든 클래스
    * 선언:          class 클래스명{}vs    abstract class 추상클래스명{}
    * 상속(extends):
    * */
