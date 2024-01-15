package day10;

public class Account { // 설계 클래스(라이브러리 .접근연산자) // 데이터 저장 목적
    //클래스 멤버
    //1. 필드
    String 계좌번호;
    String 계좌주;
    int 입금액;
    //2. 생성자
        // 1. 기본생성자
        Account(){}
        // 2. 모든 필드를 받는 생성자
        Account(String 계좌번호, String 계좌주, int 입금액){
            this.계좌번호 = 계좌번호;
            this.계좌주 = 계좌주;
            this.입금액 = 입금액;
        }
    //3. 메소드

    // private 이면 메소드나 생성자로 값을 넣어줘야한다. 대부분 계좌번호 이런것들은 .으로 못들어가게 private으로 해놓기 때문에
    // 메소드의 this, 생성자의 this로 넣는다.
}
