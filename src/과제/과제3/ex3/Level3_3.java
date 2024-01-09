package 과제.과제3.ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level3_3 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level3_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		
		int july1 = 3532100; 
		int july2 = 9123700;
		int july3 = 5183400;
		int july4 = 11738700;
		
		/* 문제풀이 위치 */

		july1 = 3532100/10000;
		String j1 = "";
		String j2 = "";
		String j3 = "";
		String j4 = "";
		for(int i=0; i<=july1/100; i++ ){j1+="■";}
		july2 = 9123700/10000;
		for(int i=0; i<=july2/100; i++ ){j2+="■";}
		july3 = 5183400/10000;
		for(int i=0; i<=july3/100; i++ ){j3+="■";}
		july4 = 11738700/10000;
		for(int i=0; i<=july4/100; i++ ){j4+="■";}
		System.out.println("---------- 7월 매출액 ----------");
		System.out.print("1주차 : "+j1+july1+"만원\n");
		System.out.print("2주차 : "+j2+july2+"만원\n");
		System.out.print("3주차 : "+j3+july3+"만원\n");
		System.out.print("4주차 : "+j4+july4+"만원\n");
		/* ----------- */
	}
}
/* 
	[문제] 
		다음과 같이 july1,july2,july3,july4 변수는 7월의 1주차,2주차,3주차,4주차 의 매출액이 저장된 변수 입니다.
		1. 주차별로 100만원당 도형 '■' 출력하시오.
		2. 도형 뒤로는 그림과 같이 만원대 까지만 출력하시오.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.

*/
