package day13;

public class SmartPhoneExample {

    public static void main(String[] args) {

        //p 286
            //1. Smartphone  객체 하나 만듬 (+phone도 따라옴)
            // 왜?? SmartPhone 클래스의 객체를 생성했는데 Phone 멤버 호출이 가능한 이유,, extends 받았으니까.!!

        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
            //2. 객체내 필드 호출
        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);
            //3. SmartPhone 객체 내 필드를 호출
        System.out.println("와이파이 상태 : " + myPhone.wifi);

            //4.
        myPhone.bell(); // SmartPhone 객체 내에 있는 Phone의 메소드 호출
        myPhone.sendVoice("여보세요."); // SmartPhone 객체 내에 있는 Phone의 메소드 호출
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요."); // SmartPhone 객체 내에 있는 Phone의 메소드 호출
        myPhone.sendVoice("아~네 반갑습니다."); // SmartPhone 객체 내에 있는 Phone의 메소드 호출
        myPhone.hangUp(); // SmartPhone 객체 내에 있는 Phone의 메소드 호출

        myPhone.setWifi(true); // SmartPhone 객체 내에 SmartPhone 메소드 호출
        System.out.println("와이파이 상태 : " + myPhone.wifi); //변경후 호출
        myPhone.internet(); // SmartPhone 객체 내에 SmartPhone 메소드 호출
    }
}
