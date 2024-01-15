package 클라우드구독시스템;

import java.util.Scanner;

import static 클라우드구독시스템.Main.main;
import static 클라우드구독시스템.Main.전체유저배열;

public class 기능구현 {
    //필드
    String ch;
    String loginID;
    String loginPw;
    static boolean run = true;
    static 유저정보 신규가입정보 = new 유저정보();
    String 가입Pw;
    String 가입이름;

    //생성자
    //메소드
    void ch(){
        Scanner scanner = new Scanner(System.in);
        ch = scanner.nextLine();
    }

    void loginID(){
        Scanner scanner = new Scanner(System.in);
        loginID = scanner.nextLine();
    }
    void loginPw(){
        Scanner scanner = new Scanner(System.in);
        loginPw = scanner.nextLine();
    }
    void 회원가입(){
        Scanner scanner = new Scanner(System.in);
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
                run = false;
            }
        }
    }
    void 가입Pw(){
        Scanner scanner = new Scanner(System.in);
        가입Pw = scanner.nextLine();
    }
    void 가입이름(){
        Scanner scanner = new Scanner(System.in);
        가입이름 = scanner.nextLine();
    }

}
