package day18SoloTest.Controller;

import day18SoloTest.Model.DAO.MemberDao;
import day18SoloTest.Model.DTO.MemberDto;

public class  Controller {// 컨트롤러는 하나인게 낫다

    private Controller(){};
    private static Controller controller = new Controller();
    public  static Controller getInstance(){
        return controller;
    }

    public int signup(MemberDto memberDto){ //시작하기전 미리 리턴을 뭘로할지 생각해놓자.
        // 혼자만의 설계니까 하면서 바꿀수도 있지만, 그냥 협업한다는 가정하에 설계
        // 리턴을 인트로 받고 0은 회원가입완료 1은 id 중복 2는 잘못된 입력
        if(MemberDao.getInstance().idCheck(memberDto)){return 1;} // 메소드의 리턴 boolean으로 받아서 1 실행
        int result = MemberDao.getInstance().signup(memberDto);
        return result;

    }


    int loginMno = 0;
    public boolean login(MemberDto memberDto){
        boolean result = false; // 기본 세팅들

        // 1. dao에게 login 처리 요청하고 결과 받기.
        result = MemberDao.getInstance().login(memberDto);
        if(result){
            // 3. login 성공한 회원번호 dao 요청.
            loginMno = MemberDao.getInstance().findMno(memberDto.getMid()); //로그인 확인용 인트
        }

        return result; // 기본 세팅들
    }




}
