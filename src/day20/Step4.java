package day20;

public class Step4 {
    //1.
    public static void printLength(String data){
        try {
            int result = data.length();                 // .(도트) : 참조객체의 인스턴스 멤버 호출
            System.out.println("문자 수 : " + result);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }finally {
            System.out.println("마무리 실행]\n");
        }
    }
    public static void main(String[] args) {
        //1. 실행 예외
        printLength("ThisisJava");
        printLength(null);  //null이면 참조가 없으므로.(도트) 불가능

        //2. 일반 예외 [컴파일 전에 미리 알려줌]
        try {
            Class.forName("java.lang.String");
            Class.forName("java.lang.String2");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
            System.out.println(e.toString());
        }
        System.out.println("프로그램 종료");

        String[] array = {"100" , "1oo"};
        for(int i = 0; i<=array.length ; i++){
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println(value);
            }catch (NullPointerException | NumberFormatException e){
                System.out.println(i+ "숫자로 변환할 수 없습니다." + e);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(i+ "array에 해당하는 인덱스가 없습니다." +e);

            }
        }

    }


}
