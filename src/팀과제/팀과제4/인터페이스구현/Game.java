package 팀과제.팀과제4.인터페이스구현;

import java.util.ArrayList;

public class Game {
    static ArrayList<User> 유저들 = new ArrayList<>();
    public static void main(String[] args) {

        User user = new Newbe();
        유저들.add(user);

//        User user1 = new Newbe();
        User user1 = new Assasin(); // 뉴비에서 어쌔신으로 전직
        유저들.add(user1);

//        User user2 = new Newbe();
        User user2 = new Warrior();
        유저들.add(user2);

//        User user3 = new Newbe();
        User user3 = new Archor();
        유저들.add(user3);

//        User user4 = new Newbe();
        User user4 = new Mage();
        유저들.add(user4);

        for(User i : 유저들){ // 향상된 for문 Newbe라는 타입을 갖고있는
            //유저들 = [뉴비,뉴비1,뉴비2,뉴비3,뉴비4]
            //for (Newbe i : 유저들) = for(타입의형태 증가할변수 : 배열이름) -> 배열이름에 있는 타입 내용을 하나씩 출력 인덱스 번호가 1씩 올라가는식으로 출력
            i.attack();
        }
    }
}
