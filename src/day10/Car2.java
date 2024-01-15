package day10;

public class Car2 {
    
    //멤버
    //1.정적/인스턴스 필드
    int speed;
    static int speed2;
    //2.생성자
    //3.정적/인스턴스 메소드
    void run() { // 인스턴스 메소드
        System.out.println(speed + "으로 달립니다.");
    }

    static void simulate(){ // 정적 메소드
        //System.out.println(this.speed); //static메소드에서 인스턴스필드 호출 불가능
        System.out.println(speed2); //  static메소드에서 static 필드 호출 가능
        Car2 myCar = new Car2();
        myCar.speed = 200;
        myCar.run();
        // this는 해당 메소드를 실행한 객체의 주체가.
        // static 객체없이 사용하는 메소드 이니까, 곧 그 뜻은 this를 쓸 수 없다. 는 뜻.
    }
    void simulate2(){ // 인스턴스 메소드
        System.out.println(this.speed); // 인스턴스메소드에서 인스턴스필드 호출 가능
        System.out.println(speed2); //  인스턴스메소드에서 static 필드 호출 가능
    }

    public static void main(String[] args) { //main함수는 클래스없이 자바의 시작점이므로 정적메소드로 사용.
        simulate(); // static구역에서 static 구역 호출
        //simulate2();  // static구역에서 인스턴스 메소드 호출 불가능. / 해결책 - 객체만들자.
        new Car2().simulate2(); // 만들어서 호출하면 가능
        Car2 myCar = new Car2();
    }
}
