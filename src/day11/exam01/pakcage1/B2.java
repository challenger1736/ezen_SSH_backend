package day11.exam01.pakcage1;

public class B2 {

    A2 a2 = new A2();

    public B2(){ // 생성자는 무조건 이름이 같다 (클래스와!) 아니면 인식이 안됨.
        a2.field1 = 1; // 가능
        a2.field2 = 1; // 가능
        // a2.field3 = 1; // private 불가능

        a2.method1(); // 가능
        a2.method2(); // 가능
        // a2.method3(); // private 불가능
    }


    // 생성자의 접근 제한자 확인
    A2 a1 = new A2(true); //public 생성자  가능
    A2 a22 = new A2(1);       //default 생성자  가능
    //A2 a3 = new A2("문자열"); // // private 생성자 불가능  ( 같은 클래스 내에서만 가능 )
}
