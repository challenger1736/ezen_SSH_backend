package day07;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 입력받기 위한 new 객체
        int i = 0;
        Phone[] phoneBook = new Phone[100]; // 폰이 들어갈 폰북을 만든것임. 100개 짜리
        Phone phone = new Phone();
        while(true) {
            System.out.println("============= 전화번호부 =============");
            System.out.println("순번     이름      전화번호");
            for(int j = 0 ;  j < i ; j++){
                if( phoneBook[j] ==null){}
                else{
                System.out.printf("%-8d %-8s %s\n", j+1 , phoneBook[j].name , phoneBook[j].phoneNo);}
            }
            System.out.println("1.전화번호등록 2.전화번호삭제");
            System.out.print("선택> ");
            //System.out.println("test ; phone.name : " + phone.name);
            //System.out.println("test ; phone.phoneNo : " + phone.phoneNo);
            String a = scanner.nextLine();

            if (a.equals("1")) {//등록
                System.out.print("이름 : ");
                String 이름 = scanner.nextLine();
                System.out.print("전화번호 : ");
                String 폰번 = scanner.nextLine();
                phoneBook[i] = new Phone(); // 이거네,, 왜지? 스트링이기 때문에!인것 같다.
                phoneBook[i].name = 이름;
                phoneBook[i].phoneNo = 폰번;
                i++;
            } else if (a.equals("2")) { //삭제
                System.out.print("삭제할 번호를 입력하세요. : ");
                String 삭제번호 = scanner.nextLine();
                phoneBook[Integer.parseInt(삭제번호)-1] = null;

            }
        }
    }

}

