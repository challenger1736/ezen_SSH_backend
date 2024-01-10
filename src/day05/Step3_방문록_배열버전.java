package day05;

import java.util.Scanner;

public class Step3_방문록_배열버전 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] 내용 = new String[3]; // 내용이라는 변수명(스택)에 스트링 3(내용.length)개가 들어가는 배열이 생김, 그 배열들은 null임.
        String[] 작성자 = new String[3];
        int[] 비밀번호 = new int[3];

        while (true){ // w s // 무한루프
            System.out.println("============= 방문록 =============");
            // 6 현재 변수 현황 출력
            for(int i = 0; i < 작성자.length; i++){
                //null 비교시에는 비교 연산자(==) 사용, 타입은 클래스 이지만 ★★
                if(내용[i]==null){ 작성자[i] = ""; 내용[i]="";
                System.out.printf("%2d \t %-5s \t %-20s\n",i+1, 작성자[i], 내용[i]);
                }else {System.out.printf("%2d \t %-5s \t %-20s\n",i+1, 작성자[i], 내용[i]);}
            }


            System.out.println("1. 방문록 작성 2. 방문록 삭제 3. 종료");

            // 3-2. 입력객체 이용한 키보드로부터 입력값 호출하고 변수에 저장
            System.out.print("선택 : ");
            int ch = scanner.nextInt();
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
                if (no >= 1 && no <=3){
                      내용[no-1] = content; 작성자[no-1] = writer; 비밀번호[no-1] = password;}
                else {
                    System.out.println("[경고]알 수없는 위치입니다.");
                }

            }else if (ch == 2) {
                System.out.print("방문록 삭제 위치 : 1, 2, 3 : ");
                int no = scanner.nextInt(); // 요놈은 엔터를 먹지않으므로 넥스트 라인을 밑에 해주기.
                scanner.nextLine();
                //입력 [ 비밀번호 ]
                System.out.print("방문록 비밀번호 : ");
                int password = scanner.nextInt();

                if(no>=1 && no<=내용.length && 비밀번호[no-1]==password){ 내용[no-1] ="";  작성자[no-1] = ""; 비밀번호[no-1] = 0;}
                else if(no<1 || no>내용.length){
                    System.out.println("[경고]알 수 없는 위치 입니다.");
                } else if(비밀번호[no-1]!=password){
                    System.out.println("[경고]비밀번호가 다릅니다.");
                }
            }else if (ch == 3) {
                break;
            }else {
                System.err.println("[경고]알 수없는 입력입니다.");
            }


        }
    }

}
