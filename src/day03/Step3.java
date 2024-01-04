package day03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        문제1 : 하나의 정수형으로  입력받아 7의 배수 이면 'O' 아니면 'X' 출력 하시오.
  /*      System.out.print("문제1 : ");
         int Q1 = scanner.nextInt();

        System.out.println(Q1%7 == 0 ? "\'O\'" : "\'X\'");

//        문제2 : 하나의 정수형으로  입력받아 홀수 이면 'O' 아니면 'X' 출력 하시오.
        System.out.print("문제2 : ");
        int Q2 = scanner.nextInt();

        System.out.println(Q2%2 ==1  ? "\'O\'" : "\'X\'");
//
//        문제3 : 하나의 정수형으로  입력받아 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.

        System.out.print("문제3 : ");
        int Q3 = scanner.nextInt();

        System.out.println(Q3%7 ==0 && Q3%2==0 ? "\'O\'" : "\'X\'");

//
//        문제4 : 하나의 정수형으로  입력받아 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.

        System.out.print("문제4 : ");
        int Q4 = scanner.nextInt();

        System.out.println(Q4%11 ==0 || Q4%2==0 ? "\'O\'" : "\'X\'");
//
//        문제5 : 두개의 정수형으로 입력받아 더 큰수 출력 하시오.

        System.out.print("문제5 1번째 수: ");
        int Q5 = scanner.nextInt();
        System.out.print("문제5 1번째 수: ");
        int Q5_2 = scanner.nextInt();

        System.out.println(Q5>Q5_2 ? Q5 : Q5_2);*/
//
//                문제6 : 정수형으로 반지름을 입력받아 원 넓이 출력 하시오. 소수점 둘째 자리 까지 출력하시오.
//                계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]

//        System.out.print("문제6 원의 반지름: ");
//        int Q6 = scanner.nextInt();
//        System.out.println(Q6*Q6*314/100);
//
//        문제7 : 실수형으로 두번 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
//        예) 54.5   84.3 실수 2개입력시 결과는   64.285714%

//        System.out.print("문제 7 실수형 첫번째 값");
//        float Q7 = scanner.nextFloat();
//        System.out.print("문제 7 실수형 나눌 두번째 값");
//        float Q7_2 = scanner.nextFloat();
//
//        int Q7_3 = (int)(Q7/Q7_2*1000.0);
//
//        System.out.println(Q7_3);
//        System.out.println(Q7_3/10.0+"%");



//
//                문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
//                계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2

//        System.out.print("문제 8 윗변");
//        float Q8 = scanner.nextFloat();
//        System.out.print("문제 8 밑변");
//        float Q8_2 = scanner.nextFloat();
//        System.out.print("문제 8 높이");
//        float Q8_3 = scanner.nextFloat();
//
//        Float 사다리꼴의넓이 = (float)((int)(((Q8+Q8_2)*Q8_3/2)*10)/10.0);
//        System.out.println("사다리꼴의 넓이 : " +사다리꼴의넓이);
//
//        문제9 : 키를 정수를 입력받아 표준체중 출력하기 , 정수형으로 출력하시오.
//                계산식) 표준체중 계산식 = > (키 - 100) * 0.9
//        System.out.print("키 : ");
//        int Q9 = scanner.nextInt();
//        System.out.println((int)((double)(Q9-100)*0.9));

//        문제10 : 키와 몸무게를 입력받아 BMI 출력하기 , 소수점 둘째 자리 까지 출력하시오.
//        계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))

//        System.out.print("키 : ");
//        float Q10_1 = scanner.nextFloat();
//        System.out.print("몸무게 : ");
//        float Q10_2 = scanner.nextFloat();
//
//        double a = Q10_2/(Q10_1/100*Q10_1/100);
//
//        System.out.println(((int)(a*100)/100.0));

//
//        문제11 : inch 를 입력받아 cm 로 변환하기  , 소수점 둘째 자리까지 출력하시오.
//                계산식) 1 inch -> 2.54cm
//        System.out.print("cm로 변환할 inch");
//        float Q11 = scanner.nextFloat();
//       // System.out.println((int)(Q11*254)/100.0+"cm"); 이건 요거로 제대로 하는게 어렵네,,
//        System.out.printf("cm : %.2f"  , Q11*2.54);
//
//        문제12:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오
//        계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %
//        System.out.print("중간고사 : ");
//        int Q12 = scanner.nextInt();
//        System.out.print("기말고사 : ");
//        int Q12_2 = scanner.nextInt();
//        System.out.print("수행평가 : ");
//        int Q12_3 = scanner.nextInt();
//
//        System.out.printf("계산 식 : %.2f %.2f %.2f" , Q12*0.3, Q12_2*0.3, Q12_3*0.4);

//
//                문제13 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
//        int x = 10;                                       1. x에 10 대입
//        int y = x-- + 5 + --x;
                                                // 2. 우항 먼저 : x-- 호출 10호출후 x-= 1 현재 x = 9
                                                            //+5 후 --x 호출(8), 현재 x값 8
                                                            // 총 23
//        printf(" x의 값 : %d , y의값 :  %d ", x, y)           x = 8 , y = 23
//
//        문제14 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기

//       System.out.print("나이");
//        int Q14 = scanner.nextInt();
//        System.out.println(Q14>=10? "학생": Q14>=20? "성인" : Q14 >= 40? "중년" : "몇 살이세요" );
        // 그러네 10부터 하면 안되네  // 조심해야함!!
        // 먼저 40세 이상부터 해야함
        
        //정답
        //System.out.println(Q14>=40? "중년": Q14>=20? "성인" : Q14 >= 10? "학생" : "몇 살이세요" );
//
//        문제15 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력
//
//        System.out.print("국어");
//        int Q15_1 = scanner.nextInt();
//        System.out.print("영어");
//        int Q15_2 = scanner.nextInt();
//        System.out.print("수학");
//        int Q15_3 = scanner.nextInt();
//
//        int 총점 = Q15_1+Q15_2+Q15_3;
//        System.out.println("총점 = " + 총점);
//        double 평균 = (int)(총점/3.0*100)/100.0;
//        System.out.println("평균 = " + 평균);


//        문제16 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력
//              문자열 equals 사용법 // 비교하려는것1.equals(비교하려는것2)
        System.out.print("아이디 : ");
        String Q16_1 = scanner.nextLine();
        System.out.println(Q16_1);
        System.out.print("비밀번호 : ");
        int Q16_2 = scanner.nextInt();
        System.out.println(Q16_1.equals("admin") && Q16_2== 1234  ? "로그인성공" : "로그인실패");

//        문제17 : 3개의 정수형으로 입력받아 가장 큰수 출력

        System.out.print("문제17 : 정수 1");
        int Q17_1 = scanner.nextInt();
        System.out.print("문제17 : 정수 2");
        int Q17_2 = scanner.nextInt();
        System.out.print("문제17 : 정수 3");
        int Q17_3 = scanner.nextInt();

//        int b = Q17_1>=Q17_2 && Q17_1>=Q17_3 ? Q17_1 : Q17_2>=Q17_1 && Q17_2>=Q17_3 ? Q17_2 : Q17_3;
//
//        System.out.println(b);
    }
}
