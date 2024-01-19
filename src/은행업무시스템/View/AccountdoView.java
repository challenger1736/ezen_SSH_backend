package 은행업무시스템.View;

import 은행업무시스템.Controller.BankController;



public class AccountdoView {
    private static AccountdoView accountdoView = new AccountdoView();
    private AccountdoView(){};
    public static AccountdoView getInstance(){
        return accountdoView;
    };

    public void signuUpAccount(){
        System.out.println("-----------------------------");
        System.out.println("1. 계좌생성 실행");
        System.out.print("계좌주 입력 : ");
        String acname = MainView.getInstance().scanner.nextLine();
        System.out.print("계좌번호 입력 : ");
        String acno = MainView.getInstance().scanner.nextLine();

        if(BankController.getInstance().계좌번호유효성(acno)==1){
            System.out.println("계좌번호는 4자리로 입력해주세요.");
            return;
        }
        else if(BankController.getInstance().계좌번호유효성(acno)==2){
            System.out.println("계좌번호는 숫자로 입력해주세요.");
            return;
        }

        if(acno.charAt(0)=='1'){
            //앞자리 1이면 신한은행 실행
            BankController.getInstance().신한signup();
        }else if(acno.charAt(0)=='2'){
            //앞자리 2이면 국민은행 실행
        }else if(acno.charAt(0)=='3'){
            //앞자리 3이면 농협은행 실행
        }else{
            System.out.println("계좌번호 형식이 잘못되었습니다.");
        }


    };

}
