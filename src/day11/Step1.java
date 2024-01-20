package day11;

public class Step1 {
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-1234567","감자바");

        // 필드 값 읽기
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        //k1.nation ="USA"; // final은 초기화 이후 수정 불가
        //k1.ssn="123123-1231213"; // final은 초기화 이후 수정 불가 1번 초기화 밖에서도 가능.
        k1.name = "김자바";

        // 4. 상수호출
        System.out.println(Korean.EARTH_RADIUS);
        System.out.println(Korean.EARTH_SURFACE_AREA);

    }
}
