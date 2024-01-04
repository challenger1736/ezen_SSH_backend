package day03;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        문제1 : 점수를 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력 하시오.
//        int Q1 = scanner.nextInt();
//
//        if (Q1 >= 90) {
//            System.out.println("\'합격\'");
//        } else {
//            System.out.println("\'불합격\'");
//        }
////
////        문제2 : 점수를 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급', 70점 이상이면 'C등급', 그외 '재시험' 으로 출력 하시오.
//
//        int Q2 = scanner.nextInt();
//
//        if (Q2 >= 90) {
//            System.out.println("\'A등급\'");
//        } else if (Q2 >= 80) {
//            System.out.println("\'B등급\'");
//        } else if (Q2 >= 70) {
//            System.out.println("\'C등급\'");
//        } else {
//            System.out.println("\'재시험\'");
//        }
////
////                문제3 : 임의의 정수 3개 를 입력받아서 오름차순 으로 3개의 변수를 출력하시오.
//        int Q3_1 = scanner.nextInt();
//        int Q3_2 = scanner.nextInt();
//        int Q3_3 = scanner.nextInt();
//        int temp;
//        if (Q3_1 >= Q3_2) {
//            temp = Q3_2;
//            Q3_2 = Q3_1;
//            Q3_1 = temp;
//        }
//        if (Q3_1 >= Q3_3) {
//            temp = Q3_3;
//            Q3_3 = Q3_1;
//            Q3_1 = temp;
//        }
//        if (Q3_2 >= Q3_3) {
//            temp = Q3_3;
//            Q3_3 = Q3_2;
//            Q3_2 = temp;
//        }
//
//        System.out.println(Q3_1 + ", " + Q3_2 + ", " + Q3_3);
//
//                문제4 : 가위바위보 게임 구현하기.
//                - 가위가 '0' 이고 바위가 '1' 이고 보가 '2' 일때 플레이어1와 플레이어2 가 있습니다.
//                - 승리자 판단과 무승부 경우의수를 출력하시오.
//      [입력 조건] 플레이어1 과 플레이어2 에게 각각 입력을 받습니다.
//     [출력 조건] 플레이어1 이기면 ' 플레이어1 승리 ', 플레이어2 이기면 ' 플레이어2 승리 ' 무승부 이면 '무승부' 출력 하시오.

        // 0 일떄 상대가 2이면 이김
        // 1 일때 상대가 0이면 이김
        // 2 일때 상대가 1이면 이김

//        System.out.print("플레이어1 : 가위 바위 보");
//        String 플레이어1 = scanner.nextLine();
//        System.out.print("플레이어2 : 가위 바위 보");
//        String 플레이어2 = scanner.nextLine();
//
//
//        if (플레이어1.equals("가위")) {
//            플레이어1 = String.valueOf(0);
//        } else if (플레이어1.equals("바위")) {
//            플레이어1 = String.valueOf(1);
//        } else if (플레이어1.equals("보")) {
//            플레이어1 = String.valueOf(2);
//        }
//
//        if (플레이어2.equals("가위")) {
//            플레이어2 = String.valueOf(0);
//        } else if (플레이어2.equals("바위")) {
//            플레이어2 = String.valueOf(1);
//        } else if (플레이어2.equals("보")) {
//            플레이어2 = String.valueOf(2);
//        }
//        if (플레이어1 == 플레이어2) {
//            System.out.println("무승부");
//        } else if (Integer.parseInt(플레이어1) == ((Integer.parseInt(플레이어2) + 1) % 3)) {
//            System.out.println("플레이어 1 승리");
//        }else {
//            System.out.println("플레이어 2 승리");
//        }
//    }

//
//        문제5 : 윤년/평년 판단하기
//                [ 입력조건 ] 하나의 연도를 입력 받습니다.
//   [ 윤년/평년 조건 ]
//        -연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
//        -연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다.
//        -연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.
//   [ 출력조건] '입력한OOOO년 은' 윤년 입니다.  혹은 평년 입니다 로 출력하시오.

//        int Q5 = scanner.nextInt();
//
//        if(Q5%4==0 && Q5%100==0 && Q5%400==0 ){
//            System.out.println("윤년");
//        }else if(Q5%4==0 && Q5%100==0){
//            System.out.println("평년");
//        }else if(Q5%4==0){
//            System.out.println("윤년");
//        }else{
//            System.out.println("일반");
//        }
//    }

//
//                문제6 : 주차 사용요금 계산하기
//                [ 선언 변수 조건 ] 입차시간이 14시30분 입니다. int 시 = 14;  int 분 = 30;
//   [ 입력 조건 ] 현재시간의 시 와 분을 입력받아 각 변수에 저장하시오. *단 입차 시간 이전 으로 입력 할 경우에는 '현재시간오류' 출력하시오.
//   [ 처리출력 조건 ] 1분당 1000원으로 계산하여 사용요금' 0000원' 을 출력하시오,
//
//        int 시 = 14;
//        int 분 = 30;
//        int 분계산 = 14 * 60 + 30;
//
//        int 현재시 = scanner.nextInt();
//        int 현재분 = scanner.nextInt();
//        int 분계산2 = 현재시 * 60 + 현재분;
//        if (분계산2 - 분계산 <= 0) {
//            System.out.println("현재시간오류");
//        } else {
//            System.out.println((분계산2 - 분계산) * 1000 + "원");
//        }


//
//        문제7 : 로그인 처리
//   [입력 조건] 아이디[문자열] 와 비밀번호[문자열] 를 입력받기
//   [처리출력 조건]
//        1. 아이디가 'admin' 이고 비밀번호가 '1234' 모두 동일하면 '로그인성공'
//        2. 아이디가 다르면 '아이디 정보가 일치하지 않습니다.'
//        3. 아이디는 일치하고 비밀번호가 다르면 '비밀번호 정보가 일치하지 않습니다'
        //"String".equals("비교용")


//
//        문제7 : 당첨번호 개수  찾기
//                [ 선언 변수 조건 ] int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9;
//   [ 입력 조건 ] 세개의 정수를 입력받아 각 변수에 저장하시오.
//   [ 출력 조건 ] 입력받은 세 정수 중에서 공1~공3 까지 동일한 번호 가 몇개 인지 출력하시오.
//        int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9;
//
//
//        int Q7 = scanner.nextInt();
//        int Q7_2 = scanner.nextInt();
//        int Q7_3 = scanner.nextInt();
//        int result = 0;
//        if(Q7 ==14 || Q7_2 ==14 || Q7_3==14){result++;}
//        if(Q7 ==21 || Q7_2 ==21 || Q7_3==21){result++;}
//        if(Q7 ==9 || Q7_2 ==9 || Q7_3==9){result++;}
//
//        System.out.println(result);

    }}

