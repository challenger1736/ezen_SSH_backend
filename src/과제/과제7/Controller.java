package 과제.과제7;

public class Controller {
    public static boolean signup(MemberDto memberDto){//1번
        boolean result = MemberDao.getInstance().signup(memberDto);
        return result;
    }
    public static boolean login(MemberDto memberDto){//2번
        boolean result = MemberDao.getInstance().login(memberDto);
        return result;
    }
    public static String idSearch(String 전화번호){//3번
        String result = MemberDao.getInstance().idSearch(전화번호);
        return result;
    }
    public static String pwSearch(String 아이디){//4번
        String result = MemberDao.getInstance().pwSearch(아이디);
        return result;
    }
}
