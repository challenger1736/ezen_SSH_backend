package 팀과제.팀과제3.Model;

import java.util.ArrayList;

public class 은행DAO {
    static ArrayList<은행DTO> 은행s = new ArrayList<은행DTO>();
    private 은행DAO(){}
    private static 은행DAO 은행DAO = new 은행DAO();
    public static 은행DAO getInstance(){return 은행DAO;}

    public boolean 계좌생성(은행DTO 은행DTO){
        은행s.add(은행DTO);
        return true;
    }

    public String 예금(은행DTO 은행DTO){
        for(은행DTO i : 은행s){
            if(i.get계좌번호().equals(은행DTO.get계좌번호())){
                i.set입금액(i.get입금액() + 은행DTO.get입금액());
                if(i.get계좌번호().charAt(0) == '1'){  // 신한
                    신한DTO 은행 = (신한DTO)i;

                    은행.set마일리지((int) (은행DTO.get입금액() * 0.001) + "");
                    은행DTO 은행1 = 은행;
                    i = 은행1;
                } else if(i.get계좌번호().charAt(0)== '2'){   // 국민
                    국민DTO 은행 = (국민DTO)i;
                    은행.set쿠폰(true);
                    은행DTO 은행1 = 은행;
                    i = 은행1;

                } else if(i.get계좌번호().charAt(0)== '3'){   // 농협
                    농협DTO 은행 = (농협DTO)i;
                    은행.set포인트((int)(은행DTO.get입금액() * 0.005) + "");
                    은행DTO 은행1 = 은행;
                    i = 은행1;
                }
                return i.get입금액()+"";
            }
        }
        return null;
    }

    public String 출금(은행DTO 은행DTO){
        for(은행DTO i : 은행s){
            if(i.get계좌번호().equals(은행DTO.get계좌번호())){
                i.set입금액(i.get입금액() - 은행DTO.get입금액());
                return i.get입금액()+"";
            }
        }
        return null;
    }

}
