package day11.exam01.pakcage1.sub;

import day11.exam01.pakcage1.A2;

public class D2 { // 하위 패키지에 있는 D2 클래스
    A2 a2 = new A2();

    public D2(){ // 생성자는 무조건 이름이 같다 (클래스와!) 아니면 인식이 안됨.
        a2.field1 = 1; // 가능
        //a2.field2 = 1; // default 가능
        // a2.field3 = 1; // private 불가능

        a2.method1(); // 가능
        //a2.method2(); // default 가능
        // a2.method3(); // private 불가능
    }
}
