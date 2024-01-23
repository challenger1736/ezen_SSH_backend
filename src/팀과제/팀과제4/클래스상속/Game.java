package 팀과제.팀과제4.클래스상속;

import java.util.ArrayList;

public class Game {
    static ArrayList<Newbe> 유저들 = new ArrayList<>();
    public static void main(String[] args) {

        Newbe newbe = new Newbe();
        유저들.add(newbe);

        Newbe newbe1 = new Newbe();
        newbe1 = new Assasin(); // 뉴비에서 어쌔신으로 전직
        유저들.add(newbe1);

        Newbe newbe2 = new Newbe();
        newbe2 = new Warrior();
        유저들.add(newbe2);

        Newbe newbe3 = new Newbe();
        newbe3 = new Archor();
        유저들.add(newbe3);

        Newbe newbe4 = new Newbe();
        newbe4 = new Mage();
        유저들.add(newbe4);

        for(Newbe i : 유저들){ // 향상된 for문 Newbe라는 타입을 갖고있는
            //유저들 = [뉴비,뉴비1,뉴비2,뉴비3,뉴비4]
            //for (Newbe i : 유저들) = for(타입의형태 증가할변수 : 배열이름) -> 배열이름에 있는 타입 내용을 하나씩 출력 인덱스 번호가 1씩 올라가는식으로 출력
            i.attack();
        }
    }
}
