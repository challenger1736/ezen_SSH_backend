package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Step1 {
    public static void main(String[] args) {
        try { // 만약에 해당 클래스를 못찾았을때 대처
            //1.Class.forName() : 현재 프로젝트내 클래스 찾기
            // 실행전에는 이 해당 Class가 있는지 없는지 외부정보를 받아오는 것이기 때문에 모른다. 그래서 try-catch문을 써야한다.
            Class.forName("com.mysql.cj.jdbc.Driver");// mysql 라이브러리 위치를 정해놓은 것.
//        Class.forName("oracle.jdbc.OracleDriver");// oracle 라이브러리 위치를 정해놓은 것.
            // 1. MYSQL 회사 driver 클래스를 찾기
            // 2. 해당 폴더내 driver 클래스를 찾는 과정에서 없으면 오류가 발생 할 수도 있다.
            // ClassNotFoundException : 클래스를 찾지 못했다는 것.

            // com 폴더내 mysql 폴더내 cj 폴더내 jdbc 폴더내 있는 Driver
        }catch (ClassNotFoundException 매개변수명){
            System.out.println("[시스템오류] : JDBC 드라이버 클래스를 찾지 못했어."+매개변수명); // 오류확인을 위한 + 매개변수명.
        }
        try { // 만약에 해당 연동할 db서버의 정보가 잘못되거나 db서버쪽에 문제가 발생했을때 대처
            //2. Connection : db연동 인터페이스
            // 인터페이스 타입으로 변수를 선언
            Connection connection;
            // 인터페이스는 스스로 객체를 만들수 없다 [추상]
            // !!! : 구현체(구현 객체 - 구현클래스(implements)로 생성된 객체)
            // DriverManager.getConnection("DB서버주소/DB명", "계정명", "비밀번호") : 연동해서 연동된 구현체 반환
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test5", // localhost 는 현재 ip를 말하는 것.
                    "root",
                    "1234");
            System.out.println("[시스템정보] : DB서버와 연동 성공했습니다.");
        }catch (SQLException easdf){
            System.out.println("[시스템오류] : MYSQL 서버와 연동이 실패했습니다."+ easdf); // 오류확인을 위한 + 매개변수명.
        }

    }//me
}//ce

/*

    예외/오류 처리 : 1. 일반예외 2. 실행예외
        - 예외/오류가 발생했을때 대처 하기위해.
        1. 일반예외 : 컴파일시 예외 체크 = 컴파일시 발생
            - 실행 전에 미리 오류가 발생
            - 주로 자바 외부와 통신하는 클래스들 ( 키보드, DB서버, 파일처리 등등등)
            - 1. Scanner 클래스
            - 2. Dao 클래스(DB 연동되는 객체기 때문에)
        2. 실행예외 : 실행중에 발생한 예외/오류 = 발생한 예외/오류        = 경험적으로 해결가능, 알지못하면 미리 대처 힘듬.
            - NullPointerException


    예외/오류 처리
        - 만약에 예외가 발생할 것 같은 코드에 처리
        - 문법
            try{} catch{} (예외클래스명 변수){}
*/

/*

    자바와 DB 서버 연결
        0. JDBC Driver : 각 DBMS 회사에서 다운로드 받으세요.

        1. IP : 인터넷 프로토콜 = 인터넷 사용하고 있는 PC들의 식별번호
            - pc 1대당 1개 할당
            - 서로 다른 pc들간의 데이터 통신시 pc를 식별하기 위해
            - 예시] 집주소 (친구에게 우편 보내기 우해 집주소)
        2. PORT :프로그램 식별번호
            - pc 1대당 65535 가진다.
            - 프로그램(프로세스) 식별하는 번호
            - mysql : 주로 3306포트를 쓰고 / oracle : 주로 1521 / http : 주로 80을 씀
            - 예시] ip가 집주소라면, port는 방번호(집에서 방을 식별하는 번호)
        3. DB서버의 계정/ 비밀번호
            root / 1234
        4. DB서버내 여러개 DB중 사용할 DB
======================================================================================

1. MYSQL Connector/J 다운로드
        - mysql-connector-j-8.3.0.jar
2. 프로젝트에 라이브러리 등록/추가.
        1. mysql-connector-j-8.3.0.jar 파일 복사
        2. mysql-connector-j-8.3.0.jar 오른쪽 클릭, 라이브러리 추가
        3. 확인방법
            메뉴 > 파일 > 프로젝트 구조 > (사이드메뉴)라이브러리


 */
