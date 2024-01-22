package day15;

public class Driver { // 운전자 사람.
    // 메소드(객체의 행위) / 매개변수로 운전할 매개체(버스/택시)
    public void drive(Vehicle vehicle){
        vehicle.run();
        // - 자식타입으로 다시 변환. 강제타입 변환(캐스팅)
        // !!! :
        // 객체 instanceof 타입 : 인스탄스 객체의 타입 확인. True False 로 boolean형태로 나옴.
        System.out.println(vehicle instanceof Bus ? "버스타입" : "택시타입");
        System.out.println(vehicle instanceof Taxi ? "택시타입" : "버스타입"); // 앞 코드를 못 여는 회사들에가면 타입을 모르므로 이런식으로 instanceof로 객체의 타입을 알 수 있다.
        System.out.println(vehicle instanceof Object); // Object안에 모든게 다 들어있으니까,,

        Bus bus2 = new Bus();
        System.out.println(bus2 instanceof Vehicle); // 부모가 더 넓은 범위.
    }
}
