package 팀과제;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Quiz1 {


    public static void main(String[] args) {
        유저정보[] 전체유저 = new 유저정보[100];  // 유저정보가 100개 들어가는 전체유저라불리는 배열을 지정
        구독[] 전체구독 = new 구독[100]; //구독이 100개 들어가는 전체구독이라는 배열을 지정
        유저정보 로그인중 = new 유저정보(); // 유저정보 하나를 로그인중이라는 변수명에 지정해놓기 / 로그인 유,무 확인
        Scanner scanner = new Scanner(System.in);

        while (true) { //프로그램 시작 - 반복
            System.out.println("------------------------------");
            System.out.println("1. 로그인 2. 회원가입");
            int ch = scanner.nextInt();
            scanner.nextLine();
            int userNum = -1;
            if (ch == 1) { // 로그인시
                로그인중 = null; // 이거 지정안하면 처음에 값 없어도 로그인 되어버림. (클래스의 주소가 참조되어 있기 때문에.)
                System.out.print("로그인 - 아이디 입력 : ");
                String id = scanner.nextLine();
                System.out.print("로그인 - 비밀번호 입력 : ");
                String pw = scanner.nextLine();
                for (int i = 0; i < 전체유저.length; i++) {
                    if (전체유저[i] != null) { // null이 아닐때만 검사하므로 null일때는 그냥 로그인 되어버리는 이유<< 23번째 줄 참고.
                        if (전체유저[i].아이디.equals(id) && 전체유저[i].비밀번호.equals(pw)) {
                            로그인중 = 전체유저[i]; //배열내 i번째 id와 pw가 같으면, 전체유저i번째를 로그인중이라는 로그인 유,무에 저장
                            System.out.println("로그인 성공");
                            break;
                        }
                    }
                }
                if(로그인중 == null){
                    System.out.println("로그인 실패");
                }
            }
            if (ch == 2) { // 회원가입 시
                유저정보 신규가입 = new 유저정보(); // 신규가입 정보를 저장하는 클래스만들기

                // 아이디 입력
                boolean run = true;
                while (run) { // 아이디 중복 검사 반복문
                    System.out.print("회원 가입할 아이디를 입력하세요 : ");
                    String id = scanner.nextLine();
                    for (int i = 0; i < 전체유저.length; i++) {
                        if (전체유저[i] != null) { // i번째 유저가 존재 할 때만 검사해서
                            if (id.equals(전체유저[i].아이디)) { // i번째 아이디가 입력받은 id와 동일하면
                                System.out.println("중복된 아이디가 존재합니다. 다시하세요!");
                                break; // 중복된 아이디 때문에 다시 입력받기 위해 반복문 탈출
                            }
                        } else { // if if를 위에서 통과해서 존재안할 때,
                            신규가입.아이디 = id;
                            run = false; // 넣었을떄 while 반복문 종료
                        }
                    }

                }

                // 비밀번호 입력
                System.out.print("회원 가입할 비밀번호를 입력하세요 : ");
                String pw = scanner.nextLine();
                신규가입.비밀번호 = pw;

                // 이름입력
                System.out.print("회원 가입분의 이름을 입력하세요 : ");
                String name = scanner.nextLine();
                신규가입.이름 = name;

                // 그 외 정보 받아도 되나 생략.

                //회원번호

                for (int i = 0; i < 전체유저.length; i++) {
                    int a = (int) (Math.random() * 100000000);
                    if (전체유저[i] != null) { // i번째 유저가 존재 할 때
                        if (a == 전체유저[i].유저번호) { // i번째 아이디의 유저번호와 제공받은 랜덤 번호가 일치하면,
                            i = 0;
                        } else {
                            신규가입.유저번호 = a;
                            break; // 대입하고 탈출.
                        }
                    }
                }

                for (int i = 0; i < 전체유저.length; i++) {
                    if (전체유저[i] == null) { // null 첫 놈에 대입
                        전체유저[i] = 신규가입;
                        break; // 안하면 계속 대입.
                    }
                }
                로그인중 = null;    // 로그인은 바로 안되게 해놨음.

            }
////////////////////////까지 확인

            while (로그인중 != null) { // 로그인중 일 때의 반복문은 로그인중 = 전체유저[i]번째 일때만 실행된다.
                System.out.println("------------------------------");
                System.out.println("1. 로그아웃 2. 구독정보");
                int c = scanner.nextInt();
                scanner.nextLine();
                if(c == 1){
                    로그인중 = null;
                }
                if(c == 2){
                    if(로그인중.구독번호 == 0){
                        System.out.println("구독정보가 없습니다.");
                    } else {
                        for(int i =0; i<전체구독.length; i++){
                            if(전체구독[i] != null) {
                                if(로그인중.구독번호 == 전체구독[i].구독번호){
                                    System.out.println("구독정보");
                                    System.out.printf("타입 : %s\n" ,전체구독[i].타입);
                                    for( int j = 0; j<전체구독[i].구독인원.length; j++){
                                        System.out.println((j+1)+"번째인원"+전체구독[i].구독인원[j]);
                                    }
                                    System.out.println("구독기간 :"+전체구독[i].구독기간);
                                    break;
                                }
                            }
                        }
                    }
                    boolean run2 = true;
                    while(run2) {
                        System.out.println("1.구독하기 2.기간연장 3.뒤로가기");
                        String ch1 = scanner.nextLine();
                        if (ch1.equals("1")) { // 구독하기버튼
                            구독 신규구독 = new 구독(); // 신규구독이라는 놈 = new 구독이라는 클래스 하나 데려옴.
                            System.out.print("구독번호입력 : ");
                            int gNo = scanner.nextInt();
                            // 입력받은 gNo가 존재하면, 불가능하게 ★★★★★★★★
                            scanner.nextLine();
                            System.out.print("구독개월수 : ");
                            int month = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("구독타입선택(1. 베이직, 2. 프리미엄 ) : ");
                            String type = scanner.nextLine();
                            if (type.equals("1")) { // 혼자쓰는 베이직 구독
                                신규구독.구독인원[0] = 로그인중.아이디; // 자기 추가, 구독인원에 자기 아이디 넣기
                                로그인중.구독번호 = gNo; // 로그인중인 값.
                            } else if (type.equals("2")) { // 여럿이서 쓰는 프리미엄 구독
                                신규구독.구독인원[0] = 로그인중.아이디; // 자기 추가, 구독인원에 자기 아이디 넣기
                                로그인중.구독번호 = gNo; // 로그인중인 값.
                                int j = 0;
                                for(int i =0 ; i<전체유저.length; i++){
                                    if(전체유저[i]!=null) {
                                        if (로그인중.구독번호 == 전체유저[i].구독번호) { // 지금 로그인한 놈의 구독번호를 받아서 구독인원 구하기.
                                            j++; // 일단 나 포함되니 j는 무조건 1 이상.
                                        }
                                    }
                                }
                                String id존재유무 = "";
                                boolean run4 = true;
                                while(run4){ // 나중에 추가하기를 위해서 만든 와일문
                                    for (int i = 0; i < 전체유저.length; i++) {
                                        while (run4){ // 나중에 추가하기를 위해서 만든 와일문
                                            for (j = j; j < 4; ) { // 나중에 이것도 바꿔야할 것 ★★★★★★★★
                                                System.out.println("1. 친구"+(j)+" 입력, 2. 나중에 추가하기.");  // 같이 쓸 친구 아이디 받기.
                                                String ch2 = scanner.nextLine();
                                                if(ch2.equals("1")){ // 친구j 입력시
                                                    System.out.print("친구 아이디를 입력하세요 : ");
                                                    String id = scanner.nextLine(); // 아이디 입력 받아
                                                    if (id.equals(로그인중.아이디)){
                                                        System.out.println("자기 아이디는 불가능합니다.");
                                                        break;
                                                    }
                                                    if (전체유저[i] != null) { // 있을때만 검사, 자기 아이디가 아닐때
                                                        if (전체유저[i].아이디.equals(id)) { // 입력받은 아이디와 배열애 아이디가 같으면
                                                            전체유저[i].구독번호 = gNo; // 애들한테 구독 번호를 대입.
                                                            신규구독.구독인원[j] = id;
                                                            j++; // 넣었을때만 j 1증가.
                                                            id존재유무 = "";
                                                            break; //j 를 쓰는 for문 나가기
                                                        }else{
                                                            id존재유무 = "무";
                                                        } // 싹 돌렸는데 다르면 id존재유무가 "무"인채로 있음.
                                                    }
                                                    if(id존재유무.equals("무")){  // 전체유저에 배열이 있는데 입력받은 아이디가 없을때 경고창 출력하기 //
                                                        System.out.println("해당 아이디가 존재하지않습니다.");
                                                    }
                                                }else if(ch2.equals("2")){ // 나중에 추가하기 버튼.
                                                     run4 = false;
                                                     break;
                                                }

                                            }
                                        }
                                    }
                                    if(j==4){run4 = false;} // 4명이면
                                }
                            }

                            신규구독.구독번호 = gNo; // 신규구독 값들.
                            신규구독.타입 = type;
                            신규구독.구독기간 = month;

                            for (int i = 0; i < 전체구독.length; i++) {
                                if (전체구독[i] == null) {
                                    전체구독[i] = 신규구독; // 구독 유형 하나 배열내에 추가.
                                    break;
                                }
                            }

                        } else if (ch1.equals("2")) { // 기간 연장 버튼
                            if(로그인중.구독번호 != 0){
                            System.out.print("연장할 기간을 입력하세요 : ");
                            int plusM = scanner.nextInt();
                            scanner.nextLine();
                            for (int i = 0; i < 전체구독.length; i++) {
                                if (전체구독[i] != null) {
                                    if (전체구독[i].구독번호 == 로그인중.구독번호) {
                                        전체구독[i].구독기간 += plusM;
                                    }
                                }
                            }
                            }else{
                                System.out.println("현재 구독중인 상태가 아닙니다.");
                            }
                        } else if (ch1.equals("3")) { // 뒤로가기 버튼
                            run2= false;
                        } else {
                            System.err.println("잘못된 입력입니다.");
                        }
                    }
                }


            }
        }
    }
}


class 유저정보{
    String 이름;
    int 유저번호;
    String 아이디;
    String 비밀번호;
    int 구독번호;
    //  필수x
    String 회사명;
    String 주소;
    String 전화번호;
    String 이메일;

}

class 구독{
    int 구독번호 = -1;
    String[] 구독인원 = new String[4];
    String 타입;
    int 구독기간;

}
