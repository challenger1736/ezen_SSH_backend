package day18SoloTest.Controller;

import day18SoloTest.Model.DAO.MemberDao;
import day18SoloTest.Model.DTO.MemberDto;

public class Controller {// 컨트롤러는 하나인게 낫다

    private Controller(){};
    private static Controller controller = new Controller();
    public  static Controller getInstance(){
        return controller;
    }

    public int signup(MemberDto memberDto){ //시작하기전 미리 리턴을 뭘로할지 생각해놓자.
        // 혼자만의 설계니까 하면서 바꿀수도 있지만, 그냥 협업한다는 가정하에 설계
        // 리턴을 인트로 받고 0은 회원가입완료 1은 id 중복 2는 잘못된 입력
        int result = MemberDao.getInstance().signup(memberDto);
        return result;

    }
}
