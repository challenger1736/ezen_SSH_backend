package day06;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" 입력(숫자형식으로 입력받기) : ");
        String money = scanner.nextLine();
            // 입력받은 문자열 타입의 금액을 천단위 쉼표 변환
        int length = money.length();
        System.out.println(length);

        String result = null; // 제공 받은 result
        result = "";

        for(int i = 0 ; i<= money.length()-1; i++){
            System.out.println(money.length()-i); // 이거 신박하네
            if(i>0 && (money.length()-i)%3 == 0){
                result+=",";
            }
           result += money.charAt(i);
        }

        // 천단위 쉼표 : 천단위 마다 , 추가 , 패턴 3자리마다




        System.out.println("result = "+ result);
    }
}
