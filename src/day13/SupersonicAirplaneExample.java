package day13;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane(); // 자식 객체를 만들면 부모객체도 만들어져서
        sa.takeOff(); // 부모의 메소드 실행
        sa.fly(); // 내 메소드내의 부모 메소드 실행
        sa.flyMode = SupersonicAirplane.SUPERSONIC; // 내 메소드 실행 / static이라서 클래스명.필드명을 부를수 있다 (SupersonicAirplane.SUPERSONIC)
        sa.fly(); // 내 메소드 실행
        sa.flyMode = SupersonicAirplane.NORMAL; // 내 메소드 실행 / static이라서 클래스명.필드명을 부를수 있다 (SupersonicAirplane.NORMAL)
        sa.fly(); // 내 메소드내의 부모 메소드 실행
        sa.land(); // 부모의 메소드 실행
    }
}
