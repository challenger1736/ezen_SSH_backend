package day16;

// 클래스 : 일반 클래스가 인터페이스의 추상메소드를 구현했으면 구현클래스라고 함.
public class Television implements RemoteControl{
    // - implements 재정의한 메소드가 있어요! 라는 뜻.
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    private int volume;
    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume<RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 볼륨 volume = " + volume);
    }
}
