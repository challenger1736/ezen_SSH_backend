package day04; // 패키지

public class Step2 { //class s
    public static void main(String[] args) { //main s

        //p.124
        // 1. 1~10  출력하는 코드
        System.out.println( 1+" ");
        System.out.println( 2+" ");
        System.out.println( 3+" ");
        System.out.println( 4+" ");
        System.out.println( 5+" ");
        System.out.println( 6+" ");
        System.out.println( 7+" ");
        System.out.println( 8+" ");
        System.out.println( 9+" ");
        System.out.println( 10+" ");
        // -for 변환
        for(int i = 1 ; i<=10 ; i++){
            System.out.println(i+" ");
        }// for e

        // 2. 1~100까지 합.
        int sum = 0; //for 안에서도 쓰고 밖에서도 쓰려고(for안에 있으면 지역 변수로 밖으로 못 나감), 저장하려고
        int i = 1;
        for(i = 1; i<=100 ; i++){
            sum += i;
            System.out.println(sum);
        }

        System.out.println("sum = " + sum);
        System.out.println("1~"+(i-1)+"합 : "+ sum); // 밖에 이거 합적기 위해서 일부러 밖으로 변수 선언 한듯 i
        
        // 3. 구구단 : 중첩 for문
        for (int 단 = 2; 단<=9 ; 단++){
            for(int 곱 = 1; 곱<=9 ; 곱++){
                System.out.println(단+" X "+곱+" = "+ 단*곱);
                //printf로 표현해보기
                System.out.printf("%3d X %-3d = %-3d\n",단,곱,(단*곱));
            }
        }
        // 4. while 문으로 바꿔보기
        int j = 1;
        while (j<=10){
            System.out.println(j+" ");
            j++;
        }

        // 5. for > while로 1~100 누적 합계
        int sum2 = 0;
        int m = 1;
        while(m<=100){
            sum2 += m;
            System.out.println(sum2);
            m++;
        }
        System.out.println("1~"+(m-1)+ "합 : " +sum2);

        //6. 구구단 while문으로 바꿔보기
        int 단2 = 2;
        while (단2<=9) {
            int 곱2 = 1;                     // 안에 있는 i, 단, 곱등도 실제로 변화하는 것이므로 또 변수 선언은 1로 해줘야 함.
            while (곱2<=9){                  // 아니면 9에서 멈춰있게 됨!
                System.out.println(단2+" X "+곱2+" = "+ 단2*곱2);
                곱2++;
            }
            단2++;
        }
        }
        //main e
} //class e


