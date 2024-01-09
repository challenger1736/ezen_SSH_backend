package day06;

import java.util.Scanner;

public class Step6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String 전화번호부 = "";
        String[][] arr;
        while (true){
            System.out.println("=================전화번호부===================");

            System.out.print("1.전화번호 등록 2.전화번호 삭제 3.전화번호 출력");
            int no = scanner.nextInt();
            scanner.nextLine();

            if (no == 1){
                System.out.print("이름:전화번호 입력");
                전화번호부 += scanner.nextLine()+",";

            }
            else if (no==2){
                String[] 전화번호부Array = 전화번호부.split(",");
                arr = new String[전화번호부Array.length][2];
                System.out.println("삭제하고싶은 번호을 입력하세요");
                System.out.printf("%s %5s %20s\n","순번","이름","전화번호");
                for (int i =0; i<arr.length; i++) {
                    arr[i] = 전화번호부Array[i].split(":");
                    System.out.printf("%d %5s %20s\n", i + 1, arr[i][0], arr[i][1]);
                }
                전화번호부 = "";
                int n = scanner.nextInt();
                for (int i =0 ; i<arr.length; i++){
                    if(n-1 != i){
                        전화번호부 +=arr[i][0]+":"+arr[i][1]+",";
                    }
                }
            }
            else if (no==3){
                String[] 전화번호부Array = 전화번호부.split(",");
                arr = new String[전화번호부Array.length][2];
                System.out.printf("%s %5s %20s\n","순번","이름","전화번호");
                for (int i =0; i<arr.length; i++){
                    arr[i] = 전화번호부Array[i].split(":");
                    System.out.printf("%d %5s %20s\n",i+1,arr[i][0],arr[i][1]);
                }
            }
        }
    }
}
