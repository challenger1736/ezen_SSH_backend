package day18.model.dto;

public class MemberDto {

    // 1. 필드
    // DB 복사해와서 타입 맞추기.
    private int mno;
    private String mid;
    private String mpw;
    private String mphone;
    private String mdate; // DB <--> JAVA 타입 변환 필요

    // 2. 생성자

    public MemberDto() {
    }
    public MemberDto( String mid, String mpw, String mphone) {
        this.mid = mid;
        this.mpw = mpw;
        this.mphone = mphone;
    }
    public MemberDto(int mno, String mid, String mpw, String mphone, String mdate) {
        this.mno = mno;
        this.mid = mid;
        this.mpw = mpw;
        this.mphone = mphone;
        this.mdate = mdate;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMpw() {
        return mpw;
    }

    public void setMpw(String mpw) {
        this.mpw = mpw;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "mno=" + mno +
                ", mid='" + mid + '\'' +
                ", mpw='" + mpw + '\'' +
                ", mphone='" + mphone + '\'' +
                ", mdate='" + mdate + '\'' +
                '}';
    }

    // DTO : 데이터 이동 객체
    /*

        1. 주로 필드는 private으로 한다.
        2. 빈생성자(기본), 모든 필드 생성자, + 상황에 맞게 생성자
        3. get/set 메소드 이용한다.
        4. toString()메소드를 이용한다.(

     */
}
