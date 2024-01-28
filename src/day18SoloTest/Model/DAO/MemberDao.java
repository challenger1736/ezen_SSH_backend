package day18SoloTest.Model.DAO;

import day18SoloTest.Model.DTO.MemberDto;

import java.sql.PreparedStatement;

public class MemberDao extends SuperDao { // Dao도 한개

    private  MemberDao(){}
    private  static MemberDao memberDao = new MemberDao();
    public  static MemberDao getInstance(){
        return memberDao;
    }

    public int signup(MemberDto memberDto){ //시작하기전 미리 리턴을 뭘로할지 생각해놓자.
        // 혼자만의 설계니까 하면서 바꿀수도 있지만, 그냥 협업한다는 가정하에 설계
        // 리턴을 인트로 받고 0은 회원가입완료 1은 id 중복 2는 잘못된 입력
        try {
            String sql = "insert into member(mid, mpw, mname) values (?,?,?)";

            getConn().prepareStatement(sql).setString(1, memberDto.getMid());
            getConn().prepareStatement(sql).setString(2, memberDto.getMpw());
            getConn().prepareStatement(sql).setString(3, memberDto.getMname());

            int count =  getConn().prepareStatement(sql).executeUpdate();
            if(count ==1){
                return 0;
            }
        }catch(Exception e){
            System.out.println(e);
        }

        return 2;
    }

    public boolean idCheck(MemberDto memberDto){

        try {
            String sql = "select mid from member where mid = ?;";


            // +? 매개변수 대입
            getConn().prepareStatement(sql).setString(1, memberDto.getMid()); // 첫번쨰 물음표에 mid를 넣어라
            //3. SQL 실행한다.
            getConn().prepareStatement(sql).executeQuery(); //select는 Query : 질의/검색 결과를  rs 인터페이스 대입.
            //4. SQL 결과처리
            if (getConn().prepareStatement(sql).executeQuery().next()) { // rs.next() : 검색 결과 테이블에서 다음레코드 이동.
                return true;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        //5. 함수종료
        return false;
    }

    public boolean login(MemberDto memberDto){
        try {
            //1. SQL 작성한다.
            String sql = "select*from member where mid = ? and mpw = ?";
            //2. SQL 기재한다.
            getConn().prepareStatement(sql);
            //? 매개변수 대입
            getConn().prepareStatement(sql).setString(1, memberDto.getMid());
            getConn().prepareStatement(sql).setString(2, memberDto.getMpw());
            //3. SQL 실행한다.
            //4. SQL 결과처리한다.
            // 만약에 select의 결과물이 하나의 레코드 존재하면 성공 아니면 실패
            if (getConn().prepareStatement(sql).executeQuery().next()) {
                return true;
            }
        }catch (Exception e){
            System.out.println(e); // 나면 SQL 문제
        }

        return false;
    }

    public int findMno(String mid){
        try {
            //1. SQL 작성한다.
            String sql = "select mno from member where mid = ?";
            //2. SQL 기재한다.
            getConn().prepareStatement(sql);
            //? 매개변수 대입
            getConn().prepareStatement(sql).setString(1, mid);
            //3. SQL 실행한다.
            //4. SQL 결과처리한다.
            if(getConn().prepareStatement(sql).executeQuery().next()){
                // rs.next() : 다음레코드 이동함수 boolean
                // rs.get타입(호출할 필드 번호 or 필드 이름) : 현재 레코드의 필드값 호출
                return getConn().prepareStatement(sql).executeQuery().getInt("mno");
            };
        }catch (Exception e){
            System.out.println(e);
        }

        return 0;
    };
}


