package day22;

public class Step3 {
    public static void main(String[] args) {
        // 대리점 객체 생성
        // Rentable 상록수대리점 = new HomeAgency();
        // but 문제점이 생길 수 있다. Rentable에 제네릭이 없기 때문에,
        HomeAgency 상록수대리점 = new HomeAgency();
        // 렌탈 요청
        Home home = 상록수대리점.rent(); // 반환 : new Home()
        home.turnOnLight(); // new Home().turnOnLight()

        
        // 대리점 객체 생성
        CarAgency 중앙대리점 = new CarAgency();
        // 렌탈 요청
        Car2 car2 = 중앙대리점.rent(); // 반환 : new Car2()
        // 렌탈된 객체 이벤트 실행
        car2.run(); // new Car2().run()
    }
}
