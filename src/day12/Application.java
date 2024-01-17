package day12;

import com.sun.tools.javac.Main;
import day12.view.MainView;

public class Application {
    // 실행 클래스 : MAIN
    public static void main(String[] args) {
        // 다른 클래스의 메소드를 호출하는 방법 (힙이 있으면 된다.)
        //1. 해당 메소드가 인스턴스일 경우
//        new MainView().run();
//        //2. 해당 메소드가 인스턴스일 경우
//        MainView mainView = new MainView();
//        mainView.run();

        //3. 해당 메소드가 스태틱이라면! 정적 메소드일 경우
        //MainView.run();
        
        //4. 싱글톤 만들기
        MainView.getInstance().run(); // mainView.run();한 느낌 하지만 못하므로 getInstance().로 return값 mainView를 받았음.

    }

}
/*

    소프트웨어 개발시 사용되는 디자인 패턴/MVC 패턴 (모델 뷰 컨트롤러 패턴)
    서비스 따로 메인 따로 두는 컨트롤러 모델패턴
            MVC  : 사용자인터페이스, 데이터 및 논리제어 구현하는데 있어 사용되는 패턴
            - 관심사 분리해서 업무의 분리와 향상된 관리
            M : MODEL   : JAVA, DB          : 데이터 객체
                - DTO 객체 : DATA( DB SERVER에 있음 )  DATA Transfer Object 이동객체
                - DAO 객체 : 데이터 접근 객체(DATA ACCESS OBJECT) DB접근 객체
                - VO 객체 : VALUE OBJECT 불변데이터 객체/수정금지 (setter 없다)
            V : VIEW    : HTML,CSS,JS       : 화면 구현
            C : CONTROL : JAVA              : 모델과 뷰를 이어주는 서비스
                controller : 제어역할, 유효성 검사       / 입출력만 받기.
                service     : 비즈니스 로직(중요기능 로직)

            사용자(VIEW)----요청REQUEST/DTO-------->CONTROLLER------DTO-----> DAO ------------->DATABASE
            HTML,JS                                 JAVA                    JAVA                  DB

            식당
            고객 -------------요리요청------------> 서빙직원---요리 요청 전달--->요리사---------------->냉장고
                               음식 <-------------요리 결과<-----------------요리<-----------------

*/
