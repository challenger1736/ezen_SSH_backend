# 1. 데이터베이스 생성
drop database if exists test6;
create database test6;
use test6;

# 2. 테이블 생성
	# 회원제 카테고리 게시물 댓글. 댓글 기능.
    # 1. 저장할 데이터들을 설정
    # 2. 관심사 끼리 묶어서 데이터들을 테이블 설계
    # 3. 관계 설정(PK, FK)
    # 필드 중복 1개 코드증가, db메모리증가 (중복필드 많으면 코드는 편해지지만 db메모리 증가 )
    #1대 다 1(pk) 다(fk) 		*테이블당 PK필드 1개 이상 권장
		# PK : 식별키/기본키 중복없고(unique) +  NOT NULL(not null) => primary key
			# 1. auto_increment DB자동번호 2. 직접 정의한다(아이디)
		# FK : 외래키 PK필드와 연결된 필드
			# 중복 가능. NULL 가능
            
	#4. 제약조건
		# 모든 테이블에는 primary key 사용한다.
        # foregin key 작성하는 테이블은 (1:m) M테이블에 작성한다
	
    # 5. 관계 테이블ㅇ
		# 생성시 : create는 부모테이블(상위테이블)부터 생성
        # 삭제시 : drop 하위 테이블 먼저 삭제
/*
	제약조건
	1. not null
    2. unique
    3. default 값/함수()
    4. primary key(pk필드명)
    5. foreign key(fk필드명) references 참조테이블명(참조할pk필드명)
    6. (mysql) auto_increment
		* pk일때만 가능
*/

create table member(
	mno int auto_increment,
    mid varchar(10),
    mpw varchar(10),
    primary key(mno)
);
create table bcategory(
	bcno int auto_increment,
    bcname varchar(19),
    primary key(bcno)
);
create table board(
	bno int auto_increment,
    btitle text,
    bcontent text,
    
    mno int,
    bcno_fk int,
    
    primary key(bno),
    foreign key(mno) references member(mno), -- 회원테이블과 참조
    foreign key(bcon_fk) references bcategory(bcno) -- 카테고리 테이블과 참조
);
create table reply(
	rno int auto_increment,
    btitle text,
    rcontent text,
    primary key(rno),
    
    bno_fk int,
    
	primary key(rno),
    foreign key(bno_fk) references bcategory(bno) -- 게시판 참조
);