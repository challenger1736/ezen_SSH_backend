package day03;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            // !!! Scanner 클래스 입력시 [ 라이브러리 -> 호출 ] 자동완성시 상단의 클래스 위에 import 에 등록됨, 직접입력시 자동완성 X
            // System, String 등등 import를 안해도됨, 기본적으로 해놨기 때문에.
        //if 조건문
        //1.
        System.out.print("정수 입력 : ");
        int point = scanner.nextInt();
            // 만약 내가 입력한 값이 저장된 point 변수가
            // 80보다 잇아이면 true 출력문이 실행되고 아니면 false 면 실행안된다.
        if(point>=80){
            System.out.println("입력받은 값은 80이상 입니다.");}


        if(point>=90){
            System.out.println("합격");
        }else{
            //System.out.println('불'+'합'+'격'); // 147354로 나옴 연산 쓰는순간 바로 그냥 숫자로 취급함(char)
            System.out.println("불합격");
        };

        if(point>=90){
            System.out.println("A등급");
        }else if(point>=80){
            System.out.println("B등급");
        }else if(point>=70){
            System.out.println("C등급");
        }else{
            System.out.println("탈락");
        }
        //vs 여러번 사용될 수 있음.
        if(point>=90){
            System.out.println("A등급"); return;
        };
        if(point>=80){
            System.out.println("B등급");
        };
        if(point>=70){
            System.out.println("C등급");
        }

        //4. 중첩 조건
        char sex = 'M'; //차라서 == 쓸 수 있음
        if (sex == 'M' || sex == 'm'){ //만약에 성별이 M이면
            // 남자이면서 90점 이상이면
           if(point>=90){
               System.out.println("남자 우수상");
           }
        }else{ //아니고 성별이 w(여자)이면
            // 여자이면서 90점 이상이면
            if(point>=90){
                System.out.println("여자 우수상");
            }
        }

        // 예시 ) 스위치 변수(on/off, 참/거짓, true/false ) 활용[ step3 16 ]
        String id = scanner.next();
        String pw = scanner.next();
            // equals() : 문자열 비교 메소드 지원

        boolean sw = false;

        if(id.equals("admin")&&pw.equals("1234")){sw = true;}
        
        if(sw){
            System.out.println("로그인 성공");
        }else {
            System.out.println("로그인 실패");
        }



    }
}

/*
    if 문 [조건문]
        - 경우의수 따른 흐름 제어
        - 조건 : boolean
            - if(true), if(false)
            - boolean 변수 = true; if(변수)
            - if(3>5), if(3>1&&3<10)
            - int 변수 = 10; if(변수-10>5)
            - if(함수()){} 함수의 return 값이 boolean이면 가능함

            - 삼항연산자 vs 조건문 if
                - 간단하면 삼항 연산자
                - 조건이 길어지면 읽기 힘들다.
                - 참, 거짓 : 함수 정의, 실행하는데 있어서 제약이 있음. 세미콜론을 인식해야 마지막 말이 되기 때문에.
        - 형태
            1. if(조건문){참실행문}
            2. if(조건문){참실행문}
                else{거짓실행문}
            3. 하나만 실행
                if(조건1){참실행문}
                else if(조건2){참실행문}
                else if(조건3){참실행문}
                else{}

               여러개 실행
                if(조건1){참실행문}
                if(조건2){참실행문}
                if(조건3){참실행문}
            4. 중첩
                if(){
                    if(){}
                    else(){}
                    }
                else(){
                    if(){}
                    else(){}
                }

*/