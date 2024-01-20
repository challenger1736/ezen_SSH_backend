package day09;

public class Step1 {
    public static void main(String[] args) {

        //  p.231
            //JS 코드를 읽어주는 역할 : HTML(JS) <--- 브라우저(프로그램[스레드])
            //JAVA 코드를 읽어주는 역할 : MAIN함수() <--- MAIN스레드
            // 1. 필드/메소드를 사용하기 위해서는 꼭!!! 객체가 필요하다
        //Calculator.powerOn(); // 안됨.
        // >> 객체를 생성해야지
        new Calculator();
            // ; : 명령문의 문장
        // new Calculator().powerOn(); 이렇게 써도 되지만,
        Calculator myCalc = new Calculator(); // 이런식으로 해주는게 하나의 new에 넣기 좋다.
        myCalc.powerOn();
            // *
        new Calculator().powerOn(); // 결국 똑같은 실행

        // 3. 메소드 호출하고 매개변수 전달.
            // - 매개변수 타입과 개수에 맞게 제공한다.
        myCalc.plus(5,6); // 세미 콜론을 만나서 11나온 리턴값은 사라짐.
        //myCalc.plus("5","6"); 이건 안됨 타입이 불일치
        System.out.println(myCalc.plus(5,6));
        int result = myCalc.plus(5,6);
        System.out.println("result = " + result);


        //4.
        int x = 10;
        int y = 4;
        double result2 = myCalc.divide(x,y);
        // 생각해보니 스택은 하나하나 개별적으로 있으므로 여기있는 int x 와 저기 Calculator에 있는 int x 는 다른 매개변수로서 다른 스택에 적용된다.
        System.out.println("result2 = " + result2);

        //5.
        myCalc.powerOff();
        result2 = myCalc.divide(x,y);
        System.out.println("result2 = " + result2);


    }
}
/*
*
*   데이터 타입
*       - 기본타입
*           int, 등..
*       - 참조타입(클래스/인터페이스/배열 등등..)
*           클래스 만든다. -> 타입 만들기.
*
*   클래스(틀)/ 참조타입
*       - 클래스 : 객체를 정의하는 설계도/틀
*               - (필드)데이터/메소드 들을 반복적으로 사용하기 위해 만든 어떠한 형식(틀)
*       - 객체 : (힙영역)
*       - 객체 만드는 과정
*               개발자(클래스 작성) --> 인스턴스화(new) --> 인스턴스화(객체)
*
*               1. 클래스 작성
*                       class 클래스명(필드, 생성자, 메소드)
*               2. 객체 생성
*                       new 생성자명();
*               3. 변수가 필요한 이유 : 객체 참조할려고.
*                       클래스 변수명 = new 생성자명();
*       - new 연산자
*               - 생성자는 객체를 생성할때 초기화를 하는 역할  --> 그래서 클래스마다 무조건 1개이상 존재.
*                           - 기본 생성자:자동으로 생성되는 생성자.
*                           - 정의 생성자:직접 작성한 생성자.
*               - 생성자가 만들어낸 객체의 주소/참조 값을 리턴
* 
*       - 주의할 점
*               변수 : stack영역 에 할당되는 메모리공간 / 함수 안에서 선언 / 함수 밖으로 나갈수 없음.
*               필드 : heap영역 에 할당되는 메모리공간 / 함수 밖이면서 클래스 안에서 선언 /// 불러내면 메모리가 할당됨. 힙영역이기 때문에.
*
*       int a = 10;            int a = 10;
*                              double b = 10.5; >> 묶어주고 싶은데? >> 클래스를 만든다.
*                                           class 틀{
*                                                   int a
*                                                   double b }
*                              예) 매머드 커피* 
*                       무엇을 저장할지 고민부터 해야 클래스를 만들지 말지 알 수 있다.*
*                                   카테고리이름 제품이름 제품소개 제품가격 옵션1HOT/ICED 옵션2SIZE 옵션3텀블러유/무 수량
*
*                               객체쓰는 이유 : 묶어주려고, 하나의 모양으로 만들어주기 위해서
*                                   제품클래스                   장바구니클래스
    *                                   카테고리이름                옵션1HOT/ICED
    *                                   제품이름                   옵션2SIZE
    *                                   제품소개                   옵션3텀블러유/무
    *                                   제품가격                   수량
*
*
*
*
*
* main {
*           int a = 10;
*           int b = 20;
*           divide(a,b);
*
*           Car car = new Car(); // 102 번지가 들어가 있다고 치면
*           speed(car) // car는 new Car()의 주소를 참조하고 있음. 결국 스택을 전달하는게 아니라 new Car()의 주소를 전달하는 것이지.
* }
* divide(int c , int d ){
*       print(c) => 10 //a
*       print(d) => 20 //b
* }
*                                   // int a 스택과 int c의 값은 같다. 하지만 a와 c의 스택영역은 다르다.
*
*speed (Car Car2){
*       print(car2) => 그러면 얘는 102번지를 프린트 출력한다.
* }
*                                   // car 와 car2가 참조하는 객체는 같지만. 스택변수는 다르다.
*
*
*
*
*
*
*
*
* */