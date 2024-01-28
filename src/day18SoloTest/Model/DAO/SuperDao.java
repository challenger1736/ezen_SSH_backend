package day18SoloTest.Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SuperDao {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    SuperDao(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 불러오기
            conn = DriverManager.getConnection( // 커넥트하기
                "jdbc:mysql://localhost:3306/java",
                "root",
                "1234"
        );
        System.out.println("<DB연동 성공>");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public PreparedStatement getPs() {
        return ps;
    }

    public void setPs(PreparedStatement ps) {
        this.ps = ps;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
}
