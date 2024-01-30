package day18;

import day18.view.MainView;

public class Application {// 실행용 메인 메소드용 클래스
    public static void main(String[] args) {

        //1. 인스턴스 메소드
//        MainView mainView = new MainView();
//        mainView.run();

        //2. 인스턴스 메소드
//        new MainView().run();

        //3.싱글톤(인스턴스 하나의 메소드)
            MainView.getInstance().run();

        //4. 정적 메소드
        //메소드가 스태틱이면
        //MainView.run();


    }//me
}//ce

/*

    -- 다른클래스내 메소드를 호출하는 방법
    = 외부클래스에서 메소드를 호출하는 방법

*/