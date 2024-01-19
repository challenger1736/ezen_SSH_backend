package 팀과제.팀과제3.Model;

public class 은행DTO {
    String 계좌번호;
    String 계좌주;
    int 입금액;

    public 은행DTO() {
    }

    public 은행DTO(String 계좌번호, String 계좌주, int 입금액) {
        this.계좌번호 = 계좌번호;
        this.계좌주 = 계좌주;
        this.입금액 = 입금액;
    }

    public String get계좌번호() {
        return 계좌번호;
    }

    public void set계좌번호(String 계좌번호) {
        this.계좌번호 = 계좌번호;
    }

    public String get계좌주() {
        return 계좌주;
    }

    public void set계좌주(String 계좌주) {
        this.계좌주 = 계좌주;
    }

    public int get입금액() {
        return 입금액;
    }

    public void set입금액(int 입금액) {
        this.입금액 = 입금액;
    }
}
