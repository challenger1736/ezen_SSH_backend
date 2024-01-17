package day12.view;

import java.util.Scanner;

    public class MainView {
    //VIEW : 화면구현 (입출력)
    /*
    * 싱글톤 : 프로그램 내 하나의 객체를 사용 패턴.
    * //1. 중복적인 객체생성을 줄이기 위해서.(동일한 기능의 동일한 객체)
    * */
    private static MainView mainView = new MainView();
    private MainView(){}

    public static MainView getInstance() { //리턴값이 메인뷰인 메소드.
        return mainView;
    }
    Scanner scanner = new Scanner(System.in);
    // 필 소 메
    public void run(){
        while(true){
            System.out.println("--------메인페이지-------");
            System.out.println("1.회원가입 2.로그인 3.아이디 찾기 4.비밀번호 찾기");
            System.out.print("선택>");
            int ch = scanner.nextInt();

            if(ch==1){ // 회원가입 페이지 이동
                MemberView.getInstance().signup();
            }
            else if(ch==2){ // 로그인 페이지 이동
                MemberView.getInstance().login();
            }else if(ch==3){ // 아이디 찾기 페이지 이동
                MemberView.getInstance().idResearch();
            }else if(ch==4){ // 비밀번호 찾기 페이지 이동
                MemberView.getInstance().pwResearch();
            }
        }
    }

}
