package 팀과제.팀과제3.Model;

public class 농협DTO extends 은행DTO{
    private String 포인트;
    public 농협DTO(){}
    public 농협DTO(String 계좌번호, String 계좌주, int 입금액, String 포인트) {
        super(계좌번호, 계좌주, 입금액);
        this.포인트 = 포인트;
    }

    public String get포인트() {
        return 포인트;
    }

    public void set포인트(String 포인트) {
        this.포인트 = 포인트;
    }
}
