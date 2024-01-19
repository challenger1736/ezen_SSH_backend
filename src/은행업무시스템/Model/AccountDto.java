package 은행업무시스템.Model;

public class AccountDto {
    String 계좌주;
    String 계좌번호;
    String 입금액;


    public AccountDto() {
    }

    public AccountDto(String 계좌주, String 계좌번호, String 입금액){
        this.계좌주 = 계좌주;
        this.계좌번호 = 계좌번호;
        this.입금액 = 입금액;
    }



}
