package day10;

public class Step2 {
    public static void main(String[] args) {

        // p. 234 : 가변길이 매개변수
            // 메소드를 호출할때에는 매개변수의 개수에 맞게
            // 가변길이 매개변수를 가지고 있다면 개수와 상관없이 사용 가능
        
        // - 다른 클래스에 있는 메소드를 사용하고 싶을때.
            // 1. 객체 생성 : 메소드를 호출할려고
        Computer myCom = new Computer();
            // 2. 메소드 호출
        int myComsum= myCom.sum(1,2,3);
        System.out.println(myComsum);
        int myComsum2 = myCom.sum2(1,2);
        System.out.println(myComsum2);
        int myComsum3 = myCom.sum(1,2,3,4,5);
        System.out.println(myComsum3);

        int[] values = {1,2,3,4,5};
        int result3 = myCom.sum(values);
        System.out.println("result3 = " + result3);

        int result4 = myCom.sum(new int[]{1,2,3,4,5});
        System.out.println("result4 = " + result4);

        // vs
        int result5 = myCom.sum3(values); // 배열도 매개변수가 될 수 있다. 메소드 sum3놈.
        System.out.println("result5 = " + result5);

        //int result6 = myCom.sum3(1,2,3);


    }// me
} // ce

/*

 객체 지향 프로그래밍 : 객체들 간의 상호작용 ( 함수 이용 )

                    더하기 기능
        사람 < ----------------- > 계산기
                    결과 리턴

                고장난 핸드폰, 돈 : 매개변수
        사람 < ----------------- > 삼성 서비스센터AS
                    결과 리턴   : 결과값


*/
