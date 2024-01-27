package day18SoloTest.View;

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

    }

}
