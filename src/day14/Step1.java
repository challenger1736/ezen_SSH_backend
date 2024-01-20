package day14;
class A{

}

class B extends A{

}

class C extends A{

}

class D extends B{

}

class E extends C{

}

public class Step1 {

        public static void main(String[] args) {
            B b = new B();
            C c = new C();
            D d = new D();
            E e = new E();

            // 자식도 가능하고 자손도 가능.
            A a1 = b;
            A a2 = c;
            A a3 = d;
            A a4 = e;

            B b1 = d;
            C c1 = e;

//            B b3 = e; // 컴파일 에러- 상속관계 아님
//            C c2 = d; // 컴파일 에러- 상속관계 아님
        }
}
/*

    상속 p284
        -  부모가 자식에게 물려주는 행위
        - 객체지향에서도 부모 클래스의 필드와 메소드를 자식 클래스에게 물려줄 수 있다
        - 사용목적 : 이미 잘 개발된 클래스를 재사용해서 새로운 클래스를 만들기 때문에 중복 코드 줄임
        - 키워드 : extends
           1. 자식/하위/서브 클래스 extends 슈퍼/상위/부모 {} 단 하나의 상속받기만 가능
        - 사용방법
           1. 자식클래스가 부모클래스를 선택
              class 자식클래스명 extends 부모클래스명{ }
           2. 자식클래스 선언할때 extends 이용한 부모클래스 상속받기
        - 부모 생성자 호출
           - 자식 객체가 생성될 때 부모객체 우선적으로 생성 +
           super.메소드()
        - 메소드 재정의[오버라이딩]
           1. 부모 메소드의 선언부 동일 2. 접근제한 더 강하게 할 수 없다.
           2.@Override
        - 부모 메소드 호출
            - 자식은 부모를 이미 가진다.
           super.메소드()
        - final
           - 필드   : 필드의 값 수정 불가능
              String final 필드명       - 필드 값 고정
              String static final 필드명   - 프로그램 전체에서 1개만 갖는 필드 => 상수
           - 클래스 : 상속불가 클래스 만들기
              public final class 클래스명{} - 해당 클래스는 부모클래스가 될 수 없다.
           - 메소드 :
              public final void 메소드명(){} - 만일 상속받았을 때 재정의 불가 메소드
        - 접근제한자
           -
           public      : 필드, 생성자, 메소드, 클래스   : 프로젝트 내 모든 구역 호출 가능
           private      : 필드, 생성자, 메소드      : 내부 클래스 내에서만 호출 가능
           protected   : 필드, 생성자, 메소드      : 동일 패키지 + 자식객체만 사용 가능
           (default)      : 필드, 생성자, 메소드, 클래스   : 동일 패키지
        ================================================================================
        JVM
        메소드영역      스택영역         힙영역
        - 클래스정보      - 지역변수(함수)      - 인스턴스
        - 자식 객체 힙영역 메모리 할당할 때 부모 객체 힙영역에 메모리 할당 한다

        ===============================================================================

        접근제한자 : public/private/protected/(default)
        정적 : static
        최종 : final
        현재객체 : this
        상위객체 : super
        상속 : extends

        - 클래스 선언
                - (접근제한자 public/default) (final : 해당 클래스의 자식이 있게 할건지) class 클래스명 extends 상위클래스 {}
                // ★static은 객체 지향적이지 않음.(static하면 클래스가 하나가 되기때문)

        - 필드 선언
                - (접근제한자 public/default/protected/private)(정적 static/ 인스턴스) (final) 타입[기본/참조(클래스, 배열, 인터페이스)] 필드명;
                // 상수는 (static final) 필드명 싹 대문자로 예 Math.PI

        - 생성자 선언
                - (접근제한자 public/default/protected/private) 생성자(매개변수){}
                // ★static은 객체 지향적이지 않음.(static하면 클래스가 하나가 되기때문), final 하면 생성자를 변경할 수 없다는 뜻이므로 생성자에 할 필요가 없다. / 생성자는 객체의 필드 초기화용이기 때문
                //생성자명 == 클래스명으로 사용해야함!, 오버로딩을 지원한다

        - 메소드 선언
                - (접근제한자 public/default/protected/private)(정적 static/ 인스턴스) (final : 해당 놈이 자식에서 오버라이딩 가능하게 할 건지) 반환타입[기본/참조(클래스, 배열, 인터페이스)] 메소드명(매개변수){ return 반환타입;}
                // 오버로딩(매개변수에 따라 달라짐), 오버라이딩(부모클래스로부터 상속받은 메소드를 재정의)을 지원한다 / 오버로딩과 오버라이딩을 같이 할 수없다.

        ===========================================================================================================================================================

        기본타입 변환
            1. 자동형변환
                    byte -> short -> int -> long -> float -> double
                    int a = 10;
                    long b  = a;
            2. 강제형변환
                    byte <- short <- int <- long <- float <- double
                    - (변환할 타입)
                    long a = 10;
                    int b =(int)a;
                    
            - 타입 확인 작업 typeOf가 필요할 수 있다 그게 instanceOf는 참조타입임
                    
       참조타입 변환
            * 자바의 모든 클래스는 Object 클래스로부터 자동 상속 받는다.
            1. 자동 타입 변환
                    * 자식객체가 부모타입으로 변환시 자식타입의 필드/메소드를 사용할 수 없다.
                    * 오버라이딩 된 메소드는 부모타입이 아닌 자식타입의 메소드가 우선 갖는다. 다형성
                    부모타입 = 자식타입
                    Object -> car -> superCar
            
            2. 강제 타입 변환
                * 원래 자식타입이었던 객체가 부모타입으로 변환후 다시 자식타입으로 변환할 때
                자식타입 = (자식타입) 부모타입
            
            3. 타입 확인
                instanceOf

 */