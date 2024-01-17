package 과제.과제6;


public class Member {
    private String 아이디;
    private String 비밀번호;
    private String 이름;
    private String 전화번호;
    private int 나이;

    private Member(){}; //왜 뒤에 {}가 들어가야하지? 아 생성자를 못만들게 막기 때문에,
    private static Member member1 = new Member();
    public static Member getInstance(){
        return member1;
    }

    public  Member(String 아이디, String 비밀번호, String 이름, String 전화번호, int 나이) {
        this.아이디 = 아이디;
        this.비밀번호 = 비밀번호;
        this.이름 = 이름;
        this.전화번호 = 전화번호;
        this.나이 = 나이;
    }

    public void set아이디(String 아이디) {
        this.아이디 = 아이디;
    }

    public void set비밀번호(String 비밀번호) {
        this.비밀번호 = 비밀번호;
    }

    public void set이름(String 이름) {
        this.이름 = 이름;
    }

    public void set전화번호(String 전화번호) {
        this.전화번호 = 전화번호;
    }

    public void set나이(int 나이) {
        this.나이 = 나이;
    }

    public String get아이디() {
        return 아이디;
    }

    public String get비밀번호() {
        return 비밀번호;
    }

    public String get이름() {
        return 이름;
    }

    public String get전화번호() {
        return 전화번호;
    }

    public int get나이() {
        return 나이;
    }

    public static Member getMember1() {
        return member1;
    }

    public static void setMember1(Member member1) {
        Member.member1 = member1;
    }

    //서비스 구역
    static void signup(Member member){
        for(int i =0 ; i<MemberSys.객체배열.length ; i++){ // 정적필드라도 일단 앞에 외부 클래스의 필드명을 사용시 클래스명을 붙여야한다.
            if(MemberSys.객체배열[i]==null) {
                MemberSys.객체배열[i] = member;
                return;
            }
        }
    }

    static boolean login(Member member){
        for(int i = 0 ; i < MemberSys.객체배열.length; i++){
            if(MemberSys.객체배열[i]!=null){
                if(MemberSys.객체배열[i].아이디.equals(member.아이디)&&MemberSys.객체배열[i].비밀번호.equals(member.비밀번호)){
                  return true;
                }
            }
        }
        return false;
    }

    static String idSearch(String 전화번호){
        for(int i = 0 ; i < MemberSys.객체배열.length; i++){
            if(MemberSys.객체배열[i]!=null){
                if(MemberSys.객체배열[i].전화번호.equals(전화번호)){
                    return MemberSys.객체배열[i].아이디;
                }
            }
        }
        return "";
    }

    static String pwSearch(String 아이디){
        for(int i = 0 ; i < MemberSys.객체배열.length; i++){
            if(MemberSys.객체배열[i]!=null){
                if(MemberSys.객체배열[i].아이디.equals(아이디)){
                    return MemberSys.객체배열[i].비밀번호;
                }
            }
        }
        return "";
    }


}
