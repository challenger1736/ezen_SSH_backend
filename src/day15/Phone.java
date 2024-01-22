package day15;

public abstract class Phone {       //클래스
                                    // 추상 클래스 : 서로 다른 클래스들의 공통적인 용으로만 쓸것을 선언하는 것!( 객체 자체로는 못 만듬 )
    //ㅍㄷ
    String owner;
    //ㅅㅅㅈ
    Phone(String owner){
        this.owner = owner;
    }
    //ㅁㅅㄷ
    void turnOn(){
        System.out.println("폰 전원을 킵니다.");
    }
    void turnOff(){
        System.out.println("폰 전원을 끕니다.");
    }
}
