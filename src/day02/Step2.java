package day02; // 패키지명

public class Step2 { //c s
    public static void main(String[] args) { //m s

        // p.63 연결연산자
        int result1 = 10+2+8;
        System.out.println(result1+"10"); // 문자열("10")일 경우에는 연결 // 2010

        // p.64 문자열을 기본타입으로 변환
            // parseInt(), JSON.parse()
            // -JAVA의 애플리케이션과 통신할때 [ 메모장, HTTP, 네트워크 ]
            // HTTP로 부터 10 받음 -> 문자10? 숫자10
            int value1 = Integer.parseInt("10");
            double value2 = Double.parseDouble("3.14");
            boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 :"+value1);
        System.out.println("value2 :"+value2);
        System.out.println("value3 :"+value3);

        // 기본 타입을 문자열 변환
        // 1. String.valueOf(기본타입값);
        String str1 = String.valueOf(10);
        // 2. 기본타입값에 의미없는 "" 문자열 리터럴 연결한다.
        String str2 = 10+"";

        // p.66 변수 사용 범위
            // - 선언된 변수는 해당 중괄호{} 내에서만 사용 가능하고 밖에서는 사용할 수 없다.
    }   // m end
} // c e
