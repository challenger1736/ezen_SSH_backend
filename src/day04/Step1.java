package day04;

import java.util.Random;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 기억 잘 하기

        int score = scanner.nextInt();

        if(score >= 90){
            System.out.println("90점 이상 입니다.");
            System.out.println("등급은 A입니다.");
        }
        if(score < 90)
            System.out.println("점수가 90보다 작습니다."); // {} 안써도 한줄까지는 if문으로 기능하나, 그냥 {} 쓰는게 더 확실히 보기 낫다.
        //탭 치면 여기서 부터 생기는거 보면 감적으로도 여긴 if문 안이 아니라는걸 알 수 있게 됨!! 인텔리제이 기능!
            System.out.println("등급은 B등급입니다."); // tap치고 일부러 한칸 넣어도 안됨. 그렇기에 if문과 상관없이 항상 실행되는 것

        //p.115 난수 만들기 : Math.random() , Random 클래스
            // 1. Math.random() : 난수 함수
        System.out.println("0이상 1미만의 난수/랜덤 생성 : "+Math.random());
            // 2.
        System.out.println(new Random()); // 주소값이 나옴.
        System.out.println(new Random().nextInt()); // int 범위내 랜덤 인트수~~
        System.out.println(new Random().nextInt(6));

        // 주사위 난수 : 1~6 사이 난수 생성
//        int num = Math.random();    // 0~1
//        int num = Math.random()*6;  // 0~6
//        int num = Math.random()*6+1; // 0~6+1
        int num = (int)(Math.random()*6);
        System.out.println(num);
        // 2.
        Random random = new Random();
        System.out.println(new Random(6)); // 6번째 시드의 난수라는 뜻, 6번 시드를 가지는 new Random은 모두 같은 수를 준다.
        System.out.println(new Random(6)); // 6번째 시드의 난수라는 뜻, 6번 시드를 가지는 new Random은 모두 같은 수를 준다.
        System.out.println(new Random(6).nextInt()); // 6번째 시드의 난수라는 뜻, 6번 시드를 가지는 new Random은 모두 같은 수를 준다.
        System.out.println(new Random(6).nextInt()); // 6번째 시드의 난수라는 뜻, 6번 시드를 가지는 new Random은 모두 같은 수를 준다.

        // 클래스명 변수명 = new 클래스명(); // 클래스에 해당하는 객체 생성 ( 객체 만드는 이유 : 라이브러리(미리 만들어놓은 기능) 쓸려고 )
        //int num2 = random.nextInt(); // int 허용범위내 난수 생성 , 21억
        int num2 = random.nextInt( 6)+1 ; // 0부터 6미만 난수 생성 // 1~7 난수
        //int num3 = random.nextInt(-6); // 이거 안됨
        //int num4 = num2 + num3;
        //System.out.println(num4);

        if(num2 ==1){System.out.println("주사위 1 입니다.");}
        if(num2 ==2){System.out.println("주사위 2 입니다.");}
        if(num2 ==3){System.out.println("주사위 3 입니다.");}
        if(num2 ==4){System.out.println("주사위 4 입니다.");}
        if(num2 ==5){System.out.println("주사위 5 입니다.");}
        if(num2 ==6){System.out.println("주사위 6 입니다.");}


        // -12 에서 12까지의 난수 만들기, 그냥 라이브러리인듯,
        int minRange = -12;
        int maxRange = 12;
        int randomNumber = random.nextInt((maxRange - minRange) + 1) + minRange;
        // 결과 출력
        System.out.println("생성된 난수: " + randomNumber);

        // 일일이 만들어보기
        int num3 = random.nextInt( 6);
        int num4 = -random.nextInt( 6); // - 붙이는것도 하나의 인트로 취급해서 더 해서 난수 만들기.
        int num5 = num3+num4;
        System.out.println(num5);

    }
}
