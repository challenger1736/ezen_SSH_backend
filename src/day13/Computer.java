package day13;

public class Computer extends Calculator{

    /*

        오버라이딩 :
            - 부모에게 물려받은 메소드가 이상적으로 적합하면 좋지만, 아닐경우 자식이 쓰기 좋게 메소드에서 바꿔주는 역할.
                1. 물려받은 메소드를 재정의하는 것,

    */

    @Override
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircie() 실행");
        return Math.PI*r*r;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
