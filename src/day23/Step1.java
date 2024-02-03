package day23;

import java.util.ArrayList;
import java.util.Arrays;

public class Step1 {

    public static void main(String[] args) {
        // 1. 배열
        String[] strArray = new String[3]; // String 타입 데이터 3개를 저장하는 배열타입.
        strArray[0] = "유재석";
        //strArray[1] = 100 // X 타입이 다르니까 오류.
        strArray[1] = "강호동";
        strArray[2] = "신동엽";
        // strArray[3] = "하하"; // ArrayIndexOutofBoundsException

        System.out.println(strArray);
        System.out.println("배열 상태 : "+ Arrays.toString(strArray));
        System.out.println("배열 길이 : "+ strArray.length);

        // 2. 클래스타입 : 컬렉션프레임워크( 수집관련라이브러리 제공 )
            // 1. ArrayList : 가변길이 가능하도록 만든 객체!!
        ArrayList<String> strList = new ArrayList<>();
                // 클래스명 <제네릭타입> = new 클래스명<>();
        strList.add("유재석");
        // strList.add(100); // X 타입이 다르니까 오류.
        strList.add("강호동");
        strList.add("신동엽");
        strList.add("하하");
        System.out.println(strList);
        System.out.println("리스트 길이 : " + strList.size() );
        strList.remove(1); // 1번 인덱스 삭제
        System.out.println("리스트 상태 : " + strList);

        // 3. 가변길이 배열객체 만들기.
        // SimpleList{객체,객체,객체}
        SimpleList<String> simpleList = new SimpleList();
//        simpleList.array[0] = "유재석";
        simpleList.add("유재석");
        simpleList.add("신동엽");
        simpleList.add("서장훈");
        //simpleList.add(100); //<String>이라서 안됨.

        System.out.println(simpleList);
        System.out.println("리스트 요소 호출 : " + simpleList.get(1));
        simpleList.remove(1);
        System.out.println("리스트 요소 호출 : " + simpleList.get(1));

        System.out.println(simpleList);
        System.out.println(simpleList.size());




    }
}
