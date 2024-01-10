package day07;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Step4 {

    public static void main(String[] args) {
        Phone[] phoneBook = new Phone[100]; // 클래스를 감쌀 놈을 만든거지 Phone 그 자체가 클래스가 아님
        Phone phone = new Phone();      // 폰 클래스를 객체로 선언해줘야함!!!!★★★
        String output = "";
        int i = 0;
        while(true){
        Scanner scanner = new Scanner(System.in);
        System.out.println("============= 전화번호부 =============");
        System.out.println("순번     이름      전화번호");
            System.out.println(output);
        System.out.print("1. 전화번호 등록, 2.전화번호 삭제 : ");
        int ch = scanner.nextInt();
        scanner.nextLine();
        if (ch == 1) {
            System.out.print("이름 : ");
            String 이름 = scanner.nextLine();
            System.out.print("전화번호 : ");
            String pNum = scanner.nextLine();
            phone.name = 이름;
            phone.phoneNo = pNum;
            phoneBook[i] = phone;
            output += " "+(i+1)+"       "+phoneBook[i].name+"       "+phoneBook[i].phoneNo+"\n";

            i++;
        }else if (ch == 2) {
            System.out.print("삭제할 전화번호부 번호를 입력하세요. : ");
            int del = scanner.nextInt();
            for(int j = 0; j <=99 ; j++){
                output = " ";
                if (j!=del-1){
                    output += " "+(j+1)+"       "+phoneBook[j].name+"       "+phoneBook[j].phoneNo+"\n";
                }else{ }
                i--;
            }


        }


        }
    }
}

