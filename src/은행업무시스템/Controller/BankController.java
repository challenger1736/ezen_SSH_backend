package 은행업무시스템.Controller;

import day12.model.MemberDao;
import day13.Step4.package1.B;

public class BankController {

    private BankController(){};
    private static BankController bankController = new BankController();
    public static BankController getInstance(){return bankController;}

    String 계좌번호;

    public int 계좌번호유효성(String 계좌번호){
        if(!(계좌번호.length()==4)){
            return 1; // 계좌번호 4자리인지
        }
        for(int i = 0; i< 계좌번호.length(); i++){ //계좌번호 검사
            if(!(계좌번호.charAt(i)>=48&&계좌번호.charAt(i)<=57)){
                return 2; // 계좌번호 숫자인지
            }
        }
        return 3;
    }

    public void 신한signup(){

    }


}
