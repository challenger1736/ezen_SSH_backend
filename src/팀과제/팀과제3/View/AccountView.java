package 팀과제.팀과제3.View;


import 팀과제.팀과제3.Controller.Controller;

public class AccountView {

    private static AccountView accountView = new AccountView();
    private AccountView(){};
    public static AccountView getInstance(){
        return accountView;
    };

    public void 계좌생성(){
        System.out.println("-----------------------------");
        System.out.println("1. 계좌생성 실행");
        System.out.print("계좌주 입력 : ");
        String 계좌주 = MainView.getInstance().scanner.nextLine();
        System.out.print("계좌번호 입력 : ");
        String 계좌번호 = MainView.getInstance().scanner.nextLine();
        System.out.print("초기입금액 입력 : ");
        int 초기입금액 = MainView.getInstance().scanner.nextInt();
//        if(Controller.getInstance().계좌번호유효성(acno)==1){
//            System.out.println("계좌번호는 4자리로 입력해주세요.");
//            return;
//        }
//        else if(Controller.getInstance().계좌번호유효성(acno)==2){
//            System.out.println("계좌번호는 숫자로 입력해주세요.");
//            return;
//        }
            Controller.getInstance().계좌생성(계좌주, 계좌번호, 초기입금액);
            if(Controller.getInstance().계좌생성(계좌주, 계좌번호, 초기입금액)){
                System.out.println("계좌가 생성되었습니다.");
            }else{
                System.out.println("계좌 생성 실패");
            }
    }
    public void 예금(){
        System.out.println("-----------------------------");
        System.out.println("2. 예금 실행");
        System.out.print("계좌번호 입력 : ");
        String 계좌번호 = MainView.getInstance().scanner.nextLine();
        System.out.print("초기입금액 입력 : ");
        int 입금액 = MainView.getInstance().scanner.nextInt();

        System.out.println("계좌번호 : " + 계좌번호);
        System.out.println("계좌에 있는 금액 : "+ Controller.getInstance().예금(계좌번호, 입금액)+"원");


    }

    public void 출금(){
        System.out.println("-----------------------------");
        System.out.println("2. 예금 실행");
        System.out.print("계좌번호 입력 : ");
        String 계좌번호 = MainView.getInstance().scanner.nextLine();
        System.out.print("출금액 입력 : ");
        int 출금액 = MainView.getInstance().scanner.nextInt();

        System.out.println("계좌번호 : " + 계좌번호);
        System.out.println("계좌에 있는 금액 : "+ Controller.getInstance().출금(계좌번호, 출금액)+"원");
    }



}
