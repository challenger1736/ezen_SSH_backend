package day06;

public class Test {
    public static void main(String[] args) {
        int number = 12345;
        int Count = String.valueOf(number).length();
        System.out.println("자릿수: " + Count);
        // 이런 느낌으로 자릿수 확인 가능, int는 기본 자료형이므로 .을 쓸수 없다!
    }
}

