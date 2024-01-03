package day01; // 패키지명

public class Step2 {    // 클래스 시작
    public static void main(String[] args) { // 메인 함수 시작, main

        //p.37
        /*int abc;// 변수 선언했지만 초기값 없기 떄문에 메모리 할당 없음.
        int result = abc + 10; // 오류발생 [ 초기값 없는 변수를 호출했기 때문에 오류 발생 ]
        // java: variable abc might not have been initialized 초기값이 없음!*/

        // 해결방안 : 초기값 대입하자
        int abc = 5;
        int result = abc + 3;
        System.out.println(result);

    }   // 메인 함수 끝
}   // 클래스 끝


