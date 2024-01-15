package day10;

import java.util.Scanner;

public class BankApplication { // 실행 클래스
    //클래스 멤버
    //1. 필드
    static Account[] accounts = new Account[100];
    static Scanner scanner = new Scanner(System.in);// main() 함수 아닌 main() 밖에 정적필드로 선언하는 이유 : 여럿 함수에서 사용할려고.
    // 메모리 효율성은 4개로 나눠서 기능 기능마다 넣는게 더 낫다.( 메모리 효율성 덕에 static이 안 좋은편임. )
    //2. 생성자

    //3. 메소드
        // 1. 실행 시작점 함수 main

        // 2. 계좌 생성함수
        static void 계좌생성(){ // 기능들은 하나로 쓸수 있으니 static 써도 됨.
        System.out.println("BankApplication.계좌생성");
            System.out.println("---------");
            System.out.println("계좌생성");
            System.out.println("---------");
            // 1. 입력받기.
            System.out.print("계좌번호 : "); String input번호 = scanner.nextLine();
            System.out.print("계좌주 : "); String input주 = scanner.nextLine();
            System.out.print("초기입금액 : "); int input초기입금 = scanner.nextInt();
            Account 계좌하나 = new Account(input번호, input주, input초기입금);
            //객체 생성하거나 accounts를 스태틱 하면 되지만 객체 생성은 아무래도 위험성이 있다. 자꾸 자꾸 새로운놈으로 대체되기 때문에.
            for(int i =0 ; i<accounts.length ; i++){
                if( accounts[i] == null){
                    accounts[i] = 계좌하나; break;
                }
            }
            System.out.print("결과 : 계좌가 생성되었습니다.\n");
        } // 계좌 생성 끝

        // 3. 계좌 목록함수
        static void 계좌목록(){
        System.out.println("BankApplication.계좌목록");
            System.out.println("---------");
            System.out.println("계좌목록");
            System.out.println("---------");

            for(int i =0 ; i< accounts.length ; i++){
                if(accounts[i]!=null){
                    System.out.printf("%6s %6s %6d\n", accounts[i].계좌번호, accounts[i].계좌주, accounts[i].입금액 );}
            }
        } //계좌 목록 끝
        
        // 4. 예금
        static void 예금(){
        System.out.println("BankApplication.예금");
            System.out.println("---------");
            System.out.println("예금");
            System.out.println("---------");

            System.out.print("계좌번호 : "); String input번호 = scanner.nextLine();
            System.out.print("예금액 : "); int input추가입금 = scanner.nextInt();
            for(int i =0; i <accounts.length; i++){
                if(accounts[i] ==null){System.out.println("맞는 계좌번호가 없습니다."); break;} //삭제가 없기때문에 이빨 빠질일이 없어서 가능
                if(accounts[i].계좌번호.equals(input번호)){
                    accounts[i].입금액 += input추가입금;
                    break;
                }
            }


        }
        // 5. 출금
        static void 출금(){
        System.out.println("BankApplication.출금");
            System.out.println("---------");
            System.out.println("예금");
            System.out.println("---------");

            System.out.print("계좌번호 : "); String input번호 = scanner.nextLine();
            System.out.print("예금액 : "); int input추가입금 = scanner.nextInt();
            for(int i =0; i <accounts.length; i++){
                if(accounts[i] ==null){System.out.println("맞는 계좌번호가 없습니다."); break;} //삭제가 없기때문에 이빨 빠질일이 없어서 가능
                if(accounts[i].계좌번호.equals(input번호)){
                    accounts[i].입금액 -= input추가입금;
                    break;
                }
            }

        }
    public static void main(String[] args) {



        while (true){
            System.out.println("---------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------");
            System.out.print("선택 > ");
            int ch = scanner.nextInt();
            scanner.nextLine();
            if(ch==1){
                계좌생성(); // 함수를 많이 쓸수록 모듈개발이 된다. 나눠서 사람마다 이렇게 개발 개발.
            }else if(ch==2){
                계좌목록(); // 함수를 많이 쓸수록 모듈개발이 된다. 나눠서 사람마다 이렇게 개발 개발.
            }else if(ch==3){
                예금();       // 함수를 많이 쓸수록 모듈개발이 된다. 나눠서 사람마다 이렇게 개발 개발.
            }else if(ch==4){
                출금();       // 함수를 많이 쓸수록 모듈개발이 된다. 나눠서 사람마다 이렇게 개발 개발.
            }else if(ch==5){
                System.out.println("프로그램 종료");
                break;
            }
        }
    } // m e

} // c e
