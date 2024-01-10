package day05;  // 패키지 이름

import java.util.Scanner;

public class Step3_방문록_배열버전_nullVer {    // class S
    public static void main(String[] args) {    // main S

        Scanner scanner = new Scanner(System.in);
        // 5-1 저장할 (배열)변수 선언
        String[] 내용배열 = new String[3];
        String[] 작성자배열 = new String[3];
        int[] 비밀번호배열 = new int[3];

        System.out.println(내용배열.length);

        // 1. 무한루프
        while (true){   // w S
            // 2. 출력
            System.out.println();
            System.out.println("============ 방문록 ============");
            // 7. for문 이용한 배열내 모든 항목/요소 호출 : 0부터 2까지 1씩 증가. 나머지는 코드가 반환
            for(int i = 0; i<3; i++){
                // 타입은 클래스 이지만, null 비교시에는 비교연산자 사용
                //if(내용배열[i] != null){
                System.out.printf("%2d \t %-3s \t %-20s\n",i+1,작성자배열[i],내용배열[i]);
                //}
            }
            System.out.println("1.방문록 작성 2.방문록 삭제 3. 종료");
            System.out.println("===============================");

            // 3. 입력
            System.out.print("선택> ");
            int ch = scanner.nextInt();scanner.nextLine();

            // 4. 입력된 경우의 수 판단
            if(ch == 1){
                // 6-1 방문록 작성할 위치(인덱스) 입력받는다.
                System.out.print("방문록 작성할 위치 : 1. 2. 3. :");
                int no = scanner.nextInt();scanner.nextLine();
                // 6-2 입력 : 내용, 작성자, 위치
                System.out.print("내용 : "); String content = scanner.nextLine();
                System.out.print("작성자 : "); String writer = scanner.nextLine();
                System.out.print("비밀번호 : "); int password = scanner.nextInt();scanner.nextLine();
                // 6-3 저장
                내용배열[no-1] = content;
                작성자배열[no-1] = writer;
                비밀번호배열[no-1] = password;
            }
            else if(ch == 2){
                // 8-1 입력 : 삭제할 방문록의 위치(인덱스) 입력
                System.out.print("방문록 삭제할 위치 : 1. 2. 3. :");
                int no = scanner.nextInt();scanner.nextLine();

                // 8-2 입력 : 유효성검사를 위한 비밀번호 입력받기
                System.out.print("방문록 비밀번호 : ");
                int password = scanner.nextInt();scanner.nextLine();

                // 8-3 초기화 : 만약에 인덱스가 없는 번호를 선택했을때.
                if(비밀번호배열[no-1] == password && no <= 내용배열.length){
                    내용배열[no-1] = "";
                    작성자배열[no-1] = ""; // test 완료
                    비밀번호배열[no-1] = 0;

                } else if(비밀번호배열[no-1] != password){    // 만약에 선택한 방문록의 패스워드와 방금 입력한 패스워드가 같으면.
                    // 배열의 항목/요소의 자리/길이 삭제할 수 없으므로 초기값으로 대입.
                    System.out.println("[경고] 패스워드가 다릅니다.");
                } else {System.out.println("[경고] 알 수 없는 위치입니다.");

                }

            } else if(ch == 3){
                break;
            } else {
                System.out.println("[경고] 알 수 없는 입력입니다.");
            }
        }   // w E

    }   // main E
}   // class E