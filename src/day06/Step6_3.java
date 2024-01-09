package day06;

import java.util.Scanner;

public class Step6_3 {
    public static void main(String[] args) { // m s

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
        Scanner scanner = new Scanner(System.in);
        String 전화번호부 = "";
        int count = 0;  // 전화번호 생성시 마다 순번 값 저장 변수

        while (true){
            String[] arr = null;    // 전화번호부.split 이용 배열 선언
            System.out.println("================== 전화번호부 ==================");
            System.out.println("1.전화번호 등록 | 2.전화번호 삭제 | 3.전화번호 출력");
            System.out.println("=============================================");
            System.out.print("입력 >");
            int ch = scanner.nextInt();
            scanner.nextLine(); // nextInt() 엔터값 없애기

            // 전화번호 입력
            if(ch == 1) {
                System.out.print("이름을 입력해주세요. >");
                String name = scanner.nextLine();
                System.out.print("전화번호를 입력해주세요. >");
                String pon = scanner.nextLine();
                count++;    // 전화번호 생성시 +1
                전화번호부 += Integer.toString(count) + "\t"+name  +"\t"+ pon +","; // 생성시 "," 넣어줘서 문자열 구분

            } else if (ch == 2) {
                // 전화번호부 문자열에서 "," 구분으로 나눈후 arr 배열 대입
                arr = 전화번호부.split(",");
                System.out.println("============= 삭제할 순번 입력 =============");
                int num = scanner.nextInt();    // 삭제 순번 입력
                scanner.nextLine(); // nextInt() 엔터값 없애기
                전화번호부 = ""; // 값 초기화
                // 현재까지 생성된 count 수만큼 for문 반복
                for (int i = 0; i < count; i++){
                    if(i+1 == num){
                        System.out.println("삭제하였습니다.");
                        count -= 1; // 삭제했으니 count -1
                    }else {
                        전화번호부 += arr[i]+",";    // 삭제번호가 아닐시 쪼갠 문자열 다시 대입
                    }
                }

            } else if (ch == 3) {
                // 출력을 위한 문자열 분리
                arr = 전화번호부.split(",");
                System.out.println("============= 전화번호부 =============");
                System.out.println("순번     이름      전화번호");
                // 생성된 전화번호부 count 수만큼 문자열 분리한 arr 출력
                for (int i = 0; i < count; i++){
                    System.out.println(arr[i]);
                }

            }else {
                System.out.println("[에러] 다시 입력해 주세요.");
            }
        }

    } // m e
} // c e
