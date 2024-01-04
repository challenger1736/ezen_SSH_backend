package day03; // 패키지 이름

public class Step1 { //class s
    public static void main(String[] args) { // 메인 함수

        //1. 변수 : 하나의 값 저장하는 메모리 공간, 1.타입 2.변수명 3.대입 4.초깃값
            // 타입 : boolean, byte , short, int, long, float, double, char, String
        //2. 출력함수                   //출력시 사용
            // 1. System.out.print();
            // 2. System.out.printIn() ; sout
            // 3. System.out.printf()  ; soutf
        //3. 입력객체/함수               //입력시 사용
            // Scanner scanner = new Scanner(System.in);
            // scanner.next()

        int x = 10; int y = -3;
        //1.산술연산자   ( 결과 : 값 )
        System.out.println("x+y : "+(x+y));
        System.out.println("x-y : "+(x-y));
        System.out.println("x*y : "+(x*y));
        System.out.println("x/y : "+((double)x/(double)y));
        System.out.println("6/10 : "+(6/10));
        System.out.println("6/10 : "+(6.0/10.0));
        System.out.println("x%y : "+(x%y));
        //2.비교연산자   ( 결과 : boolean )
        System.out.println("x==y : "  +(x==y));
        System.out.println("x!=y : "  +(x!=y));
        System.out.println("x>y : "  +(x>y));
        System.out.println("x>=y : "  +(x>=y));
        System.out.println("x<y : "  +(x<y));
        System.out.println("x<=y : "  +(x<=y));

        //3.논리연산자  ( 결과 : boolean )
        System.out.println("10<x<20"+(x>10&&x<20));
        //System.out.println("y==10 또는 ==20")+(y==10 || y==20);
        System.out.println();
        //4.증감연산자
        System.out.println(" x++ : "+(x++));
        System.out.println("x : " + x);
        System.out.println("++x : "+(++x));
        System.out.println("x-- : "+(x--));
        System.out.println("x : "+x);
        System.out.println("--x : "+(--x));
        //5.(복합)대입연산자
        x = 30; // = 오른쪽 값을 왼쪽에 대입
        x += 10; // x에 10을 더한후에 x에 연산 결과 대입
        // -= , *=, /=, %=
        
        //6.삼항연산자
            // 조건? 참: 거짓
            // 조건1? 참1: 조건2? 참2 : 거짓
        String 결과 = x >= 90 ? "합격" : "불합격";
        System.out.println("결과 = " + 결과);

        //7.연결연산자
        //""+""

    } // 메인 끝
}   // class e
