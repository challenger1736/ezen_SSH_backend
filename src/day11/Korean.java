package day11;

public class Korean {

    //멤버
    //1.필드(정적/인스턴스)
        // 1. 인스턴스 final 필드
            // - final : 프로그램 실행 도중에 수정할 수없게 만드는 키워드.
            // 1. 필드 선언시
            // 2. 생성자에서 초기값 대입
    final String nation = "대한민국";
    final String ssn;
        // 2. 인스턴스 필드
    String name;

        // 3. 상수 필드 : 불변의 값
            // - static final
            // 1. 상수명은 관례적으로 모두 대문자 // 2. 상수선언시 초기값 대입 // 3. 정적블록에서 초기화도 가능함.(static{})
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;
        // 정적블록 [static멤버들의 초기값 대입]
    static { //static{} = 해당 클래스의 모든 인스턴스가 생성되기 전에 실행됩니다. / 정적 영역 한 공간을 만들어버리기, 객체 안에!
        EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS; //Math라는 public final클래스는 이미 자바안에 있다.
        // new 뒤에오면 생성자;
            // .()메소드; //. 소괄호없으면 필드;
    }

    //2. 생성자
    public Korean(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }
    //3. 메소드(정적/인스턴스)
}
