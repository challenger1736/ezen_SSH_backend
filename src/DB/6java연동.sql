#DAY 18 회원가입 게시판
# 1. 데이터베이스 생성
drop database if exists java;
create database java;
use java;

#2. 테이블 생성 (회원가입)
drop table if exists member;
create table member(
	mno int auto_increment,					-- 번호, mysql에서만 제공하는 제약조건(오라클 안됨) auto_increment (pk만 가능함)
    mid varchar(30) not null unique,		-- 아이디
    mpw varchar(30) not null,				-- 비밀번호
    mphone char(13) not null unique,		-- 전화번호
    mdate datetime default now(), 			-- 가입날짜.
    primary key(mno)						-- 번호가 식별키로 사용하겠다. (pk) not null, unique 안써도 되게 해줌.
);

#3. 확인용
select*from member;

#1.[c](insert)회원가입
 -- insert into 테이블명(필드명1, 필드명2, 필드명3) values(값1, 값2, 값3);
 insert into member(mid, mpw, mphone) values ('qweqweqwe', 'qweqweqwe', '010-0000-0000'); -- Ctrl +C 자바에 Ctrl +V
 
 delete from member;
 
 #2.[R](select) 아이디 중복체크/검사/비교
	#select*from member;
    #	 (where 조건식(필드명 = 값))
    #select mid from member where mid = ?;
    
#3.[R](select) 로그인 : 아이디와 비밀번호 비교
# select*from member where mid = 'a' and mpw = 'a';
# select*from member where mid = ? and mpw = ?;

#4.[R](select) 아이디에 해당하는 회원번호 확인
# select mno from member where mid = 'a'
