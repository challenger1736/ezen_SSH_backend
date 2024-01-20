package day12.controller;

import day12.model.MemberDao;
import day12.model.MemberDto;

public class MemberController {
    // CONTOLLER : VIEW와 DAO의 중계 역할
    // 회원가입 메소드

    // 싱글톤 또 생성
    private MemberController(){} //생성자 막고
    private static MemberController memberController = new MemberController(); // 하나 생성자 여 안에서 만들어서
    public static MemberController getInstance(){ return memberController; } // 생성자로 부를수 있게만.

    public boolean signup(MemberDto memberDto){ //상호 작용
        //System.out.println("[2] MemberController.signup");
        boolean result = MemberDao.getInstance().signup(memberDto);
        return result; // 아래 결과를 리설트로 또 받기.
    }

    String loginSession = null; // null이면 비로그인 null대신에 아이디가 있으면 로그인중

    //로그인 메소드
    public  boolean login(MemberDto memberDto){
        //System.out.println("[2] MemberController.login");
        boolean result = MemberDao.getInstance().login(memberDto);
        System.out.println("[4] result = " + result);

        if(result){
            // 로그인 상태 필드에 로그인 성공한 아이디를 대입한다.
            loginSession = memberDto.getId();
        }

        return result;
    }

    public String idResearch(MemberDto memberDto){
        //System.out.println("MemberController.idResearch");
        String result = MemberDao.getInstance().idResearch(memberDto);

        return result;
    }

    public boolean pwResearch(MemberDto memberDto){
        //System.out.println("MemberController.idResearch");
        boolean result = MemberDao.getInstance().pwResearch(memberDto);

        return result;
    }



}
