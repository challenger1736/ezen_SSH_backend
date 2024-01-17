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
}
