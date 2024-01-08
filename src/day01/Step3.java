package day01;

public class Step3 { // c s
    public static void main(String[] args) { // main()함수 // 실행시 필수! // m s

        // p.41 진수 표현하는 방법 [ int타입이 자동으로 10진수로 변환 ]
            int var1 = 0b1011;// 2진수 : 데이터 앞에 0b 1011[2] -> 10
        System.out.println("var1:"+var1);// 2진수 : 데이터 앞에 0b
        int var2 = 0206;
        System.out.println("var2:"+var2);// 8진수 : 데이터 앞에 0
        int var3 = 365;                  // 10진수 : 365[10]
        System.out.println("var3:"+var3);
        int var4 = 0xB3;                 //  16진수 : 데이터 앞에 0x A =10, B=11 11X16 고로 0xB3 = 176+3
        System.out.println("var4:"+var4);

        // p.42 byte타입 [-128~127]   > 1바이트 = 8비트 = 1부호 + 7값 = 2의 7승 // 인트가 바이트 되는 과정
        byte b1 = -128; System.out.println("b1:"+b1);
        byte b2 = 127; System.out.println("b2:"+b2);
        //byte b3 = 200; System.out.println("b3:"+b3);
            //java: incompatible types: possible lossy conversion from int to byte 오류
        // short타입 [-32768~32767]       // 인트가 쇼트 되는 과정
        short s1 = 32000; System.out.println("s1:"+s1);
        //short s2 = -50000; System.out.println("s2:"+s2);
            //java: incompatible types: possible lossy conversion from int to short 오류

        // int타입 [+-21억정도] : 4바이트★  : 정수타입 **리터럴(그 값 자체)
        int i1 = 2000000000;  System.out.println("i1:"+i1);
        //int i2 = 3000000000;  System.out.println("i2:"+i2);
            // java: integer number too large 오류

        // long타입 [+-21억이상] : 8바이트              // 인트가 롱으로 변환되어 롱으로
        long l1 = 3000000000L; // 기본 입력 타입이 인트라 롱에도 안들어감.
        System.out.println("l1:"+l1);

        //p.43 char [0~65535] : 2바이트 : !!! : ''작은 따옴표 , 65536개 문자 표현가능, 부호[signed]/부호없음[unsigned]
        char c1 = 'A'; System.out.println("c1:"+c1);
        char c2 = '가'; System.out.println("c2:"+c2);
        //char c3 = "가"; System.out.println("c3:"+c3);
        //java: incompatible types: java.lang.String cannot be converted to char

        // int는 21억 까지 있으므로 유니코드 다 실행가능!
        int i3 ='A';     //65               // 이런식으로 스트링 하나 하나 검증 많이 함.
        System.out.println("i3:"+i3);
        int i4 ='가';    //44065
        System.out.println("i4:"+i4);

        char c4 = 80;           // P
        System.out.println("c4:"+c4);

        // p.49 String "" 큰따옴표, 참조자료형/클래스
        String str1 = "안녕하세요";
        System.out.println("str1:"+str1);
        String str2 = "나는 \"자바\"를 배웁니다.";
        System.out.println("str2:"+str2);
        String str3 = "번호\t이름\t직업";
        System.out.println("str3:"+str3);


        // java / jdk13 이후 가능한 문법""" 3개 연속 쓰기!
        String str4 = """
                나는 자바를
                학습합니다.
                나는 자바 고수가 될 겁니다.
                """; //가능한 문법!
        System.out.println("str4:"+str4);

        // p.45 float [ 소수점 8자리 표현 ] : 4바이트 반올림
        float f1 = 0.123456789123456789f; // 7자리 유효 [ * 리터럴 데이터 뒤에 f/F 붙여 float 타입을 알림 ]
        System.out.println("f1:"+f1);
        // double  [ 소수점 16자리 표현 ] : 8바이트, 실수의 기본타입
        double d1 = 0.123456789123456789; // 15자리 유효 [ * 직접 입력한 값 -> 리터럴 ] - 실수의 기본타입
        System.out.println("d1:"+d1);
        
        // p.48  boolean [true 또는 false]
        boolean bool1 = true;
        System.out.println("bool1:"+bool1);
        // boolean bool2 = 1; 안됨    1은 인트이므로 boolean에 저장할 수 없다. [ 정수 가장 최소단위 바이트 ] JAVA는 다르다! JS만 되는거임

        //리터럴(입력한 데이터 그 자체) : 1. 정수 int 2. 실수 double 3. 논리 boolean 4. 문자(char '') , 문자열(String "")


        // boolean
    } // m e
}// c e
