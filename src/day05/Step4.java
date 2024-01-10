package day05;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        // p.199 확인문제
        int[] array={1,5,3,8,2};
        int temp = 0;
            for(int i=0; i< array.length; i++){
                for(int a=i+1; a<array.length; a++){
                    if(array[i]>array[a] && temp<=array[i]){temp = array[i];}
                    else if (array[i]<array[a] && temp<=array[a]){temp = array[a];}

                }

            }
        System.out.println(temp);



            // 확인문제 9번
        Scanner scanner = new Scanner(System.in);

            int[] students = new int[0];
        while (true){
            // 2. 출력
            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            // 3. 입력
            System.out.print("선택 > "); String ch = scanner.nextLine();
            // 4. 경우의 수

            if(ch.equals("1")){
                System.out.print("학생수 > ");
                String count = scanner.nextLine();
                // while 밖에서 입력받은 수 만큼 배열 선언 => 다른 if {} 에서 사용하기 위해.
                // [p.172] 입력받은 (문자->정수 변환) 만큼 배열길이 초기화
                students = new int[Integer.parseInt(count)]; // 기존 데이터는 사라짐.
            }
            else if(ch.equals("2")){
                // 6. [1]번에서 입력받은 학생수 만큼 점수를 입력받기.
                for( int i =0 ; i<students.length ; i ++){
                    System.out.printf("scores[%d] > ", i);
                    // 입력받은 문자열 -> 정수 변환해서 i번째 인덱스에 저장.
                    students[i] = Integer.parseInt(scanner.nextLine());
                } // for end
            }
            else if(ch.equals("3")){
                // 7. 배열내 모든 학생 점수 출력
                for( int i =0 ; i<students.length ; i ++){
                    System.out.printf("scores[%d] : %d \n", i, students[i]);

            }}
            else if(ch.equals("4")){
                int max = 0; // 임의로 최저 점수 넣고 시작
                for(int i = 0 ; i <students.length ; i++){
                    if(students[i]>max){max = students[i];}
                }
                System.out.println("max = " + max);

                double avg = 0.0;
                for(int i = 0 ; i <students.length ; i++){
                    avg += students[i];
                }
                double avg2 = avg/students.length;
                System.out.printf("avg = %.1f \n" , avg2);

            }
            else if(ch.equals("5")){
                System.out.println("프로그램 종료");
                break;}
        }


    }
}
