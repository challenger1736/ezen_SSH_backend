package 과제.과제4.ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level4_3 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level4_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);

		int[] point = { 97 , 73 ,52 , 76 , 51 };

		/* 문제풀이 위치 */
		System.out.print("정렬 전 : ");
		for (int i = 0; i <point.length; i ++){
			System.out.print(point[i]+"\t");
		}
		System.out.print("\n정렬 후 : ");
		for (int i = 0; i <point.length; i++){
			int temp;
			for (int a = i+1; a< point.length; a++){
				if(point[i]>point[a]){temp=point[i]; point[i]= point[a]; point[a]=temp;}
			}
		}
		for (int i = 0; i <point.length; i ++){ // 복 붙
			System.out.print(point[i]+"\t");
		}

		/* ----------- */
	}
}
/* 
	[문제]
		1. int[] point = { 97 , 73 ,52 , 76 , 51 }; int형 배열입니다.
		2. 오림차순으로 정렬하시오.
		3. 정렬 전 과 정렬 후 배열을 그림과 같이 출력하시오.
*/
