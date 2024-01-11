package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        붕어빵틀[] 붕어빵트레이 = new 붕어빵틀[10];
                    // 500번지{ 500번지[null], 501번지[null], 502번지[null], 503번지[null], 504번지[null],...}
                    // 1번째 붕어빵을 구웠어 (1번 굽기.)
                    // 500번지{ 500번지[null], 501번지[null], 502번지[null], 503번지[null], 504번지[null],...}

        while (true){
            System.out.println(Arrays.toString(붕어빵트레이)); // 배열내 객체들의 주소확인.
            System.out.println("1. 굽기 2. 판매");
            int ch = scanner.nextInt();

            if(ch ==1 ){
                System.out.print("속재료 : "); String 입력속재료 = scanner.next();
                // 객체 생성 : 1. new를 쓴다, 2. 클래스명을 쓴다(생성자를 호출한다.)
                붕어빵틀 붕어빵 = new 붕어빵틀();

                붕어빵.속재료 = 입력속재료;

//                new 붕어빵틀(); // 1번 누를 때마다 주소 한번씩 생성. (new)
//                붕어빵트레이[0] = 붕어빵; // if 끝나면 붕어빵 사라지므로 붕어빵틀1개를 실행한 놈을 붕어빵트레이0번에 넣어야지
                for(int i = 0 ; i<붕어빵트레이.length ; i ++){
                    if(붕어빵트레이[i] == null){
                        붕어빵트레이[i] = 붕어빵; break;
                    }
                }

            }// if 끝나면 붕어빵의 지역변수는 사라짐. -> 곧 객체도 사라짐.
            if(ch == 2){
                System.out.println("판매할 붕어빵 위치 : ");
                int dNo = scanner.nextInt();

                // - 자바는 힙영역에 객체를 제거하는 방법을 제공하지 않는다. 그래서 초기값 null을 활용함.
                    // GC : 힙의 객체가 Null이면 자동 삭제가 된다.
                붕어빵트레이[dNo-1] = null;

                for(int i = dNo ; i < 붕어빵트레이.length; i++){
                    // i 는 삭제한 객체의 인덱스 위치부터 마지막 인덱스까지 반복
                    // i+1 : 삭제한 인덱스 뒤
                    if(붕어빵트레이[i+1] != null ){
                        if( i+1 == 붕어빵트레이.length)break; // 마지막 인덱스이면 break;
                        붕어빵트레이[i]= 붕어빵트레이[i+1];

                    }
                }

            }

        }
        
    }
}
/*
* 
*   - 프로그램 : 명령어의 집합체 ( 코드의 집합 ) // .java가 .class로 컴파일되어서 JVM에서 실행할 수 있는 프로그램= java. 자바파일 그자체와 비슷한 개념.
*   - 프로세스 : 컴퓨터에서 실행중인 프로그램    //  각 프로세스는 독립된 메모리 공간, 여러 프로세스는 독립적으로 실행되므로, 각 프로세스는 다른 프로세스의 영향을 받지 않습니다.
*   - 스레드 : 프로세스마다 1개이상 필수 존재하는 흐름 읽어주는 단위 // 경량화된 프로세스라고 볼 수 있음(but 여러개 동시 실행가능, 한번 실행으로)
*           main() : 메인스레드 포함
*       
*           - 스레드마다 스택영역이 생김
*           - 스레드 1                                                 힙영역//필드밖에 못들어감,,       메소드영역
*                   스택영역                                                - 객체(주소)                    - 클래스의 정보 (필드, 생성자, 메소드)
*                       - 프레임1(함수)                                          - 필드                        class Car(){
        *                       - 지역변수1                                                                         String model
        *                       - 지역변수2                                                                         String color
        *                       - 지역변수3                                                                         int speed
        *                           - int 정수 = 10;                                                              }
        *                           - Car car = null;                   new Car()//새로운 주소값이 생김
        *                                             <-----------------
        *                             car = new Car()                       model = "현대자동차"
        *                             car => 302번지                         color = "빨강"
        *                             car.              --------------->    speed = 10;
        *                             car.speed
        *
*                       - 프레임2(2함수)
*                       - 프레임3(함수)
*           - 스레드 2
*                   스택영역
*                       - 프레임(함수)
* 
* 데이터 타입 : 자료형
* 데이터 타입 분류
*           - 기본 타입 : 값 자체 ( 크기 정해져 있음 )
*
*           - 참조 타입 : 주소 참조 ( 크기 정해져 있지 않음 : 개발자 설계에 따른 크기 )
* 
* */