package day06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        
        // p.153 문자열 타입
        String name;        // 스택영역(변수) 선언
        name = "홍길동";     // 스택영역에 힙영역(객체) 주소 대입
        String hobby = "여행"; // 힙영역의 주소를 스택영역에 대입
        // 2. 문자열 비교
            // 1. ==
        String name1 = "홍길동";
        String name2 = "홍길동"; // "" 큰따옴표 자체에 문자열객체 생성에 의미를 포함(주소가 자동생성) 해놨음.
        System.out.println(name1);
        System.out.println(name1 == name2); // 같다.
            // 2. new 연산자 : 객체를 생성할때 사용되는 키워드
        String name3 = new String("홍길동");
        System.out.println(name2 == name3); // false // 주소를 비교
        String name4 = new String("홍길동");
        System.out.println(name3 == name4); // false

        System.out.println(name1.equals(name2)); // 힙끼리 비교 (내부비교)
        System.out.println(name2.equals(name3));

            //4.
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next();

        System.out.println(name1==inputName);
        System.out.println(name1.equals(inputName));
        // 입력받은 문자열이 리터럴인가 new 문자열인가? new임 당연히!
        // 라이브러리는 항상 new로 생성됨, 리터럴로 만드는순간 자기 코드와 겹칠 확률이 있다! "홍길동"

            //5. null vs "" vs " "
        // null = 주소없다, 객체없다
        String hobby2 = "";
        if(hobby2=="") { // 이건 equals 안써도됨.
            System.out.println("hobby변수가 참조하는 String 객체는 빈 문자열");
        }else {
            System.out.println("ㅇㅇ");
        }
        String hobby3 = null;
        if(hobby3 !=null && hobby3.equals("")){}// null에다가 equals를 쓸 수가 없음. 객체가 없기때문, 주소가 없기때문. .(점)을 찍을 수 없다.
    }
}
