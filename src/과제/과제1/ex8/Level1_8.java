package 과제.과제1.ex8;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_8 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_8 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		String header = "\n============방문록===============\n번호\t 작성자 \t 방문록\n";
		String boardlist = "";
		String footer = "================================\n";
		String output = "";
		
		/* 문제풀이 위치 */

		boardlist = String.valueOf(1);
		int list = Integer.parseInt(boardlist);

		System.out.print("["+list+"]"+"작성자 : ");	//1
		String a = scanner.next();
		String aa = scanner.nextLine();
		System.out.print("["+list+"]"+"방문록 : ");
		String b = scanner.nextLine();
		output += " "+list+"\t "+a+"\t "+b+"\n";
		System.out.println(header+output+footer); list++;


		System.out.print("["+list+"]"+"작성자 : ");	//2
		String c = scanner.next();
		String cc = scanner.nextLine();
		System.out.print("["+list+"]"+"방문록 : ");
		String d = scanner.nextLine();
		output += " "+list+"\t "+c+"\t "+d+"\n";
		System.out.println(header+output+footer); list++;

		System.out.print("["+list+"]"+"작성자 : ");	//3
		String e = scanner.next();
		String ee = scanner.nextLine();
		System.out.print("["+list+"]"+"방문록 : ");
		String f = scanner.nextLine();
		output += " "+list+"\t "+e+"\t "+f+"\n";
		System.out.println(header+output+footer); list++;

		System.out.print("["+list+"]"+"작성자 : ");	//4
		String g = scanner.next();
		String gg = scanner.nextLine();
		System.out.print("["+list+"]"+"방문록 : ");
		String h = scanner.nextLine();
		output += " "+list+"\t "+g+"\t "+h+"\n";
		System.out.println(header+output+footer); list++;

		System.out.print("["+list+"]"+"작성자 : ");	//5
		String j = scanner.next();
		String jj = scanner.nextLine();
		System.out.print("["+list+"]"+"방문록 : ");
		String k = scanner.nextLine();
		output += " "+list+"\t "+j+"\t "+k+"\n";
		System.out.println(header+output+footer); list++;

		}
		
		/* ----------- */
	}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 문자열클래스를 이용하여 그림과 같이 제목과 내용을 입력받습니다. [ 내용만 띄어쓰기가 가능하도록 입력받습니다 ]
		3. *반복문을 사용하지 않고 총 5개의 방문록이 작성 되도록 작성하시오.
		4. 방문록 1번 작성할때마다 방문록을 목록을 보여줍니다.
		5. 기존에 미리 작성된 변수를 최대한 활용합니다.
*/
