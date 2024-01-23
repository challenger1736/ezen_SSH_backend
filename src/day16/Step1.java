package day16;

public class Step1 {
    public static void main(String[] args) {
        // 1. 인터페이스 변수 선언
        RemoteControl rc;
        // 2. 인터페이스 변수에 객체참조 값 대입
        rc = new Television(); // - 다형성 // RemoteControl rc = new Television();
            // 타입이 다른데 가능한 이유 : extends, implements
        // 3. 인터페이스의 메소드 호출하면 구현객체의 메소드가 호출된다.
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc = new Audio(); // - 다형성 (교체)
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // 인터페이스의 상수필드 호출
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);
    }
}
/*
    객체
        - 물리적으로 존재하거나 개념적으로 존재하는것 중에 식별이 가능한 것
        - 필드(=저장)/메소드(=행위/이벤트)를 구성
    클래스
        - 객체를 만들기 위한 설계도
        - 1. 라이브러리 클래스 2.실행클래스(main method)
        - 멤버(필드, 생성자, 메소드) 설계
        - 상속 : 필드/메소드를 물려받는 것 extends
                목적 : 1. 잘 만들어진 클래스를 가지고 와서 연장해서 새로운 클래스를 만든다(빠른 개발, 유지보수)
                      2. 다형성을 만들어 낼 수 있다.(자바의 다형성은 클래스적으로 말하기로 약속한 것이다.)(타입변환 + 오버라이딩)
                            - 요즘에 다형성 많이 쓰다보니(클래스들의 연관성, 규모가 커져서) 부모의 메소드를 안쓰고 물려받은 자식 메소드들이 재정의 하는 경우가 많다.
            추상abstract 클래스 (통합)
                        - 서로 다른 여러개 클래스들의 필드/메소드들의 공통부분을 추출.
                        - 객체 생성 불가능
                        1. abstract 클래스명{} - 선언방법
                        2. 추상메소드 :
                                1. 전제조건1 : 추상클래스에서만 가능
                                2. 전제조건2 : abstract 반환타입 메소드명(); //구현 안할거라서 {}중괄호 안씀


    인스턴스
        - 클래스를 이용한 객체를 실제 구현한 것
    인스턴스화
        - 인스턴스 만드는 작업 ( = new )


책의 중요 point
304~ (클래스) 타입변환
312~ (클래스) 다형성
---
368~ (인터페이스) 타입변환
373~ (인터페이스) 다형성 // 인터페이스 선언하는것 = 인스턴스가 없다. 메소드영역에만 존재한다고 선언하는 것!

*/
