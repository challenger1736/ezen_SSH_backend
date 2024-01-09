package day06;  // 패키지 이름

import java.util.Scanner;

public class Step6_1 {    // class S

    // 3. 전화번호부 만들기
    public static void main(String[] args) {    // main S
        String 전화번호부 = "";

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("============= 전화번호부 =============");
            System.out.printf("%-5s\t%-8s\t%-13s\n","순번","이름","전화번호");
            for(int i = 0; i<전화번호부.split("/").length; i++){
                if(!전화번호부.equals("")){
                    System.out.printf("%-5s\t%-8s\t%-13s\n",i+1,전화번호부.split("/")[i].split(",")[0],전화번호부.split("/")[i].split(",")[1]);
                }
            }
            System.out.println("\n1.전화번호등록 2.전화번호삭제");

            System.out.print("선택> "); String ch = scanner.nextLine();
            if(ch.equals("1")){
                System.out.print("이름> "); String name = scanner.nextLine();
                System.out.print("전화번호> "); String phone = scanner.nextLine();
                전화번호부 += name + ","+phone + "/";
            } else if (ch.equals("2")){
                System.out.print("삭제할 순번>"); int num = scanner.nextInt();scanner.nextLine();
                String 전화번호부_복제 = "";
                for(int i=0; i<전화번호부.split("/").length; i++){
                    if(i!=num-1){
                        전화번호부_복제 += 전화번호부.split("/")[i] + "/";
                    }
                }

                전화번호부 = 전화번호부_복제;

            } else {
                System.out.println("번호를 다시 입력해주세요.");
            }

        }
    }   // main E


}   // class E

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
