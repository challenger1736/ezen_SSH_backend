package day11.exam01.pakcage2;

import day11.exam01.pakcage1.B;

public class C {
    //A a; //같은 패키지내 디폴트 클래스 호출 불가능
    // 오류발생 : 디폴트 클래스는 다른 패키지에서 사용, 접근 불가.
    B b; // public 클래스는 다른 패키지 에서 사용가능.
}
