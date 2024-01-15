package day07;

// ================================= 클래스 용도 : 2.실행클래스 ==================================/
public class
Step2 { // cs
    public static void main(String[] args) { // ms

        //p.215
        // 1. 객체 생성
            // 1. new
        //new
            // 2. 생성자/클래스명
        //new 생성자/클래스명()
            // 3. 생성된 객체의 주소값을 변수에 대입(호출용)
        // 함수 안에 있으므로 지역변수
        //Car yourCar;
            // +
        Car myCar = new Car();
        //Car. 점 찍어봤자 뭘 쓸 수가 없음, 종이 쪼가리 설계도라서.
        // 그래서 실제로 다루기 위해서 객체를 만듬

        System.out.println("모델명 = " + myCar.model);
        System.out.println("시동여부 = " + myCar.start);
        System.out.println("현재속도 = " + myCar.speed);

        Car yourCar = new Car();

        System.out.println("모델명 = " + yourCar.model);
        System.out.println("시동여부 = " + yourCar.start);
        System.out.println("현재속도 = " + yourCar.speed);

        //p.217
        //* 필드는 객체의 데이터 이므로 객체가 존재하지 않으면 필드도 존재하지 않는다.
        // 지금 Car2.company 이렇게 쓸 수 없다.
            // 1. 객체 생성
        Car2 mycar2 = new Car2();
            // 2. 객체내 필드 호출
        System.out.println(new Car2().maxSpeed); // 이렇게도 되네 // . 이 어디 쓰이나를 보기
        System.out.println("제작회사 = " + mycar2.company);
        System.out.println("모델명 = " + mycar2.model);
        System.out.println("색깔 = " + mycar2.color);
        System.out.println("최고속도 = " + mycar2.maxSpeed);
        System.out.println("현재속도 = " + mycar2.speed);   // 350
            // 3. 객체내 필드의 값 수정
        mycar2.speed = 60;
        //mycar2 = new Car2(); 이걸 한번 더 넣으면 다시 또 350
        System.out.println("현재속도 = " + mycar2.speed);
        // ================
        Car2 yourCar2 = new Car2();
        System.out.println("제작회사 = " + yourCar2.company);
        System.out.println(yourCar2.company==mycar2.company);
        // 리터럴이 문자열이기 때문에 문자열은 그 자체로 주소값과 비슷한 기능을 가지므로 문자열끼리 같다고 해도 true로 나온다.
        // 생성자 안에서도 실험 해볼것.
        System.out.println(new Car2("현대자동차"));
        System.out.println(new Car2("현대자동차").company== new Car2("현대자동차").company);
        // 이것도 참이네(true)
        System.out.println(yourCar2.company == new Car2("현대자동차").company);
        // 이것도 참이네(true) // 공유하기 싫으면 new String("현대자동차")
        System.out.println("현재속도 = " + yourCar2.speed);


    }
}
