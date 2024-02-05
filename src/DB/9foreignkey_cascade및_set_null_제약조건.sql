
/*

	# DB : 데이터베이스 : 기계어 구성된 데이터들의 집합
    
			DBMS(RDBMS -> MYSQL, ORACLE )		<---- MYSQL WORKBENCH : DB연동 UI 소프트웨어 혹은  디비버 를 많이 씀
            ^
            |	SQL 명령어
            |
	  개발자(DBA) : 영어(SQL)


	제약조건
	1.not null
    2.unique
    3.default 값/함수()
	4.(mysql) auto_increment *pk일 경우만 가능 but, insert into 자체에서 문제가 생겨서(DB문제) auto_increment 번호만 증가하는 경우가 있음( 그래서 수동으로 넣어주는게 나을수도 있음(자바로 계산해서 넣어주기))
    5.primary key(pk필드명)
    6.foreign key(fk필드명) references 참조할테이블(참조할pk필드명)
		# 1.  제약조건에 이름 달기. ( 제약조건 이름을 부여해서 삭제할때 식별 - 자동 )
			1-1. constraint 제약조건이름 primary key (pk필드명) 생략시 자동 이름 부여. // 우리가 직접 수정 삭제 할 것 같으면 constraint 하는 것임.
            1-2. constraint 제약조건이름 foreign key(fk필드명) references 참조할테이블(참조할pk필드명)
		# 2.  제약조건에 무결성 옵션 설정. 
			* 무결성 : 데이터의 정확성, 일관성을 유지.
			2-1. foreign키 명령어 제일 뒤 on delete restrict/cascade/noaction/set null.
            2-2. foreign키 명령어 제일 뒤 on update restrict/cascade/noaction/set null.
            	restict는 기본 값(pk-fk 데이터가 서로 참조일 경우 취소/실행불가) = noaction
                cascade(pk-fk 데이터가 서로 참조일 경우 같이 삭제/업데이트)
                set null(pk-fk 데이터가 서로 참조일 경우 foreign key를 null로 업데이트)
                
                
	# 3. 조인 = 테이블 합치기 (다중 테이블을 검색, 불러오기 등 쓰는 용)
		1. select *from 테이블명a, 테이블명b where 테이블명a.mno = 테이블명b.mno;
		1. select *from 테이블명a natural join 테이블명b; // 단 fk pk 필드명 일치해야함
    
	# pk - fk
    집합
    1. 교집합 = pk와 fk 일치했을때,
    2. 합집합 = pk와 fk 합치기.
    3. 차집합 = pk와 fk 제외/뺀
        
*/
drop database if exists test7;
create database test7;
use test7;

#1. 회원 테이블
drop table if exists member;
create table member(
	mno int auto_increment,
    mid varchar(30),
    mpw varchar(30),
    
    constraint member_mno_pk primary key(mno)
);

#2. 게시판 테이블
drop table if exists board;
create table board(
	boardno int auto_increment,
    boardtitle text,
    boardcontent text,
    
    mno int,
    
    constraint board_bno_pk primary key (boardno),
	constraint board_mno_fk foreign key (mno) references member(mno)
    );

#3. 샘플..
insert into member(mid,mpw) values ('a','a');
insert into member(mid,mpw) values ('b','b');
insert into member(mid,mpw) values ('c','c');

insert into board(boardtitle,boardcontent,mno) values ('자바','안녕하세요', 2);
# 1번 회원 탈퇴
# delete from member where mno = 1;

# 1번 회원 회원번호 수정
# update member set mno = 4 where mno =1 ; -- 업데이트도 restrict 안됨.
select*from member;
select*from board;

insert into board(boardtitle,boardcontent,mno) values('자바2', '안녕하세요2', 1);

 # 1번 게시물의 작성자 아이디를 알고 싶다.
	# 1번 게시물의 작성자 mno 찾기
    select mno from board where boardno = 1; -- 2
    
    # 찾은 mno를 가지고 회원의 아이디(mid) 찾기
    select mid from member where mno = 2;	-- b
    
    ##################### 관계가 있는 테이블 간의 조인 해보기 ########################
    
    # 1. where 절을 이용한 합치기 [ 일반 조건 where 인지? 테이블을 합치기 위한 where 인지? 가독성 떨어짐. 실무 잘 안씀. ]
    select * from member;
    select * from board;
    
    select * from member, board; -- 중복이 생김 A테이블 레코드 1개마다 * B테이블 레코드 수 로 출력됨. (a레코드수 * b레코드수)
    
    #select * from member, board where mno = mno; 누구 mno인지 몰라서 안됨
		# 1. 필드명 앞에 테이블을 붙인다.
	select * from member,board where member.mno = board.mno order by boardno;
		# 2. 테이블명에 별칭(검색시에만 사용되는 이름 - 원본 상관없음)
	select * from member m,board b where m.mno = b.mno order by boardno;
    
    #2. JOIN 절 이용
    select *from member natural join board;
    
    
    
    
