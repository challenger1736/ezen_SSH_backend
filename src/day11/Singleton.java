package day11;

public class Singleton {
    // - 단 하나의 객체를 만드는 방법 제공
        // - 기능, 서비스적인 메소드들( 로그인, 계좌 생성 등등 ), 단 모델들 저장하는 것들은 주로 아니다.
    // 1. 생성자를 외부로부터 호출 불가능으로 만든다.
    private Singleton(){} // 생성자만 못부르게! new Singleton 이 안된다.
    // 2-1. 필드에 미리 객체 만든다.
    // Singleton singleton = new Singleton();
    // 2-2. 필드에 직접적인 접근을 만든다.
    //private Singleton singleton = new Singleton();
    // 2-3. 필드 정적멤버(인스턴스 생성 불가능하게 하려고)
    private static Singleton singleton = new Singleton(); // 내부에서 스스로 하나를 만드는데!!! 이게 핵심!!

    // 3. 필드 간접접근을 이용한 싱글톤 반환/리턴
    public static Singleton getInstance(){
        return singleton;
    }

}
