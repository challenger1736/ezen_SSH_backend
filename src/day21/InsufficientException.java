package day21;

public class InsufficientException extends Exception{
    public InsufficientException() {
    }

    public InsufficientException(String message) {
        super(message); // super : 상위 객체 vs this : 본인 객체
        // 2. 생성자에 부모 생성자를 작성한다.
        //getMessage(); // Throwable로부터 상속받아서. 가져올 수 있음.
        /*
                super   vs      this
        필드      x            this.필드명
        생성자  super()            x
        메소드  super.메소드명()     x
         */
    }
}
