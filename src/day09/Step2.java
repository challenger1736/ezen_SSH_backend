package day09; // 챕터 6 확인문제 20번 풀어보기

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        Account[] BankApplication = new Account[100]; // BA라는 배열을 만듬 Account가 들어가는.
        boolean run = true; // 종료시 false;
        Scanner scanner = new Scanner(System.in);
        while(run){
            System.out.println("---------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------");
            System.out.print("선택 > ");
            String ch = scanner.nextLine(); // ch 는 1~5중 선택
            if(!(ch.equals("1")||ch.equals("2")||ch.equals("3")||ch.equals("4")||ch.equals("5"))){
                System.out.println("1~5사이의 숫자를 입력하세요.");
                continue;
            }
            if(ch.equals("1")){   // 계좌 생성
                System.out.println("---------");
                System.out.println("계좌생성");
                System.out.println("---------");

                System.out.print("계좌번호 : "); String input번호 = scanner.nextLine();
                System.out.print("계좌주 : "); String input주 = scanner.nextLine();
                System.out.print("초기입금액 : "); int input초기입금 = scanner.nextInt();
                Account 계좌하나 = new Account(input번호, input주, input초기입금);

                for(int i =0 ; i<BankApplication.length ; i++){
                    if( BankApplication[i] == null){
                        BankApplication[i] = 계좌하나; break;
                    }
                }
                System.out.print("결과 : 계좌가 생성되었습니다.\n");
            }
            else if(ch.equals("2")){// 계좌 목록 보기
                System.out.println("---------");
                System.out.println("계좌목록");
                System.out.println("---------");

                for(int i =0 ; i<BankApplication.length ; i++){
                    if(BankApplication[i]!=null){
                System.out.printf("%6s %6s %6d\n", BankApplication[i].계좌번호, BankApplication[i].계좌주, BankApplication[i].계좌의돈 );}
                }
            }
            else if(ch.equals("3")){// 계좌 예금 추가
                System.out.println("---------");
                System.out.println("예금");
                System.out.println("---------");

                System.out.print("계좌번호 : "); String input번호 = scanner.nextLine();
                System.out.print("예금액 : "); int input추가입금 = scanner.nextInt();
                for(int i =0; i <BankApplication.length; i++){
                    if(BankApplication[i] ==null){System.out.println("맞는 계좌번호가 없습니다."); break;} //삭제가 없기때문에 이빨 빠질일이 없어서 가능
                    if(BankApplication[i].계좌번호.equals(input번호)){

                        BankApplication[i].계좌의돈 += input추가입금; break;
                    }
                }
            }
            else if(ch.equals("4")){
                System.out.println("---------");
                System.out.println("출금");
                System.out.println("---------");
                System.out.print("계좌번호 : "); String input번호 = scanner.nextLine();
                System.out.print("출금액 : "); int input출금액 = scanner.nextInt();
                for(int i =0; i <BankApplication.length; i++){
                    if(BankApplication[i]!=null){
                        if(BankApplication[i].계좌번호.equals(input번호)){
                            BankApplication[i].계좌의돈 -= input출금액;
                            System.out.println("출금이 성공되었습니다.");
                            break;
                        }
                    }else {
                        System.out.println("맞는 계좌번호가 없습니다.");break;
                    }
                }
            }
            else if(ch.equals("5")){ // 종료
                System.out.println("프로그램 종료");
                run = false;
            }

        }
    }
}
