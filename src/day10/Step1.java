package day10;

public class Step1 {

     //클래스 사용 목적 : 1. 라이브러리(설계도)클래스 2.실행클래스(main 함수)

    public static void main(String[] args) {
        // 1. 객체 생성
        캐릭터 캐릭터하나 = new 캐릭터("자바맨", 200);
        캐릭터 캐릭터셋 = new 캐릭터();
        캐릭터셋.닉네임 = "자바맨2";
        System.out.println("캐릭터셋.닉네임 = " + 캐릭터셋.닉네임);

        System.out.println("캐릭터하나.닉네임 = " + 캐릭터하나.닉네임);
        System.out.println("캐릭터하나.toString() = " + 캐릭터하나.toString());
        캐릭터 캐릭터둘 = new 캐릭터("클래스맨", 250);
        System.out.println("캐릭터둘.닉네임 = " + 캐릭터둘.닉네임);
        
        // 2. 필드 사용
        캐릭터하나.직업 = "마법사";
        System.out.println("캐릭터하나.직업 = " + 캐릭터하나.직업);
        캐릭터둘.직업 = "전사";
        System.out.println("캐릭터둘.직업 = " + 캐릭터둘.직업);

        // 3. 메소드 호출
            캐릭터하나.공격();
        System.out.println("캐릭터하나.toString() = " + 캐릭터하나.toString());
            캐릭터둘.공격();
        System.out.println("캐릭터둘.toString() = " + 캐릭터둘.toString());
    } // me
} // ce
/*
*
*   - 객체 : 물리적으로 존재하거나 개념적인 것 중ㅈ에서 다른것과 식별 가능한 것
*           - 속성(필드), 동적(메소드)
*           - 특징 : 캡슐화, 상속, 다형성
*   - 클래스 : 객체를 생성할 때 필요한 설계도
*   - 인스턴스 : 클래스로부터 생성된 객체
*                                               -----> 인스턴스화 -----> 인스턴스(객체)
*           개발자 -----> 설계 -----> 클래스(틀)
*                                               -----> 인스턴스화 -----> 인스턴스(객체)
*   - 클래스 구성멤버
*           1. 필드 : 객체의 !!데이터가 저장!!되는 곳
*                   - 필드 vs 변수
*                       필드 : 클래스{} 안에서 선언  / 객체 내부 존재 / 객체 내. 외부 사용
*                       변수 : 함수 {} 안에서 선언 / 생성자,메소드 호출시 존재 / 생성자, 메소드 내부에서만 사용.
*                   - 필드/배열 기본 값
*                       정수 : 0, 실수 : 0.0or0.0F 논리 false 참조타입 null
*
*                   - 호출
*                       - 객체가 없으면 호출 불가능
*                       - 도트(.)연산자를 이용한 사용 : 객체명.필드명
*
*           2. 생성자 : !!객체 생성시 초기화 담당!!하는 곳
*                   - new 연산자는 객체를 생성한 후 연이어 생성자를 호출해서 객체를 초기화(생성시 처음값 설정)하는 담당
*                           - 클래스명 변수명 = new 클래스/생성자();
*                   - 생성자
*                           - 기본 생성자
*                                   - 클래스에 생성자 정의가 없을경우 자동으로 추가되는 생성자
*                           - 생성자 정의
*                                   - 1. 리턴타입/ 리턴 없어요.
*                                   - 2. 클래스명 동일
*                                   - 3. 매개변수
*                                   - 4. 목적 : 객체의 필드 초기화 및 유효성 검사
*                           - 생성자 오버로딩
*                                   - !매개변수!의 타입, 개수, 순서가 다르게 여러 개의 생성자 선인
* 
*           3. 메소드 : 객체의 동적으로 !!호출 시 실행!!되는 블록
*               - 메소드 선언
*                   1. 리턴타입 : 메소드가 실행한 후 호출 한 곳으로 전달하는 결과의 타입, 없으면 void
*                   2. 메소드명 : 첫글자가 소문자인 카멜 표기법 권장
*                   3. 매개변수 : 메소드를 호출할 때 전달한 매개값을 받기 위해
*                   4. 실행블록 : 메소드 호출 시 실행되는 블록
*                   5. 리턴값 (리턴타입 void일 경우 생략 가능)
*               - 메소드 호출
*                   - 객체가 없으면 호출 불가능, 단 main 함수 제외.
*                   - 도트(.)연산자를 이용한 사용 : 객체명.메소드명()
*                   - 메소드 반환값을 변수 저장: 리턴타입 변수 = 객체명.메소드명() ,, 변수불러내면 됨.
* */