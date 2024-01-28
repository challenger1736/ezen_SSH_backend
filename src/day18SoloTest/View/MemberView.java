package day18SoloTest.View;


import day18SoloTest.Controller.Controller;
import day18SoloTest.Model.DTO.MemberDto;

import java.util.Scanner;

public class MemberView {

    Scanner scanner = new MainView().scanner;
    public void signup(){//실제 메인뷰에서 구동되는 메소드
        System.out.println("============ 회원 가입 ============");
        System.out.print("가입할 아이디를 입력하세요 : "); String id = scanner.next();
        System.out.print("가입할 비밀번호를 입력하세요 : "); String pw = scanner.next();
        System.out.print("가입할 분의 이름을 입력하세요 : "); String name = scanner.next();
        MemberDto memberDto = new MemberDto();
        memberDto.setMid(id);
        memberDto.setMpw(pw);
        memberDto.setMname(name); // dto에 넣는거 까지는 뷰에서 하기도 하는듯.
        // 넣은 dto객체를 보내기.<컨트롤러로 전환>
        if(Controller.getInstance().signup(memberDto)==0){
            System.out.println("============ 회원 가입완료 ============");
        }else if(Controller.getInstance().signup(memberDto)==1){
            System.out.println("중복된 아이디가 있습니다.");
        }else{
            System.out.println("뭔 오류가 날려나?");
        }


    }

    public void login(){
        System.out.print("아이디 : ");      String id = scanner.next();
        System.out.print("비밀번호 : ");    String pw = scanner.next();
        // dto에 담기
        MemberDto memberDto = new MemberDto();
        memberDto.setMid(id); memberDto.setMpw(pw);
        // 3 전달후 결과
        boolean result = Controller.getInstance().login(memberDto);//컨트롤러 메소드 호출자리
        // 4. 결과 출력
        if (result){
            System.out.println("<안내> 로그인 성공");
           // BoardView.getInstance().run(); // 로그인하면 여기서 함수가 실행됨.
        }else {
            System.out.println("<안내> 로그인 실패");
        }

    }

}
