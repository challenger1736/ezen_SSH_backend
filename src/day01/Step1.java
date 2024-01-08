package day01; // 현재 파일의 패키지(폴더) 위치

// 첫 글자 대문자 아닐 경우 오류 발생!
public class Step1 {    // 클래스 선언 // class start
    // public class : 클래스 선언 [ 자바는 클래스 단위 ]
        // - * 모든 코드는 클래스 안에서만 작성해야한다.
    // 클래스명 : Step1
        // * 숫자로 시작X, 공백X, 첫글자를 대문자!!!
    // {} : 클래스 블록/지역/정의하는 곳
    public static void main(String[] args) {

        // main : main() 메소드
        //{} : 메소드 블록/지역/정의하는 곳
        // * 실행하면 main() 메소드 블록이 실행된다. [ 프로그램의 진입/시작점 ]
            // - [선언말고] 실행코드는 무조건 main 안에서 시작한다.
            // - main()안에 main 스레드 포함되어있음. [ 스레드 = 코드를 읽는 흐름 ]

        System.out.println("안녕자바"); // <----> console.log
        // 콘솔에 출력하는 코드 [ JS : console.log ]
        // 한줄 주석
        /* 여러 줄 주석 */

        // 실행문 : 1.변수선언 2.변수 대입 3.메소드호출
            // 코드 ; 끝마침!! [ 생략시 오류 >>>> java: ';' expected ]
        System.out.println("asdf");
    }
} // class end

