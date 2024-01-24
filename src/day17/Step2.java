package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Step2 {
    public static void main(String[] args) {
        // 1. DB연동
            // 1. mysql 드라이버를 메모리에 로딩한다. (드라이버 객체 등록)
            // 2. 예외처리 필수 : try{}catch(예외클래스명 변수){}
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");// 해당 DB를 연동하는 작업 불러오기

            // 예외처리 필수 : try{}catch(예외클래스명 변수){}
            // 연동 성공시 반환객체 : Connection 객체 (statement) 구현객체 생성, 트랜잭션 처리, DB연결 끊을때 사용
            Connection connection =
            DriverManager.getConnection(  // 2. 위에서 등록된 드라이버객체를 이용한 db연동 ("jdbc:mysql://ip번호:포트번호/db명 , 계정 , 비밀번호)
                    "jdbc:mysql://localhost:3306/test5",
                    "root",
                    "1234");
            System.out.println("<DB연동 성공>");

            // 3. SQL 작성하고 SQL 실행
            //C
            connection.prepareStatement("insert into table1 values(2, '유재석');").executeUpdate(); //DB에서 테스트한 것을 실행하는 것
            //R
            connection.prepareStatement("update table1 set 데이터필드2 = '강호동';").executeUpdate(); //DB에서 테스트한 것을 실행하는 것
            //U
            connection.prepareStatement("delete from table1").executeUpdate(); //DB에서 테스트한 것을 실행하는 것
        }catch (ClassNotFoundException e){
            System.out.println(e);
        } catch (SQLException e){
            System.out.println(e);
        } // 이렇게 catch(){}catch(){}연달아도 가능.


    }
}
