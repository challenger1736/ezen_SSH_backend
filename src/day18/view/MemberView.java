package day18.view;


import day18.controller.MemberController;
import day18.model.dto.MemberDto;

import java.util.Scanner;

public class MemberView {

    // 싱글톤
    private static MemberView memberView = new MemberView();
    private MemberView(){};
    public static MemberView getInstance(){
        return memberView;
    }
    Scanner scanner = MainView.getInstance().scanner;
    // 1. 회원가입 // 설계를 짤 때 매개변수, 메소드이름, 리턴 정도는 정할 필요가 있다.
    public void signup(){
        // 1. 입력받기 JS가 된다.
        System.out.print("아이디 : ");      String id = scanner.next();
        System.out.print("비밀번호 : ");    String pw = scanner.next();
        System.out.print("전화번호 : ");    String phone = scanner.next();
        // 2. 객체화
        MemberDto memberDto = new MemberDto(id,pw,phone);

        // 3. 컨트롤러에게 전달
        // int result = 1; // 샘플을 받았다 치고 넣어놓기 결과.
        int result = MemberController.getInstance().signup(memberDto);
        // 4. 결과에 따른 출력까지 끝
        if(result==0){
            System.out.println("<안내> 회원가입 성공");
        }else if(result==1){
            System.out.println("<안내> 시스템 내부 오류 관리자에게 문의");
        }else if(result==2){
            System.out.println("<안내> 사용중인 아이디 입니다.");
        }else{
            System.out.println("<안내> 기타 오류");
        }
    }

    public void login(){
        // 1 입력
        System.out.print("아이디 : ");      String id = scanner.next();
        System.out.print("비밀번호 : ");    String pw = scanner.next();
        // 2 dto에 담기
        MemberDto memberDto = new MemberDto();
        memberDto.setMid(id); memberDto.setMpw(pw);
        // 3 전달후 결과
        boolean result = MemberController.getInstance().login(memberDto);//컨트롤러 메소드 호출자리
        // 4. 결과 출력
        if (result){
            System.out.println("<안내> 로그인 성공");
            BoardView.getInstance().run();
        }else {
            System.out.println("<안내> 로그인 실패");
        }

    }

}
