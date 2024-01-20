package day12.view;

import day12.controller.MemberController;
import day12.model.MemberDto;

import java.util.Scanner;

public class MemberView {
    //VIEW : 화면구현 (입출력)
    //싱글톤
    private MemberView(){};
    private static MemberView memberView = new MemberView();
    public static MemberView getInstance(){return memberView;}
    //회원가입 view 메소드
    public void signup(){
        //MainView.getInstance(): 싱글톤(미리 만들어진 단 하나의 객체) 호출
        Scanner scanner = MainView.getInstance().scanner;
        // 1. 입력받는다.
        System.out.print("아이디 : "); String id = scanner.next();
        System.out.print("비밀번호 : "); String pw = scanner.next();
        System.out.print("이름 : "); String name = scanner.next();
        System.out.print("전화번호 : "); String phone = scanner.next();
        // 2. 객체화
        MemberDto memberDto = new MemberDto(0,id,pw,name,phone);
        // 3. 객체를 컨트롤에게 전달(매개변수/회원가입 필요한 정보.객체)후
                // 처리 결과(return값/회원가입 처리 결과)를 받기
        boolean result = MemberController.getInstance().signup(memberDto);
        if(result){
            System.out.println("안내] 회원가입 성공");
        }else{
            System.out.println("안내] 회원가입 실패");
        }

    }
    //로그인 메소드
    public void login(){
        System.out.println("[1] MemberView.login");
        Scanner scanner = MainView.getInstance().scanner; // 메인뷰에서 필드선언한놈을 가져온다.
        // 1. 입력받는다.
        System.out.print("아이디 : "); String id = scanner.next();
        System.out.print("비밀번호 : "); String pw = scanner.next();
        // 2. 객체 vs 2개 문자열
        MemberDto memberDto = new MemberDto();
        memberDto.setId(id); memberDto.setPw(pw);

        //3. 컨트롤에게 전달하고 결과 받기
        boolean result = MemberController.getInstance().login(memberDto);
        System.out.println("[5] result = " + result);
        if(result){
            System.out.println("안내] 로그인 성공");
                // 로그인 성공시 사용할 서비스의 view로 이동하는거 구현(오늘은 X)
        }else{
            System.out.println("안내] 로그인 실패");
        }
    }

    //아이디 찾기
    public void idResearch(){
        System.out.println("MemberView.idResearch");
        Scanner scanner = MainView.getInstance().scanner;
        // 1. 입력받는다.
        System.out.print("가입하신 휴대폰 번호를 입력하세요 : "); String phone = scanner.next();
        // 2. 객체 vs 2개 문자열
        MemberDto memberDto = new MemberDto();
        memberDto.setPhone(phone);

        // 3. 컨트롤에게 전달하고 결과 받기
        String result = MemberController.getInstance().idResearch(memberDto);
        System.out.println("result = " + result);
        if(!(result.equals(""))){
            System.out.println("안내] 찾으시는 아이디 : " + result);
        }else{
            System.out.println("찾는 아이디가 없습니다.");
        }
    }


    //비밀번호 찾기
    public void pwResearch(){
        System.out.println("MemberView.idResearch");
        Scanner scanner = MainView.getInstance().scanner;
        // 1. 입력받는다.
        System.out.print("가입하신 아이디를 입력하세요 : "); String id = scanner.next();
        // 2. 객체 vs 2개 문자열
        MemberDto memberDto = new MemberDto();
        memberDto.setId(id);

        // 3. 컨트롤에게 전달하고 결과 받기
        boolean result = MemberController.getInstance().pwResearch(memberDto);
        System.out.println("result = " + result);
        if(result){
            System.out.println("안내] 비밀번호 찾기 성공");
        }else{
            System.out.println("안내] 비밀번호 찾기 실패");
        }
    }
}
