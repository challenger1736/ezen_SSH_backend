package 팀과제.팀과제3.Model;

public class 국민DTO extends 은행DTO{

        private boolean 쿠폰;

        public 국민DTO() {
        }

        public 국민DTO(String 계좌번호, String 계좌주, int 입금액, boolean 쿠폰) {
                super(계좌번호, 계좌주, 입금액);
                this.쿠폰 = 쿠폰;
        }

        public boolean is쿠폰() {
                return 쿠폰;
        }

        public void set쿠폰(boolean 쿠폰) {
                this.쿠폰 = 쿠폰;
        }
}
