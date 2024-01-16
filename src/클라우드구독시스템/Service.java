package 클라우드구독시스템;

import java.util.Scanner;

import static 클라우드구독시스템.MainRun.subscribes;
import static 클라우드구독시스템.MainRun.users;

class Service {

    //필드, 생성자, 메소드
    String ch;
    String loginId;
    String loginPw;
    User1 myInfo;
    void choice(){
        Scanner scanner = new Scanner(System.in);
        ch = scanner.nextLine();
    }

    void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------");
        this.myInfo = null;
        System.out.print("로그인 - 아이디 입력 : ");
        this.loginId = scanner.nextLine();
        System.out.print("로그인 - 비밀번호 입력 : ");
        this.loginPw = scanner.nextLine();

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) { // null이 아닐때만 검사하므로 null일때는 그냥 로그인 되어버리는 이유<< 18번째 줄 참고.
                if (users[i].아이디.equals(loginId) && users[i].비밀번호.equals(loginPw)) {
                    this.myInfo = users[i]; //배열내 i번째 id와 pw가 같으면, 전체유저i번째를 로그인중이라는 로그인 유,무에 저장
                    System.out.println("로그인 성공");
                    if(this.myInfo.구독번호 != 0){
                        System.out.println("내 구독 번호 : " + this.myInfo.구독번호);
                    }else{
                        System.out.println("아직 구독 중이 아닙니다.");
                    }
                    break;
                }
            }
        }
        if(this.myInfo == null){
            System.out.println("로그인 실패");
        }
    } // 로그인 메소드 끝

    void resit(){ // 회원가입 했을 때
        Scanner scanner = new Scanner(System.in);
        User1[] users2 = new User1[users.length+1]; // 추가로 넣을 새로운 배열 생성됨.
        User1 신규가입정보 = new User1(); // 하나의 신규가입정보가 들어감.
        System.out.println("------------------------------");
        boolean run = true;
        while (run) {
            System.out.print("회원 가입할 아이디를 입력하세요 : ");
            String 가입id = scanner.nextLine();
            for (int in = 0; in < users.length; in++) {
                if (users[in] != null) { // in번째 유저가 존재 할 때만 검사해서
                    if (가입id.equals(users[in].아이디)) { // in번째 아이디가 입력받은 가입id와 동일하면
                        System.out.println("중복된 아이디가 존재합니다. 다른 아이디를 입력하세요.");
                        break; // 중복된 아이디 때문에 다시 입력받기 위해 반복문 탈출
                    }
                } else { // if if를 위에서 통과해서 존재안할 때,
                    신규가입정보.아이디 = 가입id;
                    run = false; // 넣었을떄 while 반복문 종료
                }
            }
        } // 가입 아이디
        System.out.print("회원 가입할 비밀번호를 입력하세요 : ");
        String 가입pw = scanner.nextLine();
        신규가입정보.비밀번호 = 가입pw; // 가입 비밀번호 대입

        System.out.print("회원 가입할 분의 이름을 입력하세요 : ");
        String 가입name = scanner.nextLine();
        신규가입정보.이름 = 가입name; // 가입 이름 대입

        // 그 외 정보 생략.
        // 회원 번호 나누기.

        for (int i = 0; i < users.length; i++) {
            int a = (int) (Math.random() * 100000000);
            if(users.length == 1){ //null 하나밖에 없는 배열일 때.
                신규가입정보.유저번호 = a; System.out.println("유저번호 : "+ 신규가입정보.유저번호);
                break;
            }
            if (users[i] != null) { // i번째 유저가 존재 할 때
                if (a == users[i].유저번호) { // i번째 아이디의 유저번호와 제공받은 랜덤 번호가 일치하면,
                    i = 0;
                } else {
                    신규가입정보.유저번호 = a;
                    System.out.println("유저번호 : "+ 신규가입정보.유저번호); // 확인용
                    break; // 대입하고 탈출.
                }
            }
        }

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) { // null 첫 놈에 대입
                users[i] = 신규가입정보;
                break;
            }
        }
        for(int i =0; i< users.length; i++){
            if (users2[i] == null){
                users2[i] = users[i];
            }
        }
        users = users2;
        //System.out.println(users.length);

        this.myInfo = null; // 로그인 바로 안되게.

    }

    void subsInfo(){
        for(int i = 0 ; i<subscribes.length ; i++){
            if(subscribes.length==1){
            }
            if(subscribes[i]!=null){
                if(this.myInfo.구독번호 == subscribes[i].구독번호 ){
                    if(subscribes[i].타입.equals("베이직")){
                        System.out.println("구독 번호 : " + subscribes[i].구독번호);
                        System.out.println("구독 타입 : 베이직 (1명)");
                        System.out.println("구독한 개월 : " + subscribes[i].구독기간);
                    } else if (subscribes[i].타입.equals("프리미엄")) {
                        System.out.println("구독 번호 : " + subscribes[i].구독번호);
                        System.out.println("구독 타입 : 프리미엄 (4명)");
                        System.out.println("구독한 개월 : " + subscribes[i].구독기간);
                    }

                }
            }

        }
    }

    void newSubs(){
        Scanner scanner = new Scanner(System.in);
        Subscribe1 신규구독하나 = new Subscribe1(); // 구독2 클래스 하나 불러오기
        // 구독 처음 했을 때,
        if (this.myInfo.구독번호 == 0) { // 구독번호가 없으면
            boolean run3 = true;
            while (run3) {
                System.out.print("구독 개월 수 입력 : ");
                String 신규구독개월 = scanner.nextLine();
                for (int i = 0; i < 신규구독개월.length(); i++) {
                    if (!(신규구독개월.charAt(i) >= 48 && 신규구독개월.charAt(i) <= 57)) {//입력받은 아스키코드가 숫자 아니면
                        System.out.println("숫자로 입력하세요.");
                        break;
                    } else {
                        run3 = false;
                        신규구독하나.구독기간 += Integer.parseInt(신규구독개월); // 추가
                    }
                }
            }
            boolean run4 = true;
            String 신규구독타입;
            while (run4) {
                System.out.println("구독 타입 선택");
                System.out.println("1. 베이직 (1명)  |  2. 프리미엄 (4명)");
                신규구독타입 = scanner.nextLine();
                if (신규구독타입.equals("1")) {
                    System.out.println("베이직 타입");
                    신규구독하나.타입 = "베이직";
                    신규구독하나.구독인원 = new String[1];
                    신규구독하나.구독인원[0] = this.myInfo.아이디; // 신규구독 인원 넣기
                    run4 = false;

                } else if (신규구독타입.equals("2")) {
                    System.out.println("프리미엄 타입");
                    신규구독하나.타입 = "프리미엄";
                    신규구독하나.구독인원 = new String[4];
                    신규구독하나.구독인원[0] = this.myInfo.아이디; // 신규구독 인원 넣기
                    run4 = false;
                } else {
                    System.out.println("잘못된 입력입니다.(1 또는 2를 입력하세요.)");
                }
            }
            // 다하면 구독번호 주기.
            Subscribe1[] subscribes2 = new Subscribe1[subscribes.length + 1]; // 새로운 값 넣을 배열.
            for (int i = 0; i < subscribes.length; i++) {
                int a = (int) (Math.random() * 100000000);
                if (subscribes.length == 1) { //null 하나밖에 없는 배열일 때.
                    subscribes[i] = 신규구독하나;
                    subscribes[i].구독번호 = a;
                    this.myInfo.구독번호 = a;
                    System.out.println("구독번호 : " + subscribes[i].구독번호);
                    break;
                } else if (subscribes[i] == null) { // i번째 구독배열이 존재할 때
                    subscribes[i] = 신규구독하나;
                    subscribes[i].구독번호 = a;
                    this.myInfo.구독번호 = a;
                    System.out.println("구독번호 : " + subscribes[i].구독번호); // 확인용
                    break; // 대입하고 탈출.
                } else if(subscribes[i]!= null && subscribes[i].구독번호==a){
                    i=0; // 구독번호 중복 방지
                }
            }

            for (int i = 0; i < subscribes.length; i++) {
                if (subscribes2[i] == null) {
                    subscribes2[i] = subscribes[i];
                }
            }
            subscribes = subscribes2; // 새로운 구독 배열을 전체 구독배열로 다시.

        } else { // 구독번호가 있을 때,
            System.out.println("이미 구독 중입니다.");
        }
    }
    void plusMonth(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------");
        for (int i = 0; i < subscribes.length; i++) {
            if(this.myInfo.구독번호 == 0){ System.out.println("아직 구독중이 아닙니다."); break;}
            if (subscribes[i] != null) {
                if (this.myInfo.구독번호 == subscribes[i].구독번호) {
                    if (subscribes[i].타입.equals("베이직")) {
                        System.out.println("구독 번호 : " + subscribes[i].구독번호);
                        System.out.println("구독 타입 : 베이직 (1명)");
                        System.out.println("구독한 개월 : " + subscribes[i].구독기간);
                        System.out.print("연장할 개월 : ");
                        String a = scanner.nextLine();
                        for (int i2 = 0; i2 < a.length(); i2++) {
                            if (!(a.charAt(i2) >= 48 && a.charAt(i2) <= 57)) {//입력받은 아스키코드가 숫자 아니면
                                System.out.println("숫자로 입력하세요.");
                                break;
                            }else {
                                //run3 = false;
                                subscribes[i].구독기간 += Integer.parseInt(a);
                                System.out.println("총 구독 개월 수 : " + subscribes[i].구독기간);
                            }
                        }
                    } else if (subscribes[i].타입.equals("프리미엄")) {
                        System.out.println("구독 번호 : " + subscribes[i].구독번호);
                        System.out.println("구독 타입 : 프리미엄 (4명)");
                        System.out.println("구독한 개월 : " + subscribes[i].구독기간);
                        System.out.print("연장할 개월 : ");
                        String a = scanner.nextLine();
                        for (int i2 = 0; i2 < a.length(); i2++) {
                            if (!(a.charAt(i2) >= 48 && a.charAt(i2) <= 57)) {//입력받은 아스키코드가 숫자 아니면
                                System.out.println("숫자로 입력하세요.");
                                break;
                            } else {
                                //run3 = false;
                                subscribes[i].구독기간 += Integer.parseInt(a);
                                System.out.println("총 구독 개월 수 : " + subscribes[i].구독기간);
                            }
                        }
                    }
                }
            }
        }
    }
    void inputSubsNo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------");
        if(this.myInfo.구독번호 == 0) {
            boolean run5 = true;
            String a; // 받을 구독 번호
            String b = "";
            while (run5) {
                System.out.print("구독 번호를 입력하세요 : ");
                a = scanner.nextLine();
                for (int i = 0; i < a.length(); i++) {
                    if (!(a.charAt(i) >= 48 && a.charAt(i) <= 57)) {//입력받은 아스키코드가 숫자 아니면
                        System.out.println("숫자로 입력하세요.");
                        break;
                    } else {
                        run5 = false;
                        break;
                    }
                }
                b = a;
            }
            for (int i = 0; i < subscribes.length; i++) {
                int 인원카운트 = 0;
                if (subscribes.length == 1 ){
                    System.out.println("------------------------------");
                    System.out.println("해당하는 구독번호가 없습니다.");
                }
                if (subscribes[i] != null) {
                    System.out.println("------------------------------");
                    if (subscribes[i].구독번호 == Integer.parseInt(b)) {
                        if(subscribes[i].구독인원.length==1){
                            System.out.println("베이직은 1명까지만 가능합니다.");
                            break;
                        }
                        this.myInfo.구독번호 = subscribes[i].구독번호;
                        //i는 나왔고, 그 i번째 구독배열에 내가 들어간다.
                        for (int j = 1; j < subscribes[i].구독인원.length; j++) {
                            if (subscribes[i].구독인원[j] == null) {
                                subscribes[i].구독인원[j] = this.myInfo.아이디;
                                System.out.println("등록되었습니다.");
                                break;
                            }
                            인원카운트++;
                            if (인원카운트 == 3) {
                                System.out.println("구독인원이 꽉 찼습니다.");
                            }
                        }
                    }else{
                        if(i==subscribes.length){System.out.println("해당하는 구독번호가 없습니다.");}

                    }
                }
            }
        }else{
            System.out.println("이미 구독 중입니다.");
        }

    }
}
