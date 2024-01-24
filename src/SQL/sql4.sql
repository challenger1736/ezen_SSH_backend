/*
	데이터베이스 : 데이터(자료) 집합(모임)
		- 관계형 데이터베이스(RDBMS) : 행/열로 이루어진 테이블(자료의 모임)이면서 테이블간의 관계
        - 컴퓨터 데이터 저장 --> sql 데이터 베이스에서 사용되는 데이터 처리 언어.
			-------------------- DDL : 데이터 정의어 -------------------
        1. drop
			drop database if exists 데이터베이스명
            drop table if exists 테이블명;
        2. create
			create database 데이터베이스명
            create table 테이블명( 필드명 타입 제약조건, 필드명 타입 제약조건, 필드명 타입 제약조건 );
            -------------------- DML : 조작어 ★★★★★★-----------
            1. insert : 레코드 삽입 (레코드 단위로 움직인다!, 레코드중 하나의 필드만 넣을수없다)
				1. 모든 필드 :insert into 테이블명 values(값1,값2)
				2. 특정 필드 :insert into 테이블명(필드명, 필드명) values (값1, 값2);
                
            2. select : 레코드 검색
				1. 모든 필드 레코드 검색 : select*from 테이블명;
                
			3. update : 레코드의 필드 값 변경
				1. update 테이블명 set 수정할필드명 = 수정할값, 수정할필드명 = 수정할값;
                
			4. delete : 레코드 삭제
				1. delete from 테이블명;
            
		- 제약 조건
			1. not null
            2. unique
            3. default
		
*/
# 1. 데이터베이스 생성
drop database if exists test4;
create database test4;
use test4;

# 2. 테이블 생성
drop table if exists member;
create table member(
	mno int not null unique, -- 회원번호 int타입 null을 포함하지않고 중복을 시키지 않는다.
    mid varchar(30) not null unique, -- 회원아이디 가변길이 문자타입
    mdate datetime default now() ,					-- 가입 날짜 날짜/시간 타입 , now() : 현재날짜/시간 반환해주는 SQL 함수
    primary key(mno)							-- mno를 식별키로 사용하겠다. (pk)
);

# 3. 회원가입 한다 ---> 테이블에 레코드를 추가한다.
	# 1번회원에 'qwe' 아이디로 가입한다.
insert into member (mno, mid) values (1, "qwe");

# 4. 모든 회원들의 정보를 출력한다 --> 테이블내 모든 레코드를 출력한다.
select*from member;

# 5. 모든 회원들의 정보를 삭제한다. 제거한다. --> 테이블 내 모든 레코드를 제거한다. // delete
delete from member;
	# mysql workbench 에서 delete/update 기본적으로 사용 금지
    # 해제 : 메뉴 > edit > 

# 6. 회원 아이디 변경		--> 테이블내 레코드의 필드값 변경
update member set mid = 'asd';


