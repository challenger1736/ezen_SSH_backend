package day11;

public class Step2 {
    public static void main(String[] args) {
        Car myCar = new Car();
        // speed 필드가 private 이므로 외부에서 접근 불가능
        // myCar.speed = -50;
        myCar.setSpeed(-50); // 유효성검사
        System.out.println("myCar.getSpeed() = " + myCar.getSpeed());
        myCar.setSpeed(60);
        System.out.println("myCar.getSpeed() = " + myCar.getSpeed());

        // 만약에 car 객체의 stop필드가 false이면
        if(!myCar.isStop()){
            myCar.setStop(true); // 멈춤.
        }

    }
}
