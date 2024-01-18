package 과제.과제7;

import static 과제.과제7.Run.dtoArrayList;

public class MemberDao {

    private MemberDao(){}
    private static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){
        return memberDao;
    };
    public static boolean signup(MemberDto memberDto){//1번
        dtoArrayList.add(memberDto);
        return true;
    }
    public static boolean login(MemberDto memberDto){//2번
        for(int i =0; i< dtoArrayList.size(); i++ ){
            if(dtoArrayList.get(i).get아이디().equals(memberDto.get아이디())&&dtoArrayList.get(i).get비밀번호().equals(memberDto.get비밀번호())){
                return true;
            }
        }
        return false;
    }
    public static String idSearch(String 전화번호){//3번
        for(int i =0; i< dtoArrayList.size(); i++ ){
            if(dtoArrayList.get(i).get전화번호().equals(전화번호)){
                return dtoArrayList.get(i).get아이디();
            }
        }
        return "";
    }
    public static String pwSearch(String 아이디){//4번
        for(int i =0; i< dtoArrayList.size(); i++ ){
            if(dtoArrayList.get(i).get아이디().equals(아이디)){
                return dtoArrayList.get(i).get비밀번호();
            }
        }
        return "";

    }
}
