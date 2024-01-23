package 팀과제.팀과제4.인터페이스구현;

public class Warrior implements User {

    @Override
    public void attack() {
        System.out.println("전사 : 대검 내려치기");
    }
}
