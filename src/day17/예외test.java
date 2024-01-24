package day17;

import java.util.Scanner;

public class 예외test {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int ch = scanner.nextInt();// 인트안 입력하면 예외/오류 발생 InputMismatchException
        }catch (Exception e){ // 매개변수가 InputMismatchException Exception의 자식,자손들..
            System.out.println("숫자만 입력해주세요.");
        }

    }
}
