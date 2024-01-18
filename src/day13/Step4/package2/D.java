package day13.Step4.package2;

import day13.Step4.package1.A;

public class D extends A {
    public D(){
        super();
    }
    public void method1(){
        this.field = "value"; // 부모자식 관계로 부르는건 가능
        this.method();
    }
    public void method2(){
//        A a = new A(); // 직접 생성은 불가능
//        a.field = "value"; // 직접 생성은 불가능
//        a.method(); // 직접 생성은 불가능
    }
}
