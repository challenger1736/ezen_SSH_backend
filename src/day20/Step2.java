package day20;

public class Step2 {
    public static void main(String[] args) {
        //RemoteControl2 인터페이스 변수 선언 및 구현 객체 대입
        RemoteControl2 rc = new SmartTelevision();
        // 인터페이스의 선언된 추상 메소드만 호출 가능
        rc.turnOn();
        rc.turnOff();
//        rc.search("안됨"); // 안되는 이유는 rc안에 안들어가니까. (자식따로 있는 메소드는 쓸 수 없다.)
        Searchable searchable = new SmartTelevision();
//        searchable.turnOn();
//        searchable.turnOff();
        searchable.search("https://www.youtube.com");
    }
}
