package day21;

public class Car { //익명객체에 대한 이해.
    //필드에 Tire 객체 대입
    private Tire tire1 = new Tire();

    private Tire tire2 = new Tire(){// 필드에 익명 자식객체 대입
        @Override
        public void roll() {
            System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
        }
    };
    // Tire 클래스로 부터 상속 받은 객체 정의 //
    // 필드는 선언가능
    int speed = 10;
    // 생성자는 X
    // 메소드 생성 가능
    public void method1(){
        System.out.println("ddd");
    }
    public void run1(){
        tire1.roll();
        tire2.roll();
    }

    public void run2(){// 지역변수에 익명 자식객체 대입
      Tire tire = new Tire(){
          @Override
          public void roll() {
              System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
          }
      };
      tire.roll();
    }

    public void run3(Tire tire){
        tire.roll();
    }

}
