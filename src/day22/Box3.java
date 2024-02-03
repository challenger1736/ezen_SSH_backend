package day22;

public class Box3 <T>{
    // 제네릭 타입: 클래스 선언시 타입을 정하지 않고 객체 생성할 때 정의.
    // 1. 필드
    private T t; // t라는 필드 제네릭타입(정해져있지 않다.)

    // 2. 생성자
    // 3. 메소드

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

/*
    예
    Box3 <Integer> box = new Box<>();
    box{
        private Integer t;
        public Integer getT() { return t; }
    }
 */
