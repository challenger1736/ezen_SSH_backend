package day18.model.dto;

public class CommentDto {
    private int bno;
    private int mno;
    private int cono;
    private String cocontents;

    CommentDto(){}
    CommentDto(int bno, int mno, String cocontents){
        this.bno=bno;
        this.mno = mno;
        this.cocontents = cocontents;
    }
    CommentDto(int bno, int mno, int cono, String cocontents){
        this.bno = bno;
        this.mno = mno;
        this.cono = cono;
        this.cocontents = cocontents;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public int getCono() {
        return cono;
    }

    public void setCono(int cono) {
        this.cono = cono;
    }

    public String getCocontents() {
        return cocontents;
    }

    public void setCocontents(String cocontents) {
        this.cocontents = cocontents;
    }
}
