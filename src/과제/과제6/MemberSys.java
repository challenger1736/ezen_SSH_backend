package 과제.과제6;
import java.util.Scanner;

public class MemberSys { // class s
	static Member[] 객체배열 = new Member[100]; // 정적필드 필드라서,


	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);

		while(true) {

			System.out.println("\n\n--------- 회원 시스템 ---------");
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
			int ch = sc.nextInt();

			if( ch == 1 ) {
				System.out.println("회원가입 하기 -");
				System.out.print("아이디 : ");
				String 아이디 = sc.next();
				System.out.print("비밀번호 : ");
				String 비밀번호 = sc.next();
				System.out.print("이름 : ");
				String 이름 = sc.next();
				System.out.print("전화번호 : ");
				String 전화번호 = sc.next();
				System.out.print("나이 : ");
				int 나이 = sc.nextInt();
				Member member = new Member(아이디, 비밀번호, 이름, 전화번호, 나이);
				Member.signup(member);
			}
			else if( ch == 2 ) {
				System.out.println("로그인 하기 -");
				System.out.print("아이디 : ");
				String 아이디 = sc.next();
				System.out.print("비밀번호 : ");
				String 비밀번호 = sc.next();
				Member.getInstance().set아이디(아이디);
				Member.getInstance().set비밀번호(비밀번호);
				if(Member.login(Member.getInstance())){
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
			}
			else if( ch == 3 ) {
				System.out.print("가입한 휴대폰 번호 입력 : ");
				String 전화번호 = sc.next();
				Member.getInstance().set전화번호(전화번호);
				if(!(Member.idSearch(Member.getInstance().get전화번호()).equals(""))){
					System.out.println("찾는 아이디 :" + Member.idSearch(Member.getInstance().get전화번호()));
				}else {
					System.out.println("해당하는 아이디가 없습니다.");
				}
			}
			else if( ch == 4 ) {
				System.out.print("가입한 아이디 입력 : ");
				String 아이디 = sc.next();
				Member.getInstance().set아이디(아이디);
				if(!(Member.pwSearch(Member.getInstance().get아이디()).equals(""))){
					System.out.println("찾는 아이디의 비밀번호 :" + Member.pwSearch(Member.getInstance().get아이디()));
				}else {
					System.out.println("해당하는 아이디가 없습니다.");
				}
			}

		} // w e
	} // m e 
} // class e 
/*
	주제 : 회원제 시스템 part2
	 	- Member , MemberSys 클래스를 이용하여 아래 조건에 따라. 코드를 완성하시오.
 		- Member , MemberSys 클래스 외 새로운 클래스를 생성 하지 마시오.
 		- main() 메소드 외 기능별 함수를 4개 생성하시오.

		[ Member 클래스 ]
 		0. 아래 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		1. 생성자 사용하시오.
		2. getter , setter 메소드를 사용하시오.

		[ MemberSys 클래스 ]
		0. 배열
			Member[] 객체배열 = new Member[100];

		1. 초기 메뉴
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
			
		2. 조건 기능 
			1. 회원가입 메소드 
				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장 
				2. Member 객체화
				3. 객체를 배열 저장 
				 
			2. 로그인 메소드
				1. 아이디 , 비밀번호 입력받아 저장 
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 로그인 성공 
					- 아니면 실패
					 
			3. 아이디찾기 메소드
				1. 이름 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 아이디 출력 
					- 아니면 없다.
					 
			4. 비밀번호찾기 메소드 
				1. 아이디 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 비밀번호 출력
					- 아니면 없다.

			
*/














