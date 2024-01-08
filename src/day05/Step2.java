package day05;

public class Step2 {
    public static void main(String[] args) {
        
        // p.165 : 배열(array) 타입
            /*
            *   - 변수는 하나의 값만 저장.
            *   1. 배열 :  연속된 공간에 값을 나열하고 각 값에 인덱스를 부여한 자료구조.
            *       - 인덱스 : 각 항목(요소)의 값을 호출하거나 저장하는데 사용됨.
            *   2. 특징
            *       1. 배열은 같은 타입의 값만 저장할 수 있음.
            *           int = [ 51, "가" ] 불가능!
            *       2. 배열의 길이는 선언된 이후 늘리거나 줄일수 없다. >> 선언을 다시하면 됨
            *           int = [ 51, 62, 67 ] : 항목/요소를 추가/삭제 할 수 없다.
            *               = [ 51, 67 ] 안됨!
            *           - 새로운 배열을 만들고 기존배열을 복사해서 새로운 값 대입.
            *   3. 선언
            *       - 변수 선언 : (타입) 변수명;
            *       - 배열 선언 : (타입)[] 변수명;
            *
            *   4. 값 목록으로 배열 선언
            *       - 배열생성1 : (타입)[] 변수명 = { 값0, 값1, 값2, 값3 };
            *               - 배열에 넣을 초기값을 알고 있을때 사용.
            *       - 배열생성2 : (타입)[] 변수명 = new 타입[ 길이 ];
            *               - 배열에 넣을 초기값을 모르고 배열의길이(최대저장개수)를 알고 있을 때 사용.
            *               - 단, 초기값이 자동으로 들어감, 정수는 0 실수는 0.0 논리는 false 클래스(String도 클래스)/인터페이스 null
            *               - 주의 할 점
            *                   1. 지역변수 X           int a;
            *                   2. 배열변수 적용됨
            *                   3. 필드에서 적용됨
            *
            *   5. 배열의 길이를 구하는 속성명
            *       - 배열명.length;       : 현재 배열의 길이를 알려준다.
            *
            *   6. 배열에 항목/요소 값 넣기.
            *       - 배열명[인덱스] = 새로운값;          ex) arr1[0] = "첫번째"
            * 
            *   7. 배열 항목/요소 값 호출.
            *       - 배열명[인덱스]
            *
            *   8. 배열 항목/요소 값 수정.
            *       - 배열명[인덱스] = 새로운값;
            *
            *   9. 배열 항목/요소 값 삭제.
            *       - 배열명[인덱스] = 각 타입의 초기값
            * 
            *  
            * */

        // 1. 배열 생선/선언 : 여러개 문자열을 저장하는 배열 선언.
        String season1 = "Spring";
        String season2 = "Summer";
        String season3 = "Fall";
        String season4 = "Winter";
                        // 배열이 없다면 vs 배열 있다면
        String[] season = {"Spring", "Summer", "Fall", "Winter"};
        // (타입)[] 변수명 = { 값, 값1, 값2, 값3};
                    // 인덱스: 0 , 1 , 2 ,  3

        // 2. 배열의 각 요소/항목 의 값 호출
        System.out.println("season = " + season); // [Ljava.lang.String;@6d311334 // JVM의 주소값이 나옴 - 이번 주 배울 것
        // 기본 타입(7가지+String) 말고 참조타입 호출시 주소값이 나옴!!!!★
        System.out.println("season[0] = " + season[0]); // 배열내 0번 인덱스 호출
        System.out.println("season[1] = " + season[1]); // 배열내 1번 인덱스 호출
        System.out.println("season[2] = " + season[2]); // 배열내 2번 인덱스 호출
        System.out.println("season[3] = " + season[3]); // 배열내 3번 인덱스 호출
        // System.out.println("season[4] = " + season[4]);
        // : Index 4 out of bounds for length 4 // 범위 넘어갔다.

        //for문을 이용한 호출

                for(int i=0; i <= season.length-1; i++){
                    System.out.println("season["+i+"] ="+ season[i]);
                }

        //3. 각 요소/항목의 값 수정
        season[1] = "여름";
        System.out.println("season[1] = " + season[1]);

        // - int형 3개 데이터를 저장하는 배열 선언. 배열 이름 scores
        int[] scores = { 83, 90, 87}; // push같은거 없어요
        int sum = 0;
        for(int i =0 ; i<3; i++){
            sum += scores[i];
        }
        System.out.println("총합 : "+sum);
        double avg = (double) sum/3;
        System.out.println("평균 : "+avg);

        //p.173
            // new 연산자를 이용한 배열 선언.
            // 1. int 3개를 저장할 수 있는 배열 선언
                // new 연산자 사용시 초기값 : 정수:0 실수:0.0 논리:false 클래스 : null
            int[] arr1 = new int[3];
            // 2. 배열의 초기값 출력
            for(int i = 0; i<3 ; i++){
                System.out.printf("arr1[%1d] : %2d , ", i , arr1[i]);
            }

            //3. 요소의 값 대입
            arr1[0] = 10;
            arr1[1] = 20;
            arr1[2] = 30;
        System.out.println();

        for(int i = 0; i<3 ; i++){
            System.out.printf("arr1[%1d] : %2d , ", i , arr1[i]);
        }
        // 1. double형 3개를 저장할 수 있는 배열 선언
        double[] arr2 = new double[3];
        System.out.println();
        for(int i = 0; i<3 ; i++){
            System.out.printf("arr2[%1d] : %2f , ", i , arr2[i]);
        }

        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;

        System.out.println();
        for(int i = 0; i<3 ; i++){
            System.out.printf("arr2[%1d] : %2f , ", i , arr2[i]);
        }
        
        // 1. String형 3개를 저장할 수 있는 배열 선언
        String[] arr3 = new String[3];

        System.out.println();
        for(int i = 0; i<3 ; i++){
            System.out.printf("arr3[%1d] : %s , ", i , arr3[i]);
        }

        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        System.out.println();
        for(int i = 0; i<3 ; i++){
            System.out.printf("arr3[%1d] : %s , ", i , arr3[i]);
        }

        String[] 내용 = new String[3];
        String[] 작성자 = new String[3];
        int[] 비밀번호 = new int[3];
        System.out.println();
        System.out.printf("%2d \t %-5s \t %-20s\n",1, 작성자[0], 내용[0]);
        System.out.printf("%2d \t %-5s \t %-20s\n",2, 작성자[1], 내용[1]);
        System.out.printf("%2d \t %-5s \t %-20s\n",3, 작성자[2], 내용[2]);

        // 프로그램 실행도중에 변수 사용시에는 추가적인 메모리 증가 불가능
        // 프로그램 실행도중에 배열 사용시에는 추가적인 메모리 증가 가능.

    } // m e
} // c e
