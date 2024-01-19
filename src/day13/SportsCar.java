package day13;

/*

    - (접근제한자 public/default) (final) class 클래스명{} // ★static은 객체 지향적이지 않음.(static하면 클래스가 하나가 되기때문)
    - (접근제한자 public/default/protected/private)(정적 static/ 인스턴스) (final) 타입 필드명;
    - (접근제한자 public/default/protected/private) 생성자(){} // ★static은 객체 지향적이지 않음.(static하면 클래스가 하나가 되기때문), final 하면 생성자를 변경할 수 없다는 뜻이므로 생성자에 할 필요가 없다.
    - (접근제한자 public/default/protected/private)(정적 static/ 인스턴스) (final) 반환타입 메소드명(){}

    - 지역변수 : 함수안에서 // 지역변수는 절대 static이 될 수 없네
        (final) 타입 변수명; >> 어차피 외부에서 못쓰므로 접근제한자는 못 쓰게해놨음(지역변수, 스택이기 때문에)

    - 정적멤버는 인스턴스멤버를 호출 할 수 없다.

*/

public class SportsCar extends Car{
    //1. final 없는 메소드이면 오버라이딩 가능
    @Override
    public void speedUp() {
        speed+=10;
    }
    //2. final 있는 메소드이면 오버라이딩 불가능
//    public void stop(){
//        System.out.println("스포츠카를 멈춤");
//        speed=0;
//    }
}
