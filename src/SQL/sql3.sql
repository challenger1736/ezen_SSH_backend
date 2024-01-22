/* 여러줄 주석 */
# 한줄 주석
-- 한줄 주석

# 코드 실행 : 번개(한번에 실행) or ctrl + enter

-- 1. 데이터베이스 : 데이터가 모여있는 공간 = 테이블을 여러개 저장할 수 있는 공간
drop database if exists test3; # 만일 test3 데이터베이스가 존재하면 삭제.
create database test3; 			# test3 데이터베이스를 생성하겠다.
use test3;						# test3 데이터베이스 사용.

-- 2. 테이블 : 행/열로 이루어진 표	# 테이블 간 관계 기능 => 관계형 데이터베이스 ]
drop table if exists member;	# 만일 'member' 테이블이 존재하면 삭제.


create table member(			# 'member' 테이블 생성 create table 테이블명 (필드명 타입)	
	mno int ,
    mid varchar(30) ,			# int는 01이 안되니까 인트는 절대 안됨 / char 고정길이( 필드의 저장할 문자의 길이가 절대적으로 고정 ) , varchar는 가변길이다보니 실제로 어떤 것을 찾거나 만들거나 할 때 속도가 조금 느릴수 있음.
    mphone char(13)	,	
    mname varchar(10) ,			-- 회원명 [ 최대 10글자 ]
	mphoneconfirm boolean ,      -- 또는 tinyint	광고문자전송여부 boolean true/false 1/0
    joindate datetime 			-- db(대소문자 구별) , 날짜 0000-00-00 0:00:00
    -- 마지막 필드뒤에 , 빼야함~
);

select*from member;				# 'member'테이블 검색

# ---------------------------------------------------------------------------------------------------------#
# 테이블 : 행/열 이루어진 데이터 집합
# 레코드 : 테이블 행 단위
# 필드 : 테이블 열(column) 단위

# 레코드 삽입(결국 필드의 값들이 들어가는 것) ( = insert into 테이블명 values(값1, 값2, 값3, 값4, 값5, 값6)) < 순서대로 값을 넣음
insert into member values (1, 'qwe', '010-0000-0000', '유재석' , false , '2024-01-22 16:07:01');

select*from member;				# 'member'테이블 검색

# 필드데이터의 제약 조건(검사 규칙)-------------------------------------------------------------------------------#
# 데이터 삽입/변경시 무결성을 위해서 하는 조건.
# 테이블 선언시 필드타입 뒤에서 작성하는 것.
-- 		 		create table 테이블명{
-- 		 			필드명1 타입 제약조건명,
-- 		 			필드명2 타입 제약조건명,
-- 		 			필드명3 타입 제약조건명,
-- 		 			필드명4 타입 제약조건명
--         };
-- 종류
-- 1. not null 		: 필드내에 null포함하지 않는다.
-- 2. default 값/함수 : 해당 필드의 기본값 설정.
-- 3. unique 	 	: 필드내 중복 된 값을 저장할 수 없다.
-- 4. primary key (pk필드명) : 해당 필드를 기본키로 사용.
-- 5. foreign key (fk필드명) references 참조할테이블명(참조할테이블의필드명 = 대부분 해당 테이블의 pk)

# 1. not null : 해당 필드에 null 포함하지 않는다.
drop table if exists member2;
create table member2(

	회원번호1 int,		# 1. not null			// 해당 필드에 null도 들어가도 된다.
	회원번호2 int not null		# 1. not null // 해당 필드에 null 포함하지 않는다.
);

#레코드 삽입
	# 1. insert into 테이블명 values(값1, 값2, 값3, 값4, 값5, 값6)
	# 2. insert into 테이블명(특정필드명, 특정필드명2) values(값1, 값2)
