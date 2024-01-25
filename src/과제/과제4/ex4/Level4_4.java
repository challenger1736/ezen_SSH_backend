package 과제.과제4.ex4;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level4_4 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level4_4 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);

		String[] X_AXIS = new String[5];
		int x = 0;
		X_AXIS[ x ] = "★";

		while ( true ) {
			/* 문제풀이 위치 */
			//System.out.println(x); 분명 x가 증가는 하는데, 왜 와이 // 이런 거 개념때문에 오래걸림. // 한번 더 대입해야함.
			System.out.println();
			for (int i =0; i<X_AXIS.length; i++){
				 System.out.print(X_AXIS[ i ]+"\t");
			}
			System.out.print("\n 1.전진 2.후진 선택> ");
			int a = scanner.nextInt();
			if(a==1){
				if (x==4){;}
				else {x += 1;} // 분명 x가 증가하게 된다. 그리고 x+1또한 별이 된다.
				// 근데 위에 선언 자체가 X_AXIS[0]은 별이라는 것이므로 그 자체 선언은 바뀌지 않는다. 그래서 항상 앞자리 별이 유지 되는 것이었음.
				// 선언 자체를 바꿀순 없으므로 선언을 한 놈을 바꿔야겠으면, [[ 재 선언을 해줘야한다! ]]는 쉽게 풀 개념이 필요하다.
				X_AXIS[ x ] = "★";
				X_AXIS[ x-1 ] = null;
			} else if (a==2) {
				if (x==0){;}
				else {x -= 1;}
				X_AXIS[ x ] = "★";
				X_AXIS[ x+1 ] = null;
			}
			/* ----------- */
		}
	}
}
/* 
	[문제]
		1. String[] X_AXIS = new String[5]; : 문자열 배열 입니다.

		2. 기능선택
			1 입력시 별이 왼쪽으로 이동
			2 입력시 별이 오른쪽으로 이동
			- 만일 배열의 길이보다 벗어나면 최소 또는 최대 위치로 지정하시오.

		3. 그림과 배열의 항목/요소 들을 모두 출력하시오.

		4. 아래 변수들을 활용하시오.
			String[] X_AXIS = new String[5];
			int x = 0;
			X_AXIS[ x ] = "★";
*/
