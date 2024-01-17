package day12.model;

public class MemberDto { // 이동할 객체의 봉지(쇼핑백)
    //DTO : 데이터 이동 객체 ( 객체 ) : 주로 필드 게터 세터만 들어감. / 싱글톤 쓸 일 없다!
        // - 복잡한 로직을 하는 곳은 아니다. 단순 데이터의 이동을 위한
        // 1. 저장할 필드 선정
        // 2. 생성자(개발자 용도에 따라 선언), 권장 : 기본생성자(안써도 깡통만들기), 풀생성자
        // 3. 메소드(형변환, 필드getter/setter 등 호출 용도로 많이 쓰인다.) 권장: getter/setter, toString

    // 1. 필드
    private int no;
    private String id;
    private String pw;
    private String name;
    private String phone;
    // 2. 생성자
    public MemberDto(){} //1기본 생성자
    // 2풀 (모든 필드의 매개변수가 존재하는) 생성자
    public MemberDto(int no, String id, String pw, String name, String phone) {
        this.no = no;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
    }


    // 3. 메소드
        // 1. setter, getter (필드가 private 이면 필수) 그래야 넣을수 있고 빼올 수 있음.
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
        // 2. toString()    : 객체 필드 정보 확인차 주로 사용하는 목적, 객체호출시 필드 호출하는 함수.
    @Override
    public String toString() {
        return "MemberDto{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
