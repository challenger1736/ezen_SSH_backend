package day13;

public class SmartPhone extends Phone{ // 부모 생성자가 힙으로 자동 하나 생성됨.
    public boolean wifi;


    public SmartPhone() {
    }

    public SmartPhone(String model, String color){
        super(); // 첫줄에 생략된 super(); 부모의 기본 생성자를 호출하는 것.
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

     public void internet(){
         System.out.println("인터넷에 연결합니다.");
     }
}
