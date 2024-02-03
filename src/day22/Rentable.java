package day22;

public interface Rentable <P>{ // 인터페이스도 제네릭타입 가능.
    P rent(); // public abstract 이 생략된 것. // 메소드 반환타입이 P인 rent메소드
    // 구현 클래스 : 추상메소드의 실행부를 오버라이딩 // 추상메소드의 반환타입 정의도 함! (제네릭으로)
}
