package 클라우드구독시스템;

class MainRun {
    static User1[] users = new User1[1];
    static Subscribe1[] subscribes = new Subscribe1[1];


    void run() { // static 을 안 쓴 run하나. // ★★★★★★★★
        // 프로그램 실행
        while (true){ // 전체 반복 실행
            System.out.println("------------------------------");
            System.out.println("1. 로그인 2. 회원가입 ");
            Service service1 = new Service();
            service1.choice(); // 선택 ch 받기
            if(service1.ch.equals("1")){//로그인 시
                service1.login();
            }else if(service1.ch.equals("2")){ // 회원가입 시
                service1.resit();
            }else{ // 잘못된 숫자 눌렀을 시 (로그인, 회원가입 제외)
                System.out.println("------------------------------");
                System.out.println("잘못된 입력입니다.");
            }

            while(service1.myInfo != null){
                System.out.println("------------------------------");
                System.out.println("1. 로그아웃 2. 구독정보");
                Service service2 = new Service();
                service2.choice();
                if(service2.ch.equals("1")){// 로그아웃
                    service1.myInfo=null;
                    break;
                }else if(service2.ch.equals("2")){// 구독정보
                    service1.subsInfo(); // 구독정보도출
                    boolean run6 = true;
                    while(run6){
                        System.out.println("------------------------------");
                        System.out.println("1.구독하기 2.기간연장 3.구독번호 등록 4.뒤로 가기");
                        Service service3 = new Service();
                        service3.choice();
                        if(service3.ch.equals("1")){//구독하기
                            service1.newSubs();
                        } else if (service3.ch.equals("2")) {//기간연장
                            service1.plusMonth();
                        } else if(service3.ch.equals("3")){//구독번호 등록
                            service1.inputSubsNo();
                        } else if(service3.ch.equals("4")){//뒤로 가기
                            run6 = false;
                        } else{
                            System.out.println("------------------------------");
                            System.out.println("잘못된 입력입니다.");
                        }
                    }
                }
            }
        }
    }
}
