package day10;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {

        // p.237
        Car myCar = new Car(); // myCar 하나가 나옴.
        Scanner scanner = new Scanner(System.in); // 입력받을 빈 칸
        boolean run = true; // 가스 유효성 검사 불린
        System.out.println("넣을 가스의 양을 입력하세요.");
        String gas = scanner.nextLine(); // gas의 값을 받기.
        while (true) { // 전체 반복
            while (run) { // 가스 숫자 유효성 검사
                for (int i = 0; i < gas.length(); i++) {
                    if (gas.charAt(i) >= 48 && gas.charAt(i) <= 57) {
                        run = false;
                    } else {
                        System.out.println("숫자로 입력하세요.");
                        System.out.println("넣을 가스의 양을 입력하세요.");
                        gas = scanner.nextLine();
                        break;
                    }
                }
            }
            run = true;
            myCar.gas += myCar.setGas(Integer.parseInt(gas)); //private이라면 getGas에다가 gas를 넣은걸 setGas로 설정
            System.out.println("가스를 넣었습니다.");

            System.out.println("1. 출발, 2.추가로 가스 넣기");
            String ch = scanner.nextLine();
            if (ch.equals("1")) {
                if (myCar.isLeftGas()) {
                    System.out.println("출발합니다.");
                    myCar.run();
                }
                System.out.println("가스를 주입하세요.");
                System.out.println("넣을 가스의 양을 입력하세요.");
                gas = scanner.nextLine();
            } else if (ch.equals("2")) {
                System.out.println("넣을 가스의 양을 입력하세요.");
                gas = scanner.nextLine();
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

    }// me
}// ce
