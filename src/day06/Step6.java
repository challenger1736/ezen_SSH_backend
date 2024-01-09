package day06;

import java.util.Scanner;

public class Step6 {
    public static void main(String[] args) {

        // 간단한 전화번호부 만들기
        Scanner scanner = new Scanner(System.in);
        String 전화번호부 = "";

        //반복문
        while(true) {
            System.out.println("============= 전화번호부 =============");
            System.out.println(" 순번     이름      전화번호");
            String[] 전화번호부2 = 전화번호부.split(",");
            //System.out.println(전화번호부2);
            //System.out.println(전화번호부2.length);
            for (int i = 0; i < 전화번호부2.length; i+=2) {
                if (전화번호부2.length == 1) {
                } else {
                    System.out.printf("%d       %s     %s\n", i/2 + 1, 전화번호부2[i], 전화번호부2[i+1]);
                };
            }
            System.out.println();
            System.out.print("1. 전화번호 등록, 2.전화번호 삭제 : ");
            int ch = scanner.nextInt();
            scanner.nextLine();
            //등록
            if (ch == 1) {
                System.out.print("이름 : ");
                String 이름 = scanner.nextLine();
                전화번호부 += 이름 + ",";
                System.out.print("전화번호 : ");
                String pNum = scanner.nextLine();
                전화번호부 += pNum + ",";
            } else if (ch == 2) {
                System.out.print("삭제할 전화번호부 번호를 입력하세요. : ");
                int del = scanner.nextInt();
                scanner.nextLine();
                전화번호부2[del*2-2] = "";
                전화번호부2[del*2-1] = "";
                전화번호부 = "";
                for(int i = 0 ; i < 전화번호부2.length; i++){
                    if (전화번호부2[i]==""){
                    } else{
                    전화번호부 += 전화번호부2[i]+",";}
                }
                System.out.println(전화번호부);
            }
        }
    }
}
// 3. step6 전화번호부 만들기 [ 완성되면 카톡방 코드 제출 ]
/*
    [1.조건]
        - 하나의 문자열만 이용하여 여러명의 이름과 전호번호를 관리하시오.
        String 전화번호부 = "";

    [2.기능구현]
        1.전화번호 등록
            - 이름 과 전화번호 를 입력받아 저장.
        2.전화번호 삭제
            - 출력된 전화번호 목록을 보고 순번을 입력받아 해당 순번의 전화번호 삭제
        3.전화번호 출력
            - String 전화번호부 에 저장된 데이터를 아래 그림과 같이 출력

    [3.실행화면]
        ============= 전화번호부 =============
        순번     이름      전화번호
        1       김현수     010-3913-2072
        2       유재석     010-1234-1234
        3       강호동     010-7777-7777

        1.전화번호등록 2.전화번호삭제
        선택>
*/