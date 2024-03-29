package day06;

public class Step1 { // 그럼 Null 에 넣는법이 뭔데? 그걸 알고싶은데, 이걸 꼭 알아야함.★★★★★★★★★★★★★★★★★★★★★★★★
    public static void main(String[] args) {

        // p149 : null
            // - 아직 참조(번지)를 저장하고 있지 않다는 뜻. // == 비교연산자로 쉽게 비교 가능, 객체가 아님! 그냥 null 은 null 이라는 특별한 놈
        int[] intArray = null; // 이건 번지를 말하는 것이므로 당연히 번지가 없다는 것은 가능함.
            // 스택영역 생성 : 'intArray' 변수 선언
        // intArray[0] = 11; // java.lang.NullPointerException
            // 배열변수(스택영역)은 있지만, 배열객체(힙영역)이 실제로 존재하지 않음.
        //intArray = new int[10]; //이렇게 하면 됨 // 이것밖에 없나?
        //intArray[0] = 11; //  ★★★★★★ 안하면  Null error

        //System.out.println(intArray[0]);  ★★★★★★ 안하면  Null error
        //이렇게 하면 됨. ★★★★★★ 안하면
        //System.out.println(intArray.length); //  ★★★★★★ 안하면  Null error

        String str = null;
            // 스택영역에 변수 생성 : 'str'
        //System.out.println("str.length() = " +str.length()); // .NullPointerException
            // ★★★★★★★★문자열변수(스택영역)은 있지만, 문자열 객체(힙영역)이 실제로 존재하지 않음.★★★★★★★★
        //------------------------------------p151-----------------------------------------
        String hobby = "여행";
            // String hobby : 스택영역에 생성된 변수
            // "여행" : 힙영역에 생성된 문자열 객체 [102번지]
                // = 대입 102번지를 hobby 변수에 대입
                // !! : hobby 변수에는 "여행"문자열을 가지고 있지 않다. (주소를 가지고 있는거지 문자열을 가지고 있는거 X)
        hobby = null;

        System.out.println(hobby);
            // hobby 변수가 null를 가짐
            // "여행" 객체는 현재 아무도 참조하지 않기 때문에 잠시후 자동으로 힙영역 삭제.
        String kind1 = "자동차";
        // String kind1 : 스택영역              "자동차" [103번지]
        String kind2 = kind1;
        // String kind1 : 스택영역              kind1 [103번지]
        kind1 = null;
            // "자동차" 객체는 사라지지 않는다. kind2 변수가 참조중이므로
        System.out.println("kind2 = " + kind2);

        // ========== 배열 복습 ========== //
        // 배열(객체) : 변수와 다르게 여러개의 자료를 저장할 수 있는 방법,
        //          - 연속된 공간에 값을 나열시키고 각 값에 인덱스부여
        /*
         *   1. 배열 선언
         *       String[] array1 = {"유재석", "강호동"};
         *       String[] array2 = new String[2];
         *   2. 배열의 항목/요소 호출
         *       array2[인덱스]
         *   3. 항목/요소 값 수정/변경
         *       array2[인덱스] = 새로운값
         *   4. 항목/요소 삭제 : 없음 [ 자바는 힙영역을 제거하는 방법을 제공하지 않는다. GC  ]
         *          - 배열의 크기는 줄이거나 늘릴수 없다.  -> 방법 : 1. 직접함수만들기, 2.라이브러리(컬렉션프레임워크)
         *   5. 배열의 구조
         *       String[] array1 = {"유재석","강호동"};
         *          1. 스택은 배열의 0번 인덱스 주소를 참조한다. // 신기하네 [ 어차피 나열했기 때문에 순서대로 메모리 할당 ]
         *              - 인덱스마다 주소값
         *              - {"유재석", "강호동"}
         *
         *      스택영역                                힙영역
         *          String[] array1                     1. 배열객체 = {103번지, 104번지};       100번지
         *                                              2. 문자열(유재석)객체 =                 103번지
         *                                              3. 문자열(강호동)객체 =                 104번지
         *                          힙이 힙을 참조하는 형식!
         *
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         *      String[] array2 = new String[2]
         *      스택영역                                힙영역     new String[2]
         *         String[] array2                      1. 배열객체 = { null, null };         201번지
         *
         *          1. 배열내 특정 항목 대입
         *              array2[0] = "유재석"
         *                                             1. 문자열(유재석)객체 =                  204번지
         * */

        String[] array1 = {"유재석", "강호동"};
        array1 = new String[3]; // 이러면 사라짐.
        for(int i = 0; i< array1.length; i++){
            System.out.println(array1[i]);
        }
        String[] array2 = new String[2];
        System.out.println("array2 = " + array2);
        System.out.println("array2[1] = " + array2[1]);
        array2[0] = "유재석";


    }
    // 함수종료 => 지역변수들 사라짐 => 지역변수 참조한 힙영역 사라짐.
    // -main()함수는 자바 진입/시작 --> main함수 끝나면 힙영역도 모두 사라짐(초기화됨.)


}
