package day06;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        //p157 : 문자열 객체 함수
        // 1. .charAt(인덱스) : 문자 추출 매개변수 : / 리턴값 :
        String ssn = "9506241230123";   // 문자열
        char sex = ssn.charAt(6);
        switch (sex){
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':
                case '4':
                    System.out.println("여자입니다.");
                    break;
        }   // s e
        // -- 문자 입력받기.
        Scanner scanner = new Scanner(System.in);
        char result = scanner.next().charAt(0); // 첫 글자 입력 받기, 한 글자 입력 받기
        // -- 문자열에서 특정 문자 검색
        String str = "안녕하세요";
        for(int i = 0 ; i< str.length(); i++){
            System.out.println( str.charAt(i));
        }
        // 2. 문자열 길이 : .length(); 매개변수 : 없음 / 반환값 : int  문자열길이를 int로 반환해주는 함수
            // - 공백 포함 (주의)
        int length = ssn.length();
        if (length==13){
            System.out.println("주민등록 자리수가 맞습니다.");
        }else{
            System.out.println("주민등록번호 자릿수가 틀립니다.");
        }

        // 3. 문자열 대체 : 문자열.replace(); 매개변수 : 변경할 문자열, 새로운 문자열 / 반환값 : 대체된 새로운 문자열
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace("자바", "JAVA"); // 앞에 newStr 안쓰면 OldStr 바뀐거 볼 수 없음.

        System.out.println(oldStr);
        System.out.println(newStr);

        // - 특정 문자열 바꿔야할때., - 특정 불필요한 데이터 대체.
        String str1 = "안녕하세요<br/>유재석";
        str1.replace("</br>","\n");
        // - 악의적인 데이터 대체, 또는 욕설 필터링 데이터 대체
        String str2 = "안녕하세요 alert() 유재석";

        // 4. 문자열 잘라내기 : 문자열.subString()
            // 매개변수 : (1)   (2) 시작인덱스. 끝인덱스 / 반환타입 : 잘라낸 문자열 추출(String)
        String ssn2 = "880815-1234567";
        String firstNum = ssn2.substring(0,6);   // 0~5번 인덱스 추출
        System.out.println("firstNum = " + firstNum);

        String secondNum = ssn2.substring(7); // 7인덱스부터 마지막 인덱스까지 추출
        System.out.println("secondNum = " + secondNum);

        // 5. 문자열에서 문자열 찾기 : 문자열.indexOf()
            // 매개변수 : "찾을 문자열" / 반환타입 : 찾은 문자열의 인덱스 번호 (int) 없으면 -1, 있으면 012345..

        String subject = "자바 프로그래밍";
        // "자바 프로그래밍" 문자열에서 "프로그래밍" 문자열 찾기
        int location = subject.indexOf("프로그래밍");
        System.out.println("location = " + location);
        String substring = subject.substring(location);
        System.out.println("substring = " + substring);
        // ----> 3번인덱스부터 마지막인덱스까지 자르기 --> 프로그래밍

        //------------//
        location = subject.indexOf("자바");
        if (location != -1){
            System.out.println("자바와 관련된 책이군요.");
        }else {
            System.out.println("자바와 관련없는 책이군요.");
        }

        // indexOf()와 contains()의 차이  반환값의 차이 indexOf는 int로 추출, contains()는 true false로 반환

        boolean result2 = subject.contains("자바");
        if(result2){
            System.out.println("자바와 관련된 책이군요.");
        }else {
            System.out.println("자바와 관련없는 책이군요.");
        }

        // 6. 문자열 분리 : 문자열.split()
            // 매개변수 : 구분자   // 반환타입 : 배열(문자열[])

        String  board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
        String[] strArray = board.split(",");
        System.out.println("board = " + board);
        System.out.println("strArray = " + strArray);
        System.out.println("번호 : " + strArray[0]);
        System.out.println("제목 : " + strArray[1]);
        System.out.println("내용 : " + strArray[2]);
        System.out.println("성명 : " + strArray[3]);

    }
}
