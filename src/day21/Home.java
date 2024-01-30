package day21;

public class Home {

    // 1. 필드에 익명 구현 객체 대입
        // 1. 인터페이스는 추상메소드만 존재하므로 객체 생성 불가.
    private RemoteControl rc = new RemoteControl() {
        //필드
        int a = 0; // 됨
        //생성자X
        //메소드O
        public void method1(){}
        //메소드 오버라이딩 필수
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    public void use1(){
        rc.turnOn();
        rc.turnOff();
    }

    public void use2(){
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨을 끕니다.");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl rc){
        rc.turnOn();
        rc.turnOff();
    }

}
