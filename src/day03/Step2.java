package day03; // 패키지

import java.util.Scanner;
public class Step2 {    // 클래스
    public static void main(String[] args) { // 메인 함수
        // 객체 사용 이유 : 속성/메소드를 패키지화 시킴, 풍부한 라이브러리(클래스=설계도)
        Scanner scanner = new Scanner(System.in);
            
            //1.코테 2.활용
            
        // 예제1 : 작성자, 내용, 날짜 3가지를 문자로 입력받아 출력
            //1. 입력
            System.out.print("작성자 : "); // 와우 이렇게 하면 안내문구 나옴
            String 작성자 = scanner.next();
            System.out.print("내용 : ");
            String 내용 = scanner.next();
            System.out.print("날짜 : ");
            String 날짜 = scanner.next();
            //2. 입력받은 데이터 출력 ( = 변수 써야해 )
            System.out.printf("============ 방문록 ============\n");
            System.out.printf("%4s %10s %20s %10s\n" , "번호" , "작성자", "내용", "날짜");
            System.out.printf("%4s %10s %20s %10s\n" , 1 , 작성자, 내용, 날짜);

            System.out.println("============ 방문록 ============");
            System.out.println("번호 | 작성자 | 내용 | 날짜");
            System.out.println(1 +" | "+작성자+" | "+ 내용 + " | "+ 날짜);

        //System.out.printf(); // %s = string , %d = 정수 , %f = 실수


            // 예제2 : 기본급과 수당 정수로 입력받아 실수령액 계산해서 출력
                    // 실수령액 : 기본급 + 수당 - 세금[기본급10%]
                //1. 입력
            System.out.print("기본급 : ");
            int 기본급 = scanner.nextInt();
            System.out.print("수당 : ");
            int 수당 =  scanner.nextInt();

                //2. 처리
            int 실수령액 = (int)(기본급 + 수당- (기본급*0.1));
            // 또는 int 실수령액 = 기본급 + 수당- (int)(기본급*0.1);
                // 오류 나는 이유 : int * double의 결과는 double
                // 그래서 double을 int에 대입할 수 없다. 강제 캐스팅을 해야한다. (int)로
                //3. 출력
        System.out.println("실수령액 = " + 실수령액);



    } // 메인 e
}   // 클래스 e
