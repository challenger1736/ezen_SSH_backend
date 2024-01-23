package day16;

// 클래스 : 일반 클래스가 인터페이스의 추상메소드를 구현했으면 구현클래스라고 함.
public class Television implements RemoteControl{
    // - implements 재정의한 메소드가 있어요! 라는 뜻.
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
}
