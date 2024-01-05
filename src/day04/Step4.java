package day04;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalMoney = 0;
        boolean run = true;
        while (run){
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");

            System.out.print( "선택 > ");
            int list = scanner.nextInt();


            if (list == 1){
                System.out.print( "예금액 > ");
                int money = scanner.nextInt();
                totalMoney += money;
            } else if (list == 2) {
                System.out.print( "출금액 > ");
                int money = scanner.nextInt();
                totalMoney -= money;
            } else if (list == 3) {
                System.out.println("잔고 > "+ totalMoney);
            } else if (list ==4) {
                run = false;
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("프로그램 종료");
            }

        }
    }
}
