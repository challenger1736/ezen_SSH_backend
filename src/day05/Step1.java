package day05; // 패키지 : 클래스가 위치한 폴더

import java.util.Scanner;

public class Step1 { // 클래스 : 자바의 모든 코드는 클래스 안에서만 실행된다. ★★★★★★★
    public static void main(String[] args) { // 메인함수 : 자바 코드 진입점. (스레드 포함) ★★★★★★★
        // Thread란 프로세스 안에서 실질적으로 작업을 실행하는 단위를 말한다.

        // 3-1. 입력객체 만들기. [ Scanner 객체가 필요한 이유? 입력 받으려고 ]
        Scanner scanner = new Scanner(System.in);

        // 4-1. 초기변수. : 방문록 1개당 ( 내용, 작성자, 비밀번호 포함 ) 방문록 3개면 변수 9개//불편,, 배열을 왜 써야하는지 알기 위해.
        String 내용1 = ""; String 작성자1 = ""; int 비밀번호1 = 0;
        String 내용2 = ""; String 작성자2 = ""; int 비밀번호2 = 0;
        String 내용3 = ""; String 작성자3 = ""; int 비밀번호3 = 0;

        while (true){ // w s // 무한루프
            System.out.println("============= 방문록 =============");
                // 6 현재 변수 현황 출력
                System.out.printf("%2d \t %-5s \t %-20s\n",1, 작성자1, 내용1);
                System.out.printf("%2d \t %-5s \t %-20s\n",2, 작성자2, 내용2);
                System.out.printf("%2d \t %-5s \t %-20s\n",3, 작성자3, 내용3);

            System.out.println("1. 방문록 작성 2. 방문록 삭제 3. 종료");

            // 3-2. 입력객체 이용한 키보드로부터 입력값 호출하고 변수에 저장
            System.out.print("선택 : ");
            int ch = scanner.nextInt();

            // 5-1. 사용자가 입력(선택)한 경우수의 따른 기능 처리
            if(ch == 1){
                System.out.print("방문록 작성 위치 : 1, 2, 3 : ");
                // 입력 : 위치
                int no = scanner.nextInt(); // 요놈은 엔터를 먹지않으므로 넥스트 라인을 밑에 해주기.
                
                // 입력 : 내용, 작성자, 비밀번호
                scanner.nextLine();
                System.out.print("내용 : ");
                String content = scanner.nextLine();
                System.out.print("작성자 : ");
                String writer = scanner.next();
                System.out.print("비밀번호 : ");
                int password = scanner.nextInt();

                // 저장 : 위치에 따른 각 변수에 저장.
                if (no == 1){
                    내용1 = content; 작성자1 = writer; 비밀번호1 = password;
                } else if (no == 2) {
                    내용2 = content; 작성자2 = writer; 비밀번호2 = password;
                } else if (no == 3) {
                    내용3 = content; 작성자3 = writer; 비밀번호3 = password;
                } else {
                    System.out.println("[경고]알 수없는 위치입니다.");
                }
            } else if (ch == 2) {
                System.out.print("방문록 삭제 위치 : 1, 2, 3 : ");
                int no = scanner.nextInt(); // 요놈은 엔터를 먹지않으므로 넥스트 라인을 밑에 해주기.

                //입력 [ 비밀번호 ]
                System.out.print("방문록 비밀번호 : ");
                int password = scanner.nextInt();
                // if 중첩
                // 초기화 : 위치와 비밀번호 일치에 따른 각 변수를 처음값으로 대입.
                // 저장 : 위치에 따른 각 변수에 저장.
                if (no == 1 && 비밀번호1 == password){
                    내용1 = ""; 작성자1 = ""; 비밀번호1 = 0;
                } else if (no == 2 && 비밀번호2 == password) {
                    내용2 = ""; 작성자2 = ""; 비밀번호2 = 0;
                } else if (no == 3&& 비밀번호3 == password) {
                    내용3 = ""; 작성자3 = ""; 비밀번호3 = 0;
                } else {
                    System.out.println("[경고]알 수없는 위치입니다.");
                }
            } else if (ch == 3) {
                break;
            }else {
                System.err.println("[경고]알 수없는 입력입니다.");
            }


        }

    } // main e
} // class e

/*
*   비회원제 방문록 프로그램. [JAVA만 이용, 배운것만 가지고.]
*       1. 방문록 작성 / 삭제 / 종료 기능 구현.
*           1-1. 초기메뉴가 반복적으로 실행되어야 한다. while (true)
*               - 특정 조건에 따라 종료.
*           1-2. 초기메뉴에 대해 선택(입력) 받는다. scanner.nextInt();
* 
*       2. 방문록에는 '내용', '작성자', '비밀번호' 를 최대 3명만 작성 가능하도록
*           - 내용(문자열), 작성자(문자열), 비밀번호(정수)
*           - 선언해야 할 변수 개수 : 9개
*
*       3. 기능구현
*           [ ] 현재 변수의 현황 출력.
*               1. 초기메뉴에서 9개 변수를 형식맞춰 모두 출력.
*
*           [ 1번 선택시 ] 방문록 작성
*               1. (1~3) 중 몇번째 방문록에 작성할껀지 선택받기.
*               2. 내용, 작성자, 비밀번호(숫자4자리) 입력// 원래는 패스워드도 요즘 다 String 쓰는데 연습용으로 int 쓰는거임, 앞자리 0안됨,
*               3. 입력받은 각 데이터 대입.
*           [ 2번 선택시 ] 방문록 삭제
*           [ 3번 선택시 ] 종료
*               1. break 2. return 3. boolean
*
*
* */