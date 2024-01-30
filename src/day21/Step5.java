package day21;



public class Step5 {
    public static void main(String[] args) {
        // 1. 버튼 객체 생성
        Button button = new Button();


        // () -> 람다로 바꾸기 가능
        button.setClickListener(new Button.ClickListener(){
            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        });
        // 만일 익명구현 객체가 없을 때
        Button.ClickListener cl = new Click(); // 구현 클래스가 필요함 또
        button.setClickListener(cl);
        button.click();



        // 일반적인 라이브러리 사용법
        //java.awt.Button button2 = new java.awt.Button();
        //button2.get~~~


        // ok버튼 클릭
        button.click();

        Button btnCancel =  new Button();
        btnCancel.setClickListener(new Button.ClickListener(){
            @Override
            public void onClick() {
                System.out.println("Cancle 버튼을 클릭했습니다.");
            }
        });

    }


}
