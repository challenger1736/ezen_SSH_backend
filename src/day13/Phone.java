package day13;

/*

    상속
        1. 부모클래스의 필드/메소드를 자식클래스에게 물려받는다.
        2. 자식이 부모를 선택한다.
        3. 자식클래스 선언시 클래스명 뒤에 extends 부모클래스
        4. 자식클래스가 가질수 있는 부모의 개수는 1개 = 다중 상속 불가능
            1.

*/

public class Phone {
    // public/private static/인스턴스 final 필
    // public/private 생
    // public/private static/인스턴스 final 메
    public String model;
    public String color;




        // 1. 매개변수 x, 반환값 x
    public void bell(){
        System.out.println("벨이 울립니다.");
    }
        // 2. 매개변수 String, 반환값 x
    public void sendVoice(String message){
        System.out.println("자기 : "+ message);
    }
        // 3. 매개변수 String, 반환값 x
    public void receiveVoice(String message){
        System.out.println("상대방 : "+ message);
    }
        // 4. 매개변수 x, 반환값 x
    public void hangUp(){
        System.out.println("전화를 끊습니다.");
    }
}
