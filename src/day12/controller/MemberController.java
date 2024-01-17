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
        System.out.println("MemberController.signup");
        boolean result = MemberDao.getInstance().signup(memberDto);
        return result; // 아래 결과를 리설트로 또 받기.
    }
}
