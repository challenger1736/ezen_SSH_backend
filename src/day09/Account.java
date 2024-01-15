package day09;

public class Account { // 데이터 모델 : 기능에 대한 함수는 따로 빼는 경우가 많다.

    //필, 생, 메
    String 계좌번호;
    String 계좌주;
    int 계좌의돈;

    public Account(String 계좌번호, String 계좌주, int 계좌의돈) {
        this.계좌번호 = 계좌번호;
        this.계좌주 = 계좌주;
        this.계좌의돈 = 계좌의돈;

    }
}
