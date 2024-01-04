package 과제.과제1.ex7;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_7 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_7 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		String output = "";
		
		/* 문제풀이 위치 */
		System.out.print("회원명 String : ");
		String 회원명 = scanner.nextLine();
		System.out.print("상태 boolean : ");
		boolean 상태 = scanner.nextBoolean();
		System.out.print("회원번호 byte : ");
		byte 회원번호 = scanner.nextByte();
		System.out.print("성별 char : ");
		char 성별 = scanner.next().charAt(0);
		System.out.print("나이 short : ");
		short 나이 = scanner.nextShort();
		System.out.print("포인트 int : ");
		int 포인트 = scanner.nextInt();
		System.out.print("예금액 long : ");
		long 예금액 = scanner.nextLong();
		System.out.print("키 float : ");
		float 키 = scanner.nextFloat();
		System.out.print("몸무게 double : ");
		double 몸무게 = scanner.nextDouble();

//		System.out.printf("=============회원 개인정보===========\n");
//
//
//
//		System.out.printf("%-10s 회원명 : %-10s \t\t|\n","|",회원명);
//		System.out.printf("%-10s 상태 : %-10s \t\t|\n","|",상태,"|");
//		System.out.printf("%-10s 회원번호 : %-10s \t|\n","|",회원번호,"|");
//		System.out.printf("%-10s 성별 : %-10s \t\t|\n","|",성별,"|");
//		System.out.printf("%-10s 나이 : %-10s \t\t|\n","|",나이,"|");
//		System.out.printf("%-10s 예금액 : %-10s \t\t|\n","|",예금액,"|");
//		System.out.printf("%-10s 키 : %-10s \t\t\t|\n","|",키,"|");
//		System.out.printf("%-10s 몸무게 : %-10s \t\t|\n","|",몸무게,"|");
//
//		System.out.println("=================================");

		output+= "==========회원 개인정보=========\n";
		output+= "|\t\t 회원명 : "+회원명+"\t\t|\n";
		output+= "|\t\t 상태 : "+상태+"\t\t\t|\n";
		output+= "|\t\t 회원번호 : "+회원번호+"\t\t|\n";
		output+= "|\t\t 성별 : "+성별+"\t\t\t|\n";
		output+= "|\t\t 나이 : "+나이+"\t\t\t|\n";
		output+= "|\t\t 예금액 : "+예금액+"\t|\n";
		output+= "|\t\t 키 : "+키+"\t\t\t|\n";
		output+= "|\t\t 몸무게 : "+몸무게+"\t\t|\n";
		output+= "============================\n";

		System.out.println(output);


		// \t 쓰면 거의 맞춰져서 편하다
		/* ----------- */
	}
}
/* 
	[문제조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 기본 자료형8개 + 문자열클래스 변수 1개 를 이용한 9개변수를 입력 받습니다.
		3. 입력받은 9개 변수를 그림과 같이 출력합니다.
		4. 기존에 미리 작성된 변수를 최대한 활용합니다.
		
*/
