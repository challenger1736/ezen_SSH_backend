package day08;

public class Step2 {
    public static void main(String[] args) {
        
        // 1. 기본 생성자를 이용한 객체 생성
        //Car car1 = new Car(); // 클래스안에 정의생성자가 존재하면 자동으로 기본생성자를 사용할 수 없다.
            // 해결 : 클래스안에 기본생성자를 직접 만들자.
            // 1. 클래스명
            // 2. 변수명
            // 3. =
            // 4. new
            // 5. 생성자호출()
        // 2. 정의생성자를 이용한 객체 생성
        Car car2 = new Car("그랜저", "검정",250);
        System.out.println("car2.model = " + car2.model);// 필드와 this가 선언되어야 그랜저라고 나옴. 필드가 없어도 생성자 자체에서도 넣을 수는 있다.

    }
}
