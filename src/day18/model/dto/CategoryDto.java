package day18.model.dto;

public class CategoryDto {
    private int cno;
    private String cname;

    public CategoryDto(){}
    public CategoryDto( String cname){
        this.cname = cname;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
