package day10;

import java.util.Random;

public class 캐릭터 {

    // 클래스 구성멤버
    // 1. 필드
        String 닉네임;
        String 직업 = "초보자";
        int 레벨 = 1;
        int 체력 = 100;
    // 2. 생성자

    public 캐릭터() {
    }

    캐릭터(String 닉네임, int 체력) {
        this.닉네임 = 닉네임;
        this.체력 = 체력;
    } //

    // 3. 메소드
    public void 공격(){
        Random random = new Random();
        this.체력 -= random.nextInt(10);
        // 얘는 디스 안써도됨, 매개변수 있을시에는 그 매개변수와 필드가 같은 명일때 구분해주기위해 this가 편함.
        return; // 메소드 종료 / 상황에 따라 사용 / 생략가능
    }

    @Override
    public String toString() { //이거 저번에 이거 안만들어서 안나왔었음. 기억하기!! 이거 그냥 메소드네!
        return "캐릭터{" +
                "닉네임='" + 닉네임 + '\'' +
                ", 직업='" + 직업 + '\'' +
                ", 레벨=" + 레벨 +
                ", 체력=" + 체력 +
                '}';
    }
}
