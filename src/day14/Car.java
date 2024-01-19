package day14;

public class Car {
//    public Tire tire = new HankookTire();
//    Tire tire2 = new KumhoTire();//이런식으로 바꿔서 들어가도됨. 위의 tire에 KumhoTire넣어도 됨
    //1. 한국타이어 객체 + 하위객체 있으면! 그것만 저장
    //HankookTire hankookTire;
    //2. 금호타이어 객체 + 하위객체 있으면! 그것만 저장
    //KumhoTire kumhoTire;
    //3. 타이어 객체 + 하위객체(한국or 금호타이어)! 저장 // 바꿔쓸거면 이렇게 상위 타입으로 잡는게 낫다, 혹은 추가될 거 같으면.
    Tire tire;

    public void run(){
        tire.roll();
    }



}
