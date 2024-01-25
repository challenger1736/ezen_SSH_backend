package day18.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
    protected Connection conn; // 여러 함수에서 사용하려고, 여러 메소드에서 사용하려고 / 필드는 무조건 private
    //Connection은 DB연동 객체, PreparedStatement를 생성 해준다. 인터페이스
    protected PreparedStatement ps; // 작성된 SQL 가지고있고 매개변수 지원 , 실행담당 인터페이스.
    protected ResultSet rs;        // SQL 실행 결과!!를 갖고 있는 인터페이스
    public Dao(){ // 생성자 : 객체 생성시 초기화 담담
        // 객체 생성시 db 연동. DAO의 목적이 db연동이니까

        try {
            //1.mysql 회사의 jdbc 관련된 객체(Driver)를 로딩 JVM에 로딩한다. 불러오기.
            //사실 외부 라이브러리는 외부 라이브러리 폴더(자바)에 없다.
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.연동된 결과의 객체(구현체)를 Connection인터페이스에 대입한다.
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java",
                    "root",
                    "1234"
            );

            System.out.println("<DB연동 성공>");
        }catch (Exception e){
            System.out.println(e);
        }
    };
}
