package day11.exam01.pakcage1;

public class A2 {

    // 필드와 메소드 접근제한자
    public int field1;   //public 필드
    int field2;          //default 필드
    private int field3;  //private 필드

    public A2(){ // 생성자는 무조건 이름이 같다 (클래스와!) 아니면 인식이 안됨.
        field1 = 1; // 가능
        field2 = 1; // 가능
        field3 = 1; // 가능

        method1(); // 가능
        method2(); // 가능
        method3(); // 가능
    }

    public void method1(){}
    void method2(){}
    private void method3(){}

    // 생성자의 접근 제한자 확인
    public A2(boolean b){}  //public 생성자
    A2 a1 = new A2(true); // 내부에서 생성자 호출 가능

    A2(int b){}         // default 생성자
    A2 a2 = new A2(1);      // 내부에서 생성자 호출 가능

    private A2(String s){}   // private 생성자  ( 같은 클래스 내에서만 가능 )
    A2 a3 = new A2("문자열");   // 내부에서 생성자 호출 가능
}
