package day22;

public class Course { // 필드의 값의 타입 정해주는 클래스를
    // 1. 모든 사람이면 등록 가능. ?
    public static void registerCourse1(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");
    }// .getClass().getSimpleName() : 객체의 클래스명 호출 함수
    // 2. 학생만 등록 가능. ? extends Student
    public static void registerCourse2(Applicant<? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함");
    }
    // 3. 직장인 및 일반인 등록 가능.
    public static void registerCourse3(Applicant<? super Worker> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");
    }
}