insert into member2 values(1,2);	-- 전체 필드의 값 대입시 회원번호1필드에 1대입, 회원번호2필드에 2대입
insert into member2(회원번호1) values(1);		-- 특정 필드에 값 대입시 필드명 명시/작성 // 회원번호 2 필드가 not null이기 때문에 오류가 난다.
insert into member2(회원번호2) values(2);		-- 특정 필드에 값 대입시 필드명 명시/작성 // 회원번호 1필드에 null 자동 대입, 회원번호 2필드에 2대입

# 테이블의 모든 레코드 확인
select*from member2;

# 2. default : 해당 필드의 기본값 설정
drop table if exists member3;
create table member3(
	회원번호1 int,
    회원번호2 int default 0,			# 2. default 값/함수
    국적 char(4) default '대한민국',	
    동의여부 boolean default true,	
    날짜 datetime default now()		# now() 함수는 현재날짜와 시간을 반환해주는 SQL함수
);

insert into member3 values();		# 레코드 삽입시 필드값 없으면 디폴드 값이 들어감
insert into member3 values(10,20,'일본',false, '2024-01-22 16:44:00' );		# 레코드 삽입시 필드값 있으면
select*from member3;

# 3. unique : 중복을 막는 역할, 중복된 값을 저장할 수 없다.(해당 필드)
drop table if exists member4;
create table member4(
	회원번호1 int,
    회원번호2 int unique					#3. unique : 중복된 값을 제거.
);

insert into member4 values(1,2);
select*from member4;

# 4. primary key(기본키로 사용할 필드명)
# 	1. 식별용 , 레코드를 고유하게 구분하기 위한 최소의 정보 ( = 식별 )

# 5. foreign key(외래키로 사용할 필드명)
#	1. 다른 테이블의 기본키 와 연결/참조된 정보. !! 다른 테이블과도 연결시킬수 있는게 신기하네 ! ( = 참조 )

# --------------------- 회원제 게시판 : 회원들이 글을 작성해서 저장하는 것 -------------------- #
# 계층 구조 : 우선 순위 < 회원(상위) / 그럼 게시판은 하위
# 테이블 1개 로는 중복이 많이 됨, 서로 다른 목적의 데이터들을 하나의 테이블로 작성시 이상현상(중복 / 불필요한정보 발생)이 많이 일어난다.
# 테이블 2개(정규화) : 동일한 목적의 데이터 끼리 테이블을 만들어서, 연결(pk-fk) 관계를 맺어서 관계형 데이터 베이스를 구축할 수 있다.

# 5-1 회원 테이블
	# 1. 회원번호/ 2. 아이디 / 3. 비밀번호 / 4. 이름
		# 필드별 타입 선정 - 제약 조건 -> ( primary key 식별키 : 중복X, 공백X, 레코드의 대표자 )
drop table if exists member5;

create table member5(
	mno int 		not null unique,		-- null 아니면서 중복없는 필드
    mip varchar(30) not null unique ,		-- not null 이면서 중복없는 필드
    mpw varchar(30) not null ,				-- not null
    mname varchar(20) default '익명',			-- 기본값 이름이 '익명' 하지만 값을 대입하면 그거에 맞게 바뀜.(insert into 테이블명 values (값들))
	primary key(mno)	-- 관례적으로 테이블 1개당 pk필드 1개 이상.!! , 오라클은 이렇게 지원함 mysql은 그냥 not null unique 뒤에 붙이기도 함.
);
# 5-2 게시판 테이블
	# 1. 게시물번호 / 2.게시물제목 / 3.게시물내용
    
drop table if exists board;
create table board(
	bno int				not null unique,
    btitle varchar(255) not null,
    bcontent longtext,
    primary key(bno), -- 댓글을 위해서! 사실 그런거 아니더라도 항상 pk필드는 1개이상 관례적으로 바로 지정하는 편.
    -- 참조 만들기. 게시물이 회원을 참조한다.
    mno_fk int,		-- 참조 테이블에 참조값을 저장할 필드 선정
    foreign key(mno_fk) references member5(mno)
    # foreign key(fk로 사용할 필드명) references 참조할 테이블명( 참조할 필드명 = 대부분 pk겠쥐)
	
);

