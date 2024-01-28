package day18SoloTest.Model.DAO;

import day18SoloTest.Model.DTO.MemberDto;

public class MemberDao { // Dao도 한개

    private  MemberDao(){}
    private  static MemberDao memberDao = new MemberDao();
    public  static MemberDao getInstance(){
        return memberDao;
    }

    public int signup(MemberDto memberDto){ //시작하기전 미리 리턴을 뭘로할지 생각해놓자.
        // 혼자만의 설계니까 하면서 바꿀수도 있지만, 그냥 협업한다는 가정하에 설계
        // 리턴을 인트로 받고 0은 회원가입완료 1은 id 중복 2는 잘못된 입력

        return 2;
    }
}
