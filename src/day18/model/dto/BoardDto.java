package day18.model.dto;

public class BoardDto {
    private int cno ;
    private int mno ;
    private int bno  ;
    private String btitle ;
    private String bcontents ;
    private String  bdate ;
    private long bview ;

    public BoardDto() {
    }

    public BoardDto(int cno, int mno, String btitle, String bcontents) {
        this.cno = cno;
        this.mno = mno;
        this.btitle = btitle;
        this.bcontents = bcontents;
    }

    public BoardDto(int cno, int mno, int bno, String btitle, String bcontents, String bdate, long bview) {
        this.cno = cno;
        this.mno = mno;
        this.bno = bno;
        this.btitle = btitle;
        this.bcontents = bcontents;
        this.bdate = bdate;
        this.bview = bview;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBcontents() {
        return bcontents;
    }

    public void setBcontents(String bcontents) {
        this.bcontents = bcontents;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public long getBview() {
        return bview;
    }

    public void setBview(long bview) {
        this.bview = bview;
    }
}