package 클라우드구독시스템;


import static 클라우드구독시스템.기능구현.신규가입정보;

public class Main {

    static 유저정보[] 전체유저배열 = new 유저정보[1]; // 1개로 새로 배열 생성됨.
    static 구독정보[] 전체구독배열 = new 구독정보[1];
    public static void main(String[] args) {

        유저정보 내정보 = new 유저정보();
        //프로그램 시작
        System.out.println("------------------------------");
        System.out.println("1. 로그인 2. 회원가입 ");
        기능구현 기능구현1 = new 기능구현();
        기능구현1.ch();
        if(기능구현1.ch.equals("1")){//로그인 시
            System.out.println("------------------------------");
            내정보 = null;
            System.out.print("로그인 - 아이디 입력 : ");
            기능구현1.loginID();
            System.out.print("로그인 - 비밀번호 입력 : ");
            기능구현1.loginPw();

            for (int i = 0; i < 전체유저배열.length; i++) {
                if (전체유저배열[i] != null) { // null이 아닐때만 검사하므로 null일때는 그냥 로그인 되어버리는 이유<< 18번째 줄 참고.
                    if (전체유저배열[i].아이디.equals(기능구현1.loginID) && 전체유저배열[i].비밀번호.equals(기능구현1.loginPw)) {
                        내정보 = 전체유저배열[i]; //배열내 i번째 id와 pw가 같으면, 전체유저i번째를 로그인중이라는 로그인 유,무에 저장
                        System.out.println("로그인 성공");
                        if(내정보.구독번호 != 0){
                            System.out.println("내 구독 번호 : " + 내정보.구독번호);
                        }else{
                            System.out.println("아직 구독 중이 아닙니다.");
                        }
                        break;
                    }
                }
            }
            if(내정보 == null){
                System.out.println("로그인 실패");
            }
        } else if (기능구현1.ch.equals("2")) { // 회원가입 시
            유저정보[] 전체유저배열2 = new 유저정보[전체유저배열.length+1];
            System.out.println("------------------------------");
            while (기능구현1.run) {
                기능구현1.회원가입();
            }
            System.out.print("회원 가입할 비밀번호를 입력하세요 : ");
            기능구현1.가입Pw();
            신규가입정보.비밀번호 = 기능구현1.가입Pw; // 새로받은 패스워드 값 넣기.

            System.out.print("회원 가입할 분의 이름을 입력하세요 : ");
            기능구현1.가입Pw();
            신규가입정보.이름 = 기능구현1.가입이름; // 가입 이름 대입
        } else{ // 로그인 회원가입 말고 다른 입력
            System.out.println("잘못된 입력입니다.");
        }

    }
}
