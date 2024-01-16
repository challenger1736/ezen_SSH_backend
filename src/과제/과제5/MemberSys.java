package 과제.과제5;

import java.util.Arrays;
import java.util.Scanner;

public class MemberSys {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Member[] members = new Member[100];
		while(true) {
			System.out.println("\n\n--------- 회원 시스템 ---------");
			System.out.print("1.회원가입 2.로그인    선택> ");
			int ch = sc.nextInt();
			sc.nextLine();

			if( ch == 1 ) {
				boolean run = true;
				System.out.print("회원가입 아이디 입력 : ");
				String id = sc.nextLine();
				while (run) {
					for (int i = 0; i < members.length; i++) {
						if(members[i]==null){run = false; break;}
						if (members[i] != null) {
							if (members[i].아이디.equals(id)) {
								System.out.println("중복된 아이디가 존재합니다");
								System.out.print("회원가입 아이디 입력 : ");
								id = sc.nextLine();
								break;
							}
						}
					}
				}
				System.out.print("회원가입 패스워드 입력 : ");
				String pw = sc.nextLine();
				System.out.print("회원 이름 입력 : ");
				String name = sc.nextLine();
				System.out.print("회원 전화번호 입력 : ");
				String pNo = sc.nextLine();
				System.out.print("회원 나이 입력 : ");
				int age = sc.nextInt();
				sc.nextLine();
				Member member1 = new Member(id, pw, name,pNo, age);
				for(int i =0; i < members.length ; i++){
					if(members[i] == null){
						members[i] = member1;
						break;
					}
				}
			}
			else if( ch == 2 ) {
				System.out.print("로그인 아이디 입력 :");
				String id = sc.nextLine();
				System.out.print("로그인 비밀번호 입력 :");
				String pw = sc.nextLine();
				for(int i =0; i < members.length ; i++){
					if(members[i]==null){
						System.out.println("로그인 실패");
						break;
					}
					if(members[i]!=null){
						if(members[i].아이디.equals(id) && members[i].비밀번호.equals(pw)){
							System.out.println("로그인 성공");
							break;
						}
					}
				}

			}

		} // w e 
	} // m e 
} // c e 


/*
 	주제 : 회원제 시스템 part1
 		- Member , MemberSys 클래스를 이용하여 아래 조건에 따라. 코드를 완성하시오.
 		- Member , MemberSys 클래스 외 새로운 클래스를 생성 하지 마시오.
 		- main() 메소드 외 새로운 메소드를 생성 하지 마시오.

 		[ Member 클래스 ]
 		0. 아래 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이

		[ MemberSys 클래스 ]
 		1. 초기 메뉴 [ 무한루프 ]
 			1. 회원가입 2.로그인 
 			
 		2. 조건 기능 
 			1. 회원가입 선택시
 				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장 
 				2. Member 객체화
 				3. 객체를 배열 저장 
 				 
 			2. 로그인 선택시
 				1. 아이디 , 비밀번호 입력받아 저장 
 				2. 입력받은 값과 배열내 동일한 값 찾기
 					- 만약에 동일한 값 있으면 로그인 성공 
 					- 아니면 실패
*/





