package day06;

import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("시간(hhmmss형식) : ");
        String time = scanner.nextLine();
        System.out.print("시간(숫자) : ");
        String second = scanner.nextLine();

        int h = Integer.parseInt(time.substring(0,2));
        System.out.println("h = " + h);
        int m = Integer.parseInt(time.substring(2,4));
        System.out.println("m = " + m);
        int s = Integer.parseInt(time.substring(4,6));
        System.out.println("s = " + s);
        // 강사님 풀이법 m += (s/60)
        //             h += (m/60) 60으로 나눈값 몫을 더하기! 인트라서 어차피 몫만 더해짐.
        // hh = hh > 24 ? hh-24 : hh; 24 넘어가면!
        int s2 = Integer.parseInt(second);
        int s3 = s+s2;
        while(s3/60>=1){m++; s3 -= 60;}
        while(m/60>=1){h++; m -= 60;}
        String h2 = "";
        String m2 = "";
        String s4 = "";
        if(h<10){h2 = ""+h; h2 = "0"+h2;}
        else{h2=""+h;}
        if(m<10){m2 = ""+m; m2 = "0"+m2;}
        else{m2=""+m;}
        if(s3<10){s4 = ""+s3; s4 = "0"+s4;}
        else{s4=""+s3;}




        String result ="";
        result =  h2+":"+m2+":"+s4;
            // 입력받은 time에서 second만큼 지난 시간을 hhmmss 형식으로 출력
        System.out.println("result = " + result);


        /*
                예시
        *   time = 145930
        *   second = 70
        *       result = 15:00:40
        * */
    }
}

// 강사님 풀이
/*
    //1. 입력받은 time의 초 추출
    int ss= Integer.parseInt(time.substring(4,6));
        //2. 입력받은 초를 더하기
        ss += Integer.parseInt(second)

    int mm= Integer.parseInt(time.substring(2,4));
    mm += (ss/60); // 초를 60으로 나눈 값의 몫을 더한다.

    int hh= Integer.parseInt(time.substring(0,2));
    hh += (mm/60); // 초를 60으로 나눈 값의 몫을 더한다.


    prinf 를 쓰면 String으로 자동변환되는건가? ㅇㅇ



*/
