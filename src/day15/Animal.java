package day15;

public abstract class Animal {

    //1.ㅁㅅㄷ의 선언
    public void breathe(){
        System.out.println("숨을 쉽니다.");
    }

    //2. 추상메소드의 선언.
        // 1 클래스가 추상클래스이면 선언가능.
    public abstract void sound();
}
