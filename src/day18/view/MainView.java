package day18.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainView {

    private static MainView mainView = new MainView();

    private MainView(){};

    public static MainView getInstance(){
        return mainView;
    }

    Scanner scanner = new Scanner(System.in);
    public void run(){

        while (true){
            System.out.println("============ 메인 페이지 ============");
            System.out.println("1.회원가입 2.로그인");
            try {   // 만약에 try{}안에서 예외가 발생하면 catch로 이동
                System.out.print("선택 > ");int ch = scanner.nextInt();
                if(ch==1){
                    MemberView.getInstance().signup();
                }
                else if(ch==2){
                    MemberView.getInstance().login();
                }
                else{
                    System.out.println("<안내>알 수 없는 기능 번호입니다.");
                }
                //catch는 다중이 가능하다.
            }catch (InputMismatchException e){
                System.out.println(e);
                scanner = new Scanner(System.in);
            }catch(Exception e){ // 그 외
                System.out.println(e);
                scanner = new Scanner(System.in);
            }
        }

    }
}//ce
