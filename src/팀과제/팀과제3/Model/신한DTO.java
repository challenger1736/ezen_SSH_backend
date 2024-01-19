package 팀과제.팀과제3.Model;

public class 신한DTO extends 은행DTO {
    private String 마일리지;
    public 신한DTO(){}
    public 신한DTO(String 계좌번호, String 계좌주, int 입금액, String 마일리지) {
        super(계좌번호, 계좌주, 입금액);
        this.마일리지 = 마일리지;
    }

    public String get마일리지() {
        return 마일리지;
    }

    public void set마일리지(String 마일리지) {
        this.마일리지 = 마일리지;
    }
}
