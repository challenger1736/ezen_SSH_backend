package day18.model.dao;

import day18.model.dto.MemberDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao extends Dao {

//    public static void main(String[] args) {
//        MemberDao.getInstance();
//    } DB연동 테스트용 메인 메소드

    private MemberDao(){}
    private static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){
      return memberDao;
    }

    //연동

    public int signup(MemberDto memberDto){
        // 1. SQL 작성 [ 변수가 들어갈 자리에는 ?로 대체한다 ]
        try {
            String sql = " insert into member(mid, mpw, mphone) values (?, ?, ?);";
            // 2. SQL 기재
            ps = conn.prepareStatement(sql);
            // ? 매개변수 대입
            ps.setString(1, memberDto.getMid()); // 기재된 SQL내 첫번째 ?에 값 대입
            ps.setString(2, memberDto.getMpw()); // 기재된 SQL내 첫번째 ?에 값 대입
            ps.setString(3, memberDto.getMphone()); // 기재된 SQL내 첫번째 ?에 값 대입

            // 3. SQL 실행 // 4. SQL 결과
            int count = ps.executeUpdate();//executeUpdate() 기재된 sql 실행하고 insert된 레코드 개수 반환.
            if (count == 1) {
                return 0;
            }//1이면 성공 만약에 insert 처리된 레코드가 1개이면 회원가입 성공
        }catch (Exception e){
            System.out.println(e);
        }
        // 5. 함수 종료
        return 1; // 실패 샘플
    }

    //0. 아이디 중복 검사
    public boolean idCheck(String mid){
        //1. SQL 작성한다.
        try {
            String sql = "select mid from member where mid = ?;";
            //2. SQL 기재한다.
            ps = conn.prepareStatement(sql);
            // +? 매개변수 대입
            ps.setString(1, mid); // 첫번쨰 물음표에 mid를 넣어라
            //3. SQL 실행한다.
            rs = ps.executeQuery(); //select는 Query : 질의/검색 결과를  rs 인터페이스 대입.
            //4. SQL 결과처리
            if (rs.next()) { // rs.next() : 검색 결과 테이블에서 다음레코드 이동.
                return true;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        //5. 함수종료
      return false;
    };

    // 2.로그인 확인용
    public boolean login(MemberDto memberDto){
        try {
            //1. SQL 작성한다.
            String sql = "select*from member where mid = ? and mpw = ?";
            //2. SQL 기재한다.
            ps = conn.prepareStatement(sql);
            //? 매개변수 대입
            ps.setString(1, memberDto.getMid());
            ps.setString(2, memberDto.getMpw());
            //3. SQL 실행한다.
            rs = ps.executeQuery();
            //4. SQL 결과처리한다.
            // 만약에 select의 결과물이 하나의 레코드 존재하면 성공 아니면 실패
            if (rs.next()) {
                return true;
            }
        }catch (Exception e){
            System.out.println(e); // 나면 SQL 문제
        }

        return false;
    }

    //
    public int findMno(String mid){
        try {
            //1. SQL 작성한다.
            String sql = "select mno from member where mid = ?";
            //2. SQL 기재한다.
            ps = conn.prepareStatement(sql);
            //? 매개변수 대입
            ps.setString(1, mid);
            //3. SQL 실행한다.
            rs = ps.executeQuery();
            //4. SQL 결과처리한다.
            if(rs.next()){
                // rs.next() : 다음레코드 이동함수 boolean
                // rs.get타입(호출할 필드 번호 or 필드 이름) : 현재 레코드의 필드값 호출
                return rs.getInt("mno");
            };
        }catch (Exception e){
            System.out.println(e);
        }

      return 0;
    };

}
