package day18SoloTest.Model.DTO;

public class MemberDto {

    private int mno;
    private String mid;
    private String mpw;
    private String mname;

    //DTO는 데이터 여러개할거니 싱글톤 안함

    //생성자는 만들 필요가 있지


    public MemberDto() {
    }

    // 생성자로 넣어주거나
    public MemberDto(int mno, String mid, String mpw, String mname) {
        this.mno = mno;
        this.mid = mid;
        this.mpw = mpw;
        this.mname = mname;
    }

    // 플러스 프라이빗이니 게터세터( 클래스객체.필드명으로 쓸수 없기에 게터로 부르기, or 세터로 넣기 )


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

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "mno=" + mno +
                ", mid='" + mid + '\'' +
                ", mpw='" + mpw + '\'' +
                ", mname='" + mname + '\'' +
                '}';
    }
}
