package day17;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Step3 {

    //0. Class.forName("JDBC드라이버 클래스 경로")
    //  - 해당 클래스 찾아서 JDBC드라이버 객체(DriverManager) 자동 등록한다.

    //1. DriverManager [클래스] - 각자 회사에서 만든 것.
    //  - 연동 성공하면 Connection 구현체(객체)를 반환한다. (연동된 객체를 변수로 담아야한다.)
    //  1-1. 연동함수 .getConnection("jdbc:mysql://ip번호:port번호/db명" , "db계정명" , "db계정비밀번호")
    //  - ip 번호 = localhost : 현재 pc라는 뜻
    //  - port 번호 = mysql 은 3306 자주 씀.

    //2. Connection [인터페이스]
    //  - statement , PreparedStatement 구현 객체를 반환한다.(sql기재)
    //  2-1. connection.prepareStatement(SQL) ; SQL이 기재된 Statement구현체 반환한다.

    //3. PreparedStatement [인터페이스]
    //  - DDL , DML 문을 실행할떄 사용한다.
    //  3-1. 실행
    //      3-1-1. insert, update, delete => .executeUpdate();
    //      3-1-2. select => .executeQuery();

    //4. ResultSet [인터페이스]
    //  - DB에서 가져온 데이터를 읽을때 사용한다.
    //  1. 다음 레코드 이동(boolean) : .next()  // 다음레코드 이동후 존재하면 true 없으면 false
    //  2. 현재 레코드 필드 값 호출   : .get타입(호출할 필드순서번호 or 필드명);
                                //: .getString() : 문자타입 호출
                                //: .getInt()    : 정수타입 호출

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 입력 객체
        Connection connection = null;
        try {
            //DB연동
            // 1.JDBC 드라이버 로딩한다.
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. DB서버와 연동 후 연동객체를 반환 받는다.
            connection =
                    DriverManager.getConnection(  // 2. 위에서 등록된 드라이버객체를 이용한 db연동 ("jdbc:mysql://ip번호:포트번호/db명 , 계정 , 비밀번호)
                            "jdbc:mysql://localhost:3306/test5",
                            "root",
                            "1234");
            System.out.println("<DB연동 성공>");
        } catch (Exception e){
            System.out.println(e); // 왜 오류나는지 알기 위해.
        }


        while(true){//무한 루프

            System.out.println("고객명단 : 1.삽입 2.출력 3.수정 4.삭제");
            System.out.println("선택> ");

            try {
                int ch = scanner.nextInt();
                if(ch==1){
                    //1.입력받기
                    System.out.print("저장 고객명 :"); String name = scanner.next();
                    //2.DB에 저장한다.
                    //connection.prepareStatement("insert into members values('유재석')").executeUpdate();
                    String sql = "insert into members values('"+name+"')";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate(); // executeUpdate는 int로 몇 row가 영향받았는지 나옴.
                } else if (ch==2) { // 출력
                    // 조건 없이 모든 출력 , 입력받기X
                    // 모든 필드를 표시하는 모든 레코드 출력
                    String sql = "select * from members";
                    ResultSet resultSet = connection.prepareStatement(sql).executeQuery();
                    // ResultSet를 가져옴 일반적으로 출력은 executeQuery를 쓴다.
                    // System.out.println(resultSet); // select 결과물 가지고 있는 인터페이스
                    // .next() : 다음 레코드로 이동후 존재여부 true/false 반환 함수.
//                    System.out.println(resultSet.next()); 2쥴일 경우 true
//                    System.out.println(resultSet.next()); 2쥴일 경우 true
//                    System.out.println(resultSet.next()); 2쥴일 경우 false
                    //resultSet.next(); // 신동엽true
                    //resultSet.next(); // 유재석true
                    while(resultSet.next()){
                        //하나씩 넥스트로 이동하면서 반복처리 만약에 다음레코드가 존재하면 실행
                        // 다음 레코드가 존재하지 않으면 false이므로 와일문 종료가 된다.
                        System.out.println( resultSet.getString("name"));
                        // .get타입(가져올 필드순서 번호 or 필드명)
                    } // while문<
                    /*

                        ResultSet : 인터페이스 ---------------------> select 결과물(표)
                            null                                    name    age
                                                                    유재석   30
                                                                    신동엽   29


                     */




                } else if (ch==3) {
                    //1.입력받기
                    System.out.print("수정할 고객명 :"); String oldName = scanner.next();
                    System.out.print("새로운 고객명 :"); String newName = scanner.next();
                    //2.DB에 저장한다.
                    String sql = "update members set name='"+newName+"' where name = '"+oldName+"'";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();

                } else if (ch==4) {
                    //1.입력받기
                    System.out.print("삭제할 고객명 :"); String deleteName = scanner.next();
                    //2.DB에 저장한다.
                    String sql = "delete from members where name ='"+deleteName+"'";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();

                }
            }catch (InputMismatchException e){
                System.out.println("<시스템오류> 정상적인 입력값이 아닙니다."+e);
                scanner = new Scanner(System.in); // 기존에 입력받은 바이트를 초기화
           } catch(SQLException e){
                System.out.println("<시스템오류> SQL에서 오류가 발생했습니다."+e);
            }
            // if vs Exception

        }// while e
    }// main e
}// class e
