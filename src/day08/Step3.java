package day08;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(어떤 매개변수가 들어가는지 보임!) 다형성,
        //1. 기본생성자로 객체를 생성! 안됨 // 만들어서 됨
        Korean k3 = new Korean();
        System.out.println("k3 = " + k3);
        //k3.name = "이자바";  // private은 이렇게 넣기가 불가능함
        //k3.ssn = "880423-1234567"; // private은 이렇게 넣기가 불가능함
        //2. 정의된 생성자로 객체 생성
        Korean k1 = new Korean("박자바" ,"011225-1234567" );
        System.out.println("k1 = " + k1); //이건 주소값을 보는 것,
        // 이지만 toString쓰면 객체 정보 하나하나 보임.
        Korean k2 = new Korean("김자바" ,"930525-0654321" );
        System.out.println("k2 = " + k2);;
        //여러 프로그래밍 언어에서는 객체가 문자열로 변환될 때 자동으로 toString 메서드가 호출되기 때문에 toString을 생략해도 객체의 값들이 보인다.
        //객체의 주소대신 나오게하는 toString 메소드를 넣어놓으면 주소대신 값이 나온다.
    }
}
