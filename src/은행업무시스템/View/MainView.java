package 은행업무시스템.View;

import java.util.Scanner;

public class MainView {

    private static MainView mainView = new MainView();
    private MainView(){};
    public static MainView getInstance(){
        return mainView;
    };
    Scanner scanner = new Scanner(System.in);
    public void run() {
        System.out.println("-----------------------------");
        System.out.println("1. 계좌생성 | 2. 예금 | 3. 출금 ");
        String ch = scanner.nextLine();
        if(ch.equals("1")){AccountdoView.getInstance().signuUpAccount();}
        else if(ch.equals("2")){}
        else if(ch.equals("3")){}
        else{
            System.out.println("잘못된 입력입니다.");
        }

    }

}
