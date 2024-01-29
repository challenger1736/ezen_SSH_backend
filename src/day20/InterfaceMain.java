package day20;

public class InterfaceMain {
    public static void main(String[] args) {
        // 인터페이스 구현 객체 만들기
        InterfaceCImpl impl = new InterfaceCImpl();

        // 인터페이스 구현 객체가 자식과 부모 인터페이스에 모두 가능
        InterfaceA ia = impl;
        ia.methodA();
//        ia.methodB(); // 안됨
//        ia.methodC(); // 안됨

        InterfaceB ib = impl;
//        ib.methodA(); // 안됨
        ib.methodB();
//        ib.methodC(); // 안됨

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();

    }
}
