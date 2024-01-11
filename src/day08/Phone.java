package day08;

public class Phone {
    
    // 1. 필드 // 필드와 지역변수는 다르다. 지역변수의 리터럴 int i = 1;은 힙에 저장된다.
    String name;
    String number;

    // 2. 생성자
        // 1. 생성자명 : 클래스명통일
        // 2. ( ) 안에 매개변수를 정의한다.
        // 3. { } 안에 생성자 호출시 처리할 명령어를 작성한다.
    public Phone(String name, String number) { // 유효성 검사용
        this.name = name;
        this.number = number;
    }


    // 3. 메소드
}
