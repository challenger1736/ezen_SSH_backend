package 팀과제;

import java.util.Scanner;

public class NewQuiz {
    public static void main(String[] args) {
        유저정보2[] 전체유저배열 = new 유저정보2[1]; // 1개로 새로 배열 생성됨.
        구독2[] 전체구독배열 = new 구독2[1];
        유저정보2 내정보 = new 유저정보2(); // 로그인 상태 확인 및 내 정보.
        Scanner scanner = new Scanner(System.in);
        //프로그램 시작시 나올 문구
        while(true){
            System.out.println("------------------------------");
            System.out.println("1. 로그인 2. 회원가입 ");
            String ch = scanner.nextLine();
            if(ch.equals("1")){// 로그인 했을 때
                System.out.println("------------------------------");
                내정보 = null;
                System.out.print("로그인 - 아이디 입력 : ");
                String loginId = scanner.nextLine();
                System.out.print("로그인 - 비밀번호 입력 : ");
                String loginPw = scanner.nextLine();

                for (int i = 0; i < 전체유저배열.length; i++) {
                    if (전체유저배열[i] != null) { // null이 아닐때만 검사하므로 null일때는 그냥 로그인 되어버리는 이유<< 23번째 줄 참고.
                        if (전체유저배열[i].아이디.equals(loginId) && 전체유저배열[i].비밀번호.equals(loginPw)) {
                            내정보 = 전체유저배열[i]; //배열내 i번째 id와 pw가 같으면, 전체유저i번째를 로그인중이라는 로그인 유,무에 저장
                            System.out.println("로그인 성공");
                            System.out.println("내 구독 번호 : " + 내정보.구독번호);
                            break;
                        }
                    }
                }
                if(내정보 == null){
                    System.out.println("로그인 실패");
                }
            } else if (ch.equals("2")) { // 회원가입 했을 때
                유저정보2[] 전체유저배열2 = new 유저정보2[전체유저배열.length+1]; // 추가로 넣을 새로운 배열 생성됨.
                유저정보2 신규가입정보 = new 유저정보2(); // 하나의 신규가입정보가 들어감.
                System.out.println("------------------------------");
                boolean run = true;
                while (run) {
                    System.out.print("회원 가입할 아이디를 입력하세요 : ");
                    String 가입id = scanner.nextLine();
                    for (int in = 0; in < 전체유저배열.length; in++) {
                        if (전체유저배열[in] != null) { // in번째 유저가 존재 할 때만 검사해서
                            if (가입id.equals(전체유저배열[in].아이디)) { // in번째 아이디가 입력받은 가입id와 동일하면
                                System.out.println("중복된 아이디가 존재합니다. 다른 아이디를 입력하세요.");
                                break; // 중복된 아이디 때문에 다시 입력받기 위해 반복문 탈출
                            }
                        } else { // if if를 위에서 통과해서 존재안할 때,
                            신규가입정보.아이디 = 가입id;
                            run = false; // 넣었을떄 while 반복문 종료
                        }
                    }
                } // 가입 아이디
                System.out.print("회원 가입할 비밀번호를 입력하세요 : ");
                String 가입pw = scanner.nextLine();
                신규가입정보.비밀번호 = 가입pw; // 가입 비밀번호 대입

                System.out.print("회원 가입할 분의 이름을 입력하세요 : ");
                String 가입name = scanner.nextLine();
                신규가입정보.이름 = 가입name; // 가입 이름 대입

                // 그 외 정보 생략.
                // 회원 번호 나누기.

                for (int i = 0; i < 전체유저배열.length; i++) {
                    int a = (int) (Math.random() * 100000000);
                    if(전체유저배열.length == 1){ //null 하나밖에 없는 배열일 때.
                        신규가입정보.유저번호 = a; System.out.println("유저번호 : "+ 신규가입정보.유저번호);
                        break;
                    }
                    if (전체유저배열[i] != null) { // i번째 유저가 존재 할 때
                        if (a == 전체유저배열[i].유저번호) { // i번째 아이디의 유저번호와 제공받은 랜덤 번호가 일치하면,
                            i = 0;
                        } else {
                            신규가입정보.유저번호 = a;
                            System.out.println("유저번호 : "+ 신규가입정보.유저번호); // 확인용
                            break; // 대입하고 탈출.
                        }
                    }
                }

                for (int i = 0; i < 전체유저배열.length; i++) {
                    if (전체유저배열[i] == null) { // null 첫 놈에 대입
                        전체유저배열[i] = 신규가입정보;
                        break;
                    }
                }
                for(int i =0; i< 전체유저배열.length; i++){
                    if (전체유저배열2[i] == null){
                        전체유저배열2[i] = 전체유저배열[i];
                    }
                }
                전체유저배열 = 전체유저배열2;
                //System.out.println(전체유저배열.length);

                내정보 = null; // 로그인 바로 안되게.
            } else { // 로그인 회원가입 말고 다른 입력
                System.out.println("잘못된 입력입니다.");
            }

            //로그인 중 상황구현

            while (내정보 != null) { // 로그인중 일 때의 반복문은 내정보 = 전체유저배열[i]번째 일때만 실행된다.
                System.out.println("------------------------------");
                System.out.println("1. 로그아웃 2. 구독정보");
                String ch2 = scanner.nextLine();
                if(ch2.equals("1")){
                    내정보 = null;
                    break;
                }else if(ch2.equals("2")){ // 구독정보 확인시
                    //내 구독한 정보 나오고 + 구독번호
                    for(int i = 0 ; i<전체구독배열.length ; i++){
                        if(전체구독배열.length==1){
                        }
                        if(전체구독배열[i]!=null){
                            if(내정보.구독번호 == 전체구독배열[i].구독번호 ){
                                if(전체구독배열[i].타입.equals("베이직")){
                                    System.out.println("구독 번호 : " + 전체구독배열[i].구독번호);
                                    System.out.println("구독 타입 : 베이직 (1명)");
                                    System.out.println("구독한 개월 : " + 전체구독배열[i].구독기간);
                                } else if (전체구독배열[i].타입.equals("프리미엄")) {
                                    System.out.println("구독 번호 : " + 전체구독배열[i].구독번호);
                                    System.out.println("구독 타입 : 프리미엄 (4명)");
                                    System.out.println("구독한 개월 : " + 전체구독배열[i].구독기간);
                                }

                            }
                        }

                    }


                    boolean run6 = true;
                    while(run6) {
                        System.out.println("------------------------------");
                        System.out.println("1.구독하기 2.기간연장 3.구독번호 등록 4.뒤로 가기");
                        String ch3 = scanner.nextLine();
                        if (ch3.equals("1")) {
                            구독2 신규구독하나 = new 구독2(); // 구독2 클래스 하나 불러오기
                            // 구독 처음 했을 때,
                            if (내정보.구독번호 == 0) { // 구독번호가 없으면
                                boolean run3 = true;
                                while (run3) {
                                    System.out.print("구독 개월 수 입력 : ");
                                    String 신규구독개월 = scanner.nextLine();
                                    for (int i = 0; i < 신규구독개월.length(); i++) {
                                        if (!(신규구독개월.charAt(i) >= 48 && 신규구독개월.charAt(i) <= 57)) {//입력받은 아스키코드가 숫자 아니면
                                            System.out.println("숫자로 입력하세요.");
                                            break;
                                        } else {
                                            run3 = false;
                                            신규구독하나.구독기간 += Integer.parseInt(신규구독개월); // 추가
                                        }
                                    }
                                } // 이까진 맞아.
                                boolean run4 = true;
                                String 신규구독타입;
                                while (run4) {
                                    System.out.println("구독 타입 선택");
                                    System.out.println("1. 베이직 (1명)  |  2. 프리미엄 (4명)");
                                    신규구독타입 = scanner.nextLine();
                                    if (신규구독타입.equals("1")) {
                                        System.out.println("베이직 타입");
                                        신규구독하나.타입 = "베이직";
                                        신규구독하나.구독인원 = new String[1];
                                        신규구독하나.구독인원[0] = 내정보.아이디; // 신규구독 인원 넣기
                                        run4 = false;

                                    } else if (신규구독타입.equals("2")) {
                                        System.out.println("프리미엄 타입");
                                        신규구독하나.타입 = "프리미엄";
                                        신규구독하나.구독인원 = new String[4];
                                        신규구독하나.구독인원[0] = 내정보.아이디; // 신규구독 인원 넣기
                                        run4 = false;
                                    } else {
                                        System.out.println("잘못된 입력입니다.(1 또는 2를 입력하세요.)");
                                    }
                                }
                                // 다하면 구독번호 주기.
                                구독2[] 전체구독배열2 = new 구독2[전체구독배열.length + 1]; // 새로운 값 넣을 배열.
                                for (int i = 0; i < 전체구독배열.length; i++) {
                                    int a = (int) (Math.random() * 100000000);
                                    if (전체구독배열.length == 1) { //null 하나밖에 없는 배열일 때.
                                        전체구독배열[i] = 신규구독하나;
                                        전체구독배열[i].구독번호 = a;
                                        내정보.구독번호 = a;
                                        System.out.println("구독번호 : " + 전체구독배열[i].구독번호);
                                        break;
                                    } else if (전체구독배열[i] == null) { // i번째 구독배열이 존재할 때
                                        전체구독배열[i] = 신규구독하나;
                                        전체구독배열[i].구독번호 = a;
                                        내정보.구독번호 = a;
                                        System.out.println("구독번호 : " + 전체구독배열[i].구독번호); // 확인용
                                        break; // 대입하고 탈출.
                                    } else if(전체구독배열[i]!= null && 전체구독배열[i].구독번호==a){
                                        i=0; // 구독번호 중복 방지
                                    }
                                }

                                for (int i = 0; i < 전체구독배열.length; i++) {
                                    if (전체구독배열2[i] == null) {
                                        전체구독배열2[i] = 전체구독배열[i];
                                    }
                                }
                                전체구독배열 = 전체구독배열2; // 새로운 구독 배열을 전체 구독배열로 다시.

                            } else { // 구독번호가 있을 때,
                                System.out.println("이미 구독 중입니다.");
                            }

                        } else if (ch3.equals("2")) { // 기간연장
                            System.out.println("------------------------------");
                            for (int i = 0; i < 전체구독배열.length; i++) {
                                if(내정보.구독번호 == 0){ System.out.println("아직 구독중이 아닙니다."); break;}
                                if (전체구독배열[i] != null) {
                                    if (내정보.구독번호 == 전체구독배열[i].구독번호) {
                                        if (전체구독배열[i].타입.equals("베이직")) {
                                            System.out.println("구독 번호 : " + 전체구독배열[i].구독번호);
                                            System.out.println("구독 타입 : 베이직 (1명)");
                                            System.out.println("구독한 개월 : " + 전체구독배열[i].구독기간);
                                            System.out.print("연장할 개월 : ");
                                            String a = scanner.nextLine();
                                            for (int i2 = 0; i2 < a.length(); i2++) {
                                                if (!(a.charAt(i2) >= 48 && a.charAt(i2) <= 57)) {//입력받은 아스키코드가 숫자 아니면
                                                    System.out.println("숫자로 입력하세요.");
                                                    break;
                                                }else {
                                                    //run3 = false;
                                                    전체구독배열[i].구독기간 += Integer.parseInt(a);
                                                    System.out.println("총 구독 개월 수 : " + 전체구독배열[i].구독기간);
                                                }
                                            }
                                        } else if (전체구독배열[i].타입.equals("프리미엄")) {
                                            System.out.println("구독 번호 : " + 전체구독배열[i].구독번호);
                                            System.out.println("구독 타입 : 프리미엄 (4명)");
                                            System.out.println("구독한 개월 : " + 전체구독배열[i].구독기간);
                                            System.out.print("연장할 개월 : ");
                                            String a = scanner.nextLine();
                                            for (int i2 = 0; i2 < a.length(); i2++) {
                                                if (!(a.charAt(i2) >= 48 && a.charAt(i2) <= 57)) {//입력받은 아스키코드가 숫자 아니면
                                                    System.out.println("숫자로 입력하세요.");
                                                    break;
                                                } else {
                                                    //run3 = false;
                                                    전체구독배열[i].구독기간 += Integer.parseInt(a);
                                                    System.out.println("총 구독 개월 수 : " + 전체구독배열[i].구독기간);
                                                }
                                            }
                                        }

                                    }
                                }

                            }


                        } else if (ch3.equals("3")) { // 구독번호 등록하기
                            System.out.println("------------------------------");
                            if(내정보.구독번호 == 0) {
                                boolean run5 = true;
                                String a; // 받을 구독 번호
                                String b = "";
                                while (run5) {
                                    System.out.print("구독 번호를 입력하세요 : ");
                                    a = scanner.nextLine();
                                    for (int i = 0; i < a.length(); i++) {
                                        if (!(a.charAt(i) >= 48 && a.charAt(i) <= 57)) {//입력받은 아스키코드가 숫자 아니면
                                            System.out.println("숫자로 입력하세요.");
                                            break;
                                        } else {
                                            run5 = false;
                                            break;
                                        }
                                    }
                                    b = a;
                                }
                                for (int i = 0; i < 전체구독배열.length; i++) {
                                    int 인원카운트 = 0;
                                    if (전체구독배열.length == 1 ){
                                        System.out.println("------------------------------");
                                        System.out.println("해당하는 구독번호가 없습니다.");
                                    }
                                    if (전체구독배열[i] != null) {
                                        System.out.println("------------------------------");
                                        if (전체구독배열[i].구독번호 == Integer.parseInt(b)) {
                                            if(전체구독배열[i].구독인원.length==1){
                                                System.out.println("베이직은 1명까지만 가능합니다.");
                                                break;
                                            }
                                            내정보.구독번호 = 전체구독배열[i].구독번호;
                                            //i는 나왔고, 그 i번째 구독배열에 내가 들어간다.
                                            for (int j = 1; j < 전체구독배열[i].구독인원.length; j++) {
                                                if (전체구독배열[i].구독인원[j] == null) {
                                                    전체구독배열[i].구독인원[j] = 내정보.아이디;
                                                    System.out.println("등록되었습니다.");
                                                    break;
                                                }
                                                인원카운트++;
                                                if (인원카운트 == 3) {
                                                    System.out.println("구독인원이 꽉 찼습니다.");
                                                }
                                            }
                                        }else{
                                            System.out.println("해당하는 구독번호가 없습니다.");
                                        }
                                    }
                                }
                            }else{
                                System.out.println("이미 구독 중입니다.");
                            }
                        } else if (ch3.equals("4")) { // 로그아웃, 구독정보 창으로 가기
                            run6 = false;
                        } else { // 다른 버튼 눌렀을 때.
                            System.out.println("------------------------------");
                            System.out.println("잘못된 입력입니다.");
                        }
                    }
                }
            } // 로그인 중일 때 보이는 반복,
        }

    }

}

class 유저정보2 {
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

class 구독2{
    int 구독번호 = -1;
    String[] 구독인원;
    String 타입;
    int 구독기간;

}