package day18SoloTest.View;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MainView {
    Scanner scanner = new Scanner(System.in); // 필드로 선언해서 다른데서도 다 쓸수 있게.
    public void run(){//실제 전체 구동뷰가 보일 메소드
        while (true){
            System.out.println("============ 메인 페이지 ============");
            System.out.println("1.회원가입 2.로그인"); // 회원가입과 로그인 구현해보기
            try {   // 만약에 try{}안에서 예외가 발생하면 catch로 이동
                System.out.print("선택 > ");int ch = scanner.nextInt();
                if(ch==1){
                    new MemberView().signup();
                }
                else if(ch==2){
//                    MemberView.getInstance().login();
                }
                else{
                    System.out.println("<안내> 알 수 없는 기능 번호입니다.");
                }
                //catch는 다중catch가 가능하다.
            }catch (InputMismatchException e){ // 인풋미스매치 되면 실행
                System.out.println(e);
                scanner = new Scanner(System.in); // 해줘야 다시 와일문 돌면서 new Scanner.nextInt();로 실행되니까.
            }catch(Exception e){ // 그 외 오류들
                System.out.println(e);
                scanner = new Scanner(System.in);
            }
        }
    }
}
