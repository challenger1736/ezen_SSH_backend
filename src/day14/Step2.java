package day14;

public class Step2 {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;
        // Parent parent = new Child(); 이런식으로 바로 우항의 자식을 좌항의 부모로 대입도 가능.! 우항은 좌항을 아니까. (우항부터 실행)

        parent.method1();
        parent.method2(); // 자식의 오버라이딩된 놈이 실행되게 해놨음, 자바가 그냥 해놓은 것.
//        parent.method3();

        //p.311~312 4
        System.out.println(parent.field1);
//        System.out.println(parent.field2);
        // 부모 타입에서 자식타입의 필드/메소드 사용불가.!! 이거 주의점!!

        // 5. 강제 타입변환
        Child child1 = (Child) parent;
        System.out.println(child1.field1);
        System.out.println(child1.field2);
    }
}
