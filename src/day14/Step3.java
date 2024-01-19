package day14;

public class Step3 {
    public static void main(String[] args) {
        Car myCar = new Car();
            // myCar.tire = null;

        myCar.tire = new Tire();
        myCar.run();
            // myCar.tire = Tire 객체 참조.

//        --------------------------- 다형성 ------------------------------

        myCar.tire = new HankookTire();
        myCar.run();
            // myCar.tire = HankookTire 객체 참조.

        myCar.tire = new KumhoTire();
        myCar.run();
            // myCar.tire = KumhoTire 객체 참조.

        myCar.tire = null; // 참조하고있던 부모와 자식들 모두 다 사라짐(자식이 생기면 부모도 생기기때문에 부모는 안보이지만 있음)
    }
}
