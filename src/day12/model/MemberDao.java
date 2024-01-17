package day12.model;

import day12.controller.MemberController;

import java.util.ArrayList;

public class MemberDao {
    //DAO : 데이터베이스 접근 객체
    // 싱글톤 또 생성
    private MemberDao(){} //생성자 막고
    private static MemberDao memberDao = new MemberDao(); // 하나 생성자 여 안에서 만들어서
    public static MemberDao getInstance(){ return memberDao; } // 생성자로 부를수 있게만.
    
    
    //DB 대신에 배열
        // 배열 사용시 불편한 점 : 고정길이
    //MemberDto[] memberDtos = new MemberDto[100];
        // 고정길이 배열을 가변길이 배열로 구현 => 제공하는 라이브러리/컬렉션(수집) 프레임워크(라이브러리집합)
        // 컬렉션 프레임워크 : ArrayList 가변길이 배열을 지원하는 클래스
        // ArrayList<여러개저장할객체의타입1>
            // 저장 : js[.push(저장할 객체)] vs java[.add(저장할 데이터)] js의 push와 똑같은 역할,,!
        ArrayList<MemberDto> memberDtos = new ArrayList<>();
    // 1. 회원가입 처리 메소드
    public boolean signup(MemberDto memberDto){
        System.out.println("MemberDao.signup"); // 함수실행 잘 됐는지 안됐는지 soutm
        System.out.println("memberDto = " + memberDto); //매개변수 잘 들어갔는지 soutp
        //SQL 처리하고(원래는)// 지금은 배열을 씀. 나중엔 배열 XX
        //1. 비즈니스 로직
        memberDtos.add(memberDto);
        return true;

    }
}
//        for(int i =0; i<memberDtos.length; i++){
//        if(memberDtos[i]==null){
//memberDtos[i]=memberDto;
//                return true; //break; 역할이랑 비슷함. 함수 끝. 회원가입 성공
//                        }
//                        }
//return false; // 회원가입 실패