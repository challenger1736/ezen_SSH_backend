package day06;

import java.util.Scanner;

public class Step6_2 {      // 재훈씨꺼
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String 전화번호부 = "";
        String[][] arr; // 배열을 배열에 넣는 arr를 만들기.
        while (true){
            System.out.println("=================전화번호부===================");

            System.out.print("1.전화번호 등록 2.전화번호 삭제 3.전화번호 출력");
            int no = scanner.nextInt();
            scanner.nextLine();

            if (no == 1){
                System.out.print("이름:전화번호 입력");
                전화번호부 += scanner.nextLine()+","; // 전화번호부에 이름:전화번호, 로 하나 입력됨

            }
            else if (no==2){
                String[] 전화번호부Array = 전화번호부.split(","); //전화번호부Array에 전화번호부 스플릿배열을 넣을 것 // 한명, 한명,
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
                String[] 전화번호부Array = 전화번호부.split(","); // 전화번호부를 ,로 나눈걸로 결국 한명씩 나누는 일
                arr = new String[전화번호부Array.length][2];         // 한명씩 나눈 전화번후부Array의 길이만큼 나눈 Null이 들어간 배열을 을 또 2개의 Null로 나누는 일
                System.out.printf("%s %5s %20s\n","순번","이름","전화번호");
                for (int i =0; i<arr.length; i++){
                    arr[i] = 전화번호부Array[i].split(":"); // : 으로 또 나눠 출력
                    System.out.printf("%d %5s %20s\n",i+1,arr[i][0],arr[i][1]);
                }
            }
        }
    }
}
