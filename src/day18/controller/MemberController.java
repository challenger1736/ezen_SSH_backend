package day18.controller;


import day18.model.dao.MemberDao;
import day18.model.dto.MemberDto;

public class MemberController {

  private static MemberController memberController = new MemberController();
  private MemberController(){};
  public static MemberController getInstance(){
      return memberController;
  }

  //1. 회원가입
  public int signup(MemberDto memberDto){
      //1. 반환 변수

            //3. 가공처리/로직
                //1. 만약에 입력받은 아이디의 길이가 8글자 미만이면 실패
//      if(memberDto.getMid().length()<8){
//          return 3;
//      }

                //2.아이디 중복 검사 입력받은 Dto  내 입력받은 id를 전달해서 그 idCheck 메소드의 리턴(boolean)이 나오면
      if(MemberDao.getInstance().idCheck(memberDto.getMid())){return 2;} //true면 2가 나옴
      int result = MemberDao.getInstance().signup(memberDto);
                //3. 회원가입 요청
//      result = 0; // 샘플
      //2. 반환
      return result;
  }
// 로그인 상태 필드 [ boolean 했다/안했다. , String 아이디/null, int 회원번호/0(foreign key, pk 연결 때문에 이게 좋다.), 아니면 아예 Dto 객체자체를 넣어주기/null ]
   int loginMno = 0; // 오늘은 (Mno)인트로 진행

    public int getLoginMno() {
        return loginMno;
    }

    public boolean login(MemberDto memberDto){ //뷰에서 id 랑 pw 받았지
      boolean result = false; // 기본 세팅들

      // 1. dao에게 login 처리 요청하고 결과 받기.
      result = MemberDao.getInstance().login(memberDto);
      if(result){
          // 3. lofin 성공한 회원번호 dao 요청.
           loginMno = MemberDao.getInstance().findMno(memberDto.getMid()); // id mno3  , 3 / loginMno = 3
      }

      return result; // 기본 세팅들
  }

  //2-2 로그아웃
    public void logout(){
      loginMno = 0;
    }

}
