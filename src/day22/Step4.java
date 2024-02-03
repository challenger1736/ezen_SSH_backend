package day22;

public class Step4 {

    // 제네릭 메소드
    // <타입파라미터> 리턴타입 메소드명(매개변수){}
        // 1. <타입파라미터> : 함수안에서 사용할 타입파라미터
    // 1. 일반 메소드
    public static boolean boxing일반(String s){
        System.out.println(s);
        return false;
    }
    public static <T> boolean boxing2(String s){
        T t = null;
        System.out.println(t);
        System.out.println(s);
        return false;
    }

//    public static <T> Box3<T> boxing3(String s){
//        Box3<String> box = new Box3<>();
//        return box;
//    }
    public static <T> Box3<T> boxing4(T t){
        Box3<T> box = new Box3<>();
        box.setT(t);
        return box;
    }

    // 582p
    // 제네릭 메소드 : 제한된 파라미터
    public static <T extends Number> boolean compare(T t1, T t2){
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return v1 == v2;
    }

    public static void main(String[] args) {

        Box3<Integer> box1 = boxing4(100);
        int intValue = box1.getT();
        System.out.println("intValue = " + intValue);

        Box3<String> box2 = boxing4("홍길동");
        String strValue = box2.getT();
        System.out.println("strValue = " + strValue);

        boxing2("안녕하세요.");

        Box3<Car> box3 = boxing4(new Car());
        Car carValue = box3.getT();
        System.out.println(carValue);

        boolean result1 = compare(10,20);

        boolean result2 = compare(4.5,4.5);

//        boolean result3 = compare("안녕하세요", new Car()); // 안됨
        // Number를 extends했으므로 넘버만 들어갈 수 있다.

//        boolean result4 = compare(new Object(),new Object());

    }
}
