package day20;

public class Audio implements RemoteControl{
    //필드 ( 인스턴스 멤버 vs 정적 멤버 )
    private int volume;

    // 생성자 ( 오버로딩 )

    // 메소드 ( 오버로딩 vs 오버라이딩 )
    // 인터페이스의 추상메소드는 구현클래스에서 오버라이딩(재정의) 매우 필수! :)
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio의 볼륨 : " + this.volume);
    }

    //인터페이스의 디폴트 메소드는 꼭 오버라이딩 안해도 됨. :) 물려받는 느낌.


    private int memoryVolume; // 무음처리시 볼륨 저장했다가.

    @Override
    public void setMute(boolean mute) {
        if(mute){
            this.memoryVolume = this.volume;
            System.out.println("무음 처리합니다.");
            setVolume(RemoteControl.MIN_VOLUME);
        }else{
            System.out.println("무음 해제합니다.");
            setVolume(this.memoryVolume);// 무음 해제시 불러오려고.
        }
    }
}
