package day22;

public class Applicant<T> { // 필드의 T 값의 타입을 정해주는 클래스 정의
    public T kind;

    public Applicant(T kind){
        this.kind = kind;
    }
}
