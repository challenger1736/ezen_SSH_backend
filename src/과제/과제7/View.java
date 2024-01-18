package 과제.과제7;

import java.util.Scanner;

public class View {

        private View(){};
        private static View view = new View();

        public static View getInstance(){
            return view;
        }



        Scanner scanner = new Scanner(System.in);
    void run(){
        while (true) {
            System.out.println("1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기");
            String ch = scanner.nextLine();
            if (ch.equals("1")) {
                System.out.println("회원가입 실행");
                System.out.print("회원가입 아이디 : ");
                String id = View.getInstance().scanner.nextLine();
                System.out.print("회원가입 비밀번호 : ");
                String pw = View.getInstance().scanner.nextLine();
                System.out.print("회원가입 이름 : ");
                String name = View.getInstance().scanner.nextLine();
                System.out.print("회원가입 전화번호 : ");
                String pno = View.getInstance().scanner.nextLine();
                System.out.print("회원가입 나이 : ");
                String age = View.getInstance().scanner.nextLine();
                MemberDto memberDto = new MemberDto(id,pw,name,pno,age);
                Controller.signup(memberDto);
                if(Controller.signup(memberDto)){
                    System.out.println("회원가입 성공");
                }else{
                    System.out.println("회원가입 실패");
                }
            } else if (ch.equals("2")) {
                System.out.println("로그인 실행");
                System.out.print("로그인 아이디 : ");
                String id = View.getInstance().scanner.nextLine();
                System.out.print("로그인 비밀번호 : ");
                String pw = View.getInstance().scanner.nextLine();
                MemberDto memberDto = new MemberDto(id,pw);
                Controller.login(memberDto);
                if(Controller.login(memberDto)){
                    System.out.println("로그인 성공");
                }else{
                    System.out.println("로그인 실패");
                }
            } else if (ch.equals("3")) {
                System.out.println("아이디 찾기 실행");
                System.out.print("가입하신 전화번호 : ");
                String pno = View.getInstance().scanner.nextLine();
                MemberDto memberDto = new MemberDto();
                memberDto.set전화번호(pno);
                Controller.idSearch(memberDto.get전화번호());
                if(Controller.idSearch(memberDto.get전화번호()).equals("")){
                    System.out.println("찾으시는 아이디가 없습니다.");
                }else{
                    System.out.println("찾으시는 아이디 : "+ Controller.idSearch(memberDto.get전화번호()));
                }

            } else if (ch.equals("4")) {
                System.out.println("비밀번호 찾기 실행");
                System.out.print("가입하신 아이디 : ");
                String id = View.getInstance().scanner.nextLine();
                MemberDto memberDto = new MemberDto();
                memberDto.set아이디(id);
                Controller.pwSearch(memberDto.get아이디());
                if(Controller.pwSearch(memberDto.get아이디()).equals("")){
                    System.out.println("찾으시는 아이디가 없습니다.");
                }else{
                    System.out.println("찾으시는 비밀번호 : "+ Controller.pwSearch(memberDto.get아이디()));
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
