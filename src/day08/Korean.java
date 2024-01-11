package day08;

public class Korean {
    //클래스 멤버
    //1. 필드
    private String nation = "대한민국"; // 필드는 일반적으로 공개로 쓰지 않음,,
    private String name;
    private String ssn;
    //2. 생성자
        // - 객체들간의 다른 값을 가져야할 때
        // - 오버로딩 : 매개변수의 타입, 개수, 순서에 따라 여러개 선언 가능
        // 1. 생성자명 작성한다. 단 클래스명도 동일
        // 2. ( ) 안에 매개변수를 정의한다.
 /*   Korean(String n, String s){ // 매개변수 명과 현재 객체내 필드명과 중복 발생할 수 있다.
        // 여기서는 유효성 검사를 넣을 수 있으므로, 아무래도 이렇게 넣는게 더 좋다.
        name = n;
        ssn = s;
    } */
    Korean(String name, String ssn){
        // 여기서는 유효성 검사를 넣을 수 있으므로, 아무래도 이렇게 넣는게 더 좋다.
        this.name = name;
        this.ssn = ssn;         // 실무에서는 this를 주로 씀, 알려주기위해서. 관례적으로 동일하게하기 위해
                                // --> 문제 : 외부로 들어온 매개변수와 원래 객체내 있던 필드명과 충돌하기 때문에 this.를 쓴다.
                                // 구분 : this. = 현재 객체 호출. 생각보다 많이 중요함!

    }

    public Korean() { // 기본 생성자
    }
    //3. 메소드

    // 객체의 주소값 대신 객체의 필드정보 출력시 사용되는 함수
    // 오른쪽 클릭 -> 생성 -> toString()
    @Override
    public String toString() { // 쓰면 주소대신에 객체 정보를 알려주는 String이 나옴,,
        return "Korean{" +
                "nation='" + nation + '\'' +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
