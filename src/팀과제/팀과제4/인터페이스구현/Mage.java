package 팀과제.팀과제4.인터페이스구현;

public class Mage implements User {

    @Override
    public void attack() {
        System.out.println("마법사 : 에너지 볼트 발사");
    }
}
