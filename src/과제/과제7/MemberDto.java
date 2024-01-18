package 과제.과제7;

public class MemberDto {

    private String 아이디;
    private String 비밀번호;
    private String 이름;
    private String 전화번호;
    private String 나이;

    public MemberDto() {
    }

    public MemberDto(String 아이디, String 비밀번호) {
        this.아이디 = 아이디;
        this.비밀번호 = 비밀번호;
    }

    public MemberDto(String 아이디, String 비밀번호, String 이름, String 전화번호, String 나이) {
        this.아이디 = 아이디;
        this.비밀번호 = 비밀번호;
        this.이름 = 이름;
        this.전화번호 = 전화번호;
        this.나이 = 나이;
    }

    public String get아이디() {
        return 아이디;
    }

    public void set아이디(String 아이디) {
        this.아이디 = 아이디;
    }

    public String get비밀번호() {
        return 비밀번호;
    }

    public void set비밀번호(String 비밀번호) {
        this.비밀번호 = 비밀번호;
    }

    public String get이름() {
        return 이름;
    }

    public void set이름(String 이름) {
        this.이름 = 이름;
    }

    public String get전화번호() {
        return 전화번호;
    }

    public void set전화번호(String 전화번호) {
        this.전화번호 = 전화번호;
    }

    public String get나이() {
        return 나이;
    }

    public void set나이(String 나이) {
        this.나이 = 나이;
    }
}

/*
	주제 : 회원제 시스템 part3
	    [ MVC 패턴 ]
 		- MemberDto 외 MVC패턴 사용하기 위해 아래와 같이 클래스 3개를 추가 설계하시오.
 		1.view 클래스
 		2.controller 클래스
 		3.model(dao·dto) 클래스

		[ MemberDto 클래스 ]
 		1. 아래 private 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		2. 생성자 사용하시오.
		3. getter , setter 메소드를 사용하시오.

        [ 기능 구현 - 과제6 동일 하며 MVC패턴으로 구현하시오. ]
		1. 초기 메뉴 ( VIEW )
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
		2. 기능 조건 ( CONTROLLER , DAO )
			1. 회원가입 메소드
			2. 로그인 메소드
			3. 아이디찾기 메소드
			4. 비밀번호찾기 메소드
*/



