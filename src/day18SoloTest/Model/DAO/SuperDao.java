package day18SoloTest.Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class SuperDao {

    SuperDao(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java",
                "root",
                "1234"
        );
        System.out.println("<DB연동 성공>");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
