package day04;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 입력 객체
        boolean run = true; // 무한루프의 상태를 저장하고 있는 변수
        int speed = 0;

            while (run) {

                System.out.println("----------무한 반복중----------");
                System.out.println("1. 증속 | 2. 감속 |  3. 중지 "); // 메뉴판. !!!
                System.out.println("-----------------------------");
                System.out.print("선택 : ");
                //
                String strNum = scanner.nextLine(); //무한 입력 넥스트 라인은 입력 할때까지 대기상태로 있는거라서 한턴마다 멈춤

                if (strNum.equals("1")) {
                    run = true;
                    speed++;
                    System.out.println("현재 속도 =" + speed);
                } else if (strNum.equals("2")) {
                    speed--;
                    System.out.println("현재 속도 =" + speed);
                } else if (strNum.equals("3")) {
                    run = false; // run으로 다시 이동 false라서 거기서 다시 32번줄로
                }//2. 32번줄 이동
                //break; // 가장 가까운 반복문 탈출 키워드 ; 현재 기준에서는  가장 가까운 반복문 무한루프 이니까.
                // 3. 함수{} 나가기 -> 45번줄 이동
                //return; // 현재 함수 종료.
            }


//        System.out.println("----------무한 반복중----------");
//        System.out.println("1. 증속 | 2. 감속 |  3. 중지 "); // 메뉴판. !!!
//        System.out.println("-----------------------------");
//        System.out.print("선택 : ");
//        //
//        String strNum = scanner.nextLine();
//
//
        //무한 루프 활용
        /*
         
            무한루프 = 무한반복
                1. while(true){}
                2. boolean run = true;
                    while (run){}
             
        */
    }




    }
