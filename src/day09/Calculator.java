package day09;

public class Calculator {

    //클래스 멤버
        // 1. 필드
        // 2. 생성자 new와 함께 사용

    public Calculator() {
    }

    // 3. 메소드 .
            // 1. 리턴타입
            // 2. 함수명
            // 3. (매개변수, 매개변수)
            // 4. { 명령문/로직 }
            // 5. return
    void powerOn(){ // ms // 리턴타입을 넣으면 메소드, 리턴타입을 없으면 생성자. // 리턴을 해야 동작기능을 하지. // void는 return이 없다.
        // 1. void : 메소드가 호출한 곳으로 전달하는 결과값이 없다.
        // 2. 'powerOn()' : 함수명이고 카멜표기법 권장. ( 단 클래스 명을 쓰지말라 ) 어차피 클래스명은 앞에 대문자로 하는게 서약? 이므로 겹칠일은 없다.
        // 3. () : 메소드를 호출할 때 전달한 매개값을 받기 위한 곳
        // 4. {} : 메소드가 실행되는 구역
        // 5. return : 생략. (void니까) but return은 꼭 쓰는게 좋음. 어차피 값을 줄 수가 없다.
        System.out.println("전원을 켭니다.");

    }   // ms

    // 2.
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    // 매개 변수 2개있고 리턴: int값 인 상태
    int plus(int x, int y){ // 자바스크립트와 차이점 , 타입이 다 들어간다. int plus(){}, int x, int y 이런 식.
        // 1. int : 메소드를 호출한 곳으로 전달하는 결과 값의 타입이 int 라는 뜻.
        // 2. 함수명 plus
        // 3. (int x, int y) : 메소드를 호출할때 전달한 매개값(int x 와 int y)을 받기 위한 곳.
        // 4.
        // 5. void를  제외한 함수내 return은 한 개 이상 필수. 보이드는 return; 이라고 볼 수 있음.
        int result = x + y;
        return result;
    }

    double divide (int x, int y ){
        double result = (double) x / (double) y;
        return result;  // return 은 함수 종료하는 키워드 vs break : 반복문을 종료하는 탈출 코드 (*if는 아님.)
    }

}
