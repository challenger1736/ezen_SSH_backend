package day22;

public class Step2 {
    public static void main(String[] args) {

        // * 클래스 선언시 객체 필드의 타입을 다양하게 사용하기 위해.
        // - 1. 다형성의 특징 : 1.Object / 2.제네릭 <>
        // ArrayList 에 대한 정의 ArrayList는 제네릭이다.
        // ArrayList : 클래스
        // ArrayList<안에 넣을 타입>
            // 안에넣읕타입[] 배열을 만드는 구조.

        // 1. product클래스에 Tv타입, String타입 정의
        Product<Tv, String> product1 = new Product<>();
        /*
            product1 객체의 필드 상태
            private Tv kind;
            private String model;
         */

        // 2.
        product1.setKind(new Tv());// 해당 kind 필드가 tv타입이므로 tv객체 대입가능
        product1.setModel("스마트tv");// 해당 kind 필드가 String 타입이므로 String 객체 대입가능

        Tv Tv = product1.getKind();
        String model = product1.getModel();

        Product<Car, String> product2 = new Product<>();

        //product2.setKind(new Tv()); //  제네릭에서 정의한 타입이 다르므로 불가능
        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();

        System.out.println(car.toString());
        System.out.println(carModel);

    }
}
