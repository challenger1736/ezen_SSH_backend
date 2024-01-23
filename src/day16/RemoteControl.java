package day16;

    // 추상클래스와 인터페이스를 사용하는 이유 : *다형성때문,,

public interface RemoteControl { // TV 와 AUDIO를 조작하는 리모컨에관한 컨셉
    // 추상메소드 : 서로 다른 객체들간의 공통적인 메소드를 추출한 것
        // - 1. 선언부만 작성하고 구현부는 하지 않는다.
        // - 2. 추상클래스의 추상메소드는 abstract를 명시하지만, interface의 추상메소드는 abstract의 생략이 가능하다
        // 텔레비전과 오디오의 공통적인 메소드 추출(= 전원버튼)

    // 구현 클래스가 필요하다 : 추상메소드를 구현한 클래스 (자식)
        // - 구현 클래스가 꼭 꼭 필요한 이유
        // 1. 추상클래스와 인터페이스는 스스로 객체를 생성할 수 없다.
    public abstract void turnOn();
    void turnOff(); // public abstract 쓰나 안쓰나 같다
    void setVolume(int Volume);

    // 상수 필드가 자동 된다. interface의 필드, public static final
            // = 인터페이스는 정적필드(상수필드 제외)와 인스턴스필드를 가질 수 없다
    int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0; // public static final 생략가능하다.
}

/*

    오버로딩 : 생성자/메소드에서 매개변수의 타입/개수/순서에 따라 여러개 선언하는 것.
    오버라이딩 : 메소드에서 extends/implements 한 클래스 내 메소드를 재정의하는 것.

 */
