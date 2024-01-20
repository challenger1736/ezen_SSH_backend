package day10;

public class Step4 {
    public static void main(String[] args) {
        // 1 인스턴스 필드 호출
            // 인스턴스 필드 사용시 객체 필요 // Calculator cc = new Calculator();
        //System.out.println(Calculator.pi2); // 안됨, 메소드 영역에 클래스 호출 전까진 없음
        // 2 정적필드 호출 가능
        System.out.println(Calculator.pi); // 필드를 부를때는 클래스명.필드명 (스태틱이라 호출가능)

        double result1 = 10*10*Calculator.pi;

        // 1 인스턴스 메소드 호출
            // 오류 : 인스턴스 메소드 사용시 객체가 필요
        // Calculator.plus2(10,5);
        // 2 정적 메소드 호출
        int result2 = Calculator.plus(10,5);
        System.out.println("result2 = " + result2);
        int result3 = Calculator.minus(10,5);
        System.out.println("result3 = " + result3);

    }
}

/*
*  개발자 코드 작성(src폴더 .java) --컴파일러(javac)-->바이트 코트(out폴더 .class)
*             java문법                번역           바이트 파일
*                                                       |
*                                                       |
*                                                   클래스 로더(바이트코드 읽기(로딩))
*                                                       |
*                                                 (바이트코드 저장)
*                                                       |
*                                                       >
* =========================JVM=====================================
* 힙 영역                 스택 영역                     메소드 영역(정적/static 영역) : 공유하는 곳
* - 인스턴스 필드           -매개 변수, 지역 변수            -클래스 정보
*                                                           - 인스턴스 메소드
*                                                       - 정적 멤버
*                                                           - 정적 필드, 정적 메소드
*                                                           - 전역변수/필드
*
* */