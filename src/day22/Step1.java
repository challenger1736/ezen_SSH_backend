package day22;



public class Step1 {
    public static void main(String[] args) {
        // 1. 특정 타입의 필드가 아닌 다형성을 이용한 다양한 타입의 필드;
        Box box = new Box();

        // Object타입 필드에 문자 데이터 대입
        box.content = "안녕하세요.";
        // 3. 꺼내기
        System.out.println(box.content);
        // String content = box.content; 부모가 자식으로 될 수 없기에, Object가 왼쪽의 String으로 변환할 수 없다.
        String content = (String)box.content;
        // - 혹여나 자식 클래스의 타입을 모르는 경우 instanceOf 연산자를 써라.
        // - 한계
        // Object타입 필드에 정수 데이터 대입
        box.content = 123;
        System.out.println(box.content);
        // int content2  = box.content;
        int content2 = (Integer)box.content;

        //------------------------------------------------------------//

        // 1. 클래스를 생성할 때 <T> 제네릭 타입 정의
        Box2<String> box2 = new Box2<String>();
        box2 = new Box2<>();

        box2.content = "안녕하세요.";
        System.out.println(box2.content);
        String content3 = box2.content;
        System.out.println( content3 );

        Box2<Integer> box3 = new Box2<>();

        box3.content = 123;
        int content4 = box3.content;

        //------------------------------------------------------------//

        // 만일 제네릭에 타입을 지정 안했을 때,
        Box2 box21 = new Box2(); // 제네릭이 Object가 된다.


    }
}
