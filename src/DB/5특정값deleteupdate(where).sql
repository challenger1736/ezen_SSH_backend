/*

	SQL(Structured Query Language) : 데이터베이스에서 사용하는 데이터 처리 언어
		1.DDL(Data Definition Language) : 정의어 -- 되돌리기 불가능!(롤백 불가능)
			1.create : 데이터베이스/테이블 생성 (만들때 제약 조건을 생성함)
				1. 데이터베이스 생성
					create database 데이터베이스명;
                2. 테이블 생성
					create table table1( 필드명 타입 제약조건 , 필드명 타입 제약조건 , 필드명 타입 제약조건 , 관계제약조건(pk, fk));
            2.drop 	 : 데이터베이스/테이블 삭제
				1. 데이터베이스 삭제
					drop database if exists 데이터베이스명;
                2. 테이블 삭제
					drop table if exists 테이블명;
			3.use	 : 사용할 데이터베이스 선택
				- use 데이터베이스명;
			4.truncate : 데이터 삭제 - 문법적으로 ddl의 삭제 dml 의 삭제
            
        2.DML(Data Manipulation Language) : 조작어	-- 되돌리기 가능(롤백 가능)
			1.[C] insert : 레코드 삽입
				1-1. 모든 레코드 삽입							 : insert into 테이블명 values (값1, 값2, 값3); < 값들이 테이블 순서에 맞게
                1-2. 특정 레코드 삽입 							 : insert into 테이블명(필드명1, 필드명2, 필드명3) values (값1, 값2, 값3); < 값들이 해당 필드명 순서에 맞게
                
            2.[R] select : 레코드 검색
				2-1. 모든 필드(*)가 포함된 레코드 검색 				 : select*from 테이블명 <*가 와일드카드로써 모든 것을 보이는데 쓰임
                2-2. 특정 필드가 포함된 레코드 검색    				 : select 필드명1, 필드명2 from 테이블명;
                
            3.[U] update : 레코드 필드의 값을 수정
				3-1. 모든 레코드의 필드의 값을 수정					 : update 테이블명 set 수정할필드명 = 새로운값, 수정할필드명 = 새로운값
                3-2. 특정(조건에 충족하는) 레코드의 필드의 값을 수정	 : update 테이블명 set 수정할필드명 = 새로운값, 수정할필드명 = 새로운값 where 조건식
                
            4.[D] delete : 레코드 삭제
				4-1. 모든 레코드를 삭제							 : delete from 테이블명;
                4-2. 특정조건에 충족하는(true) 레코드를 삭제			 : delete from 테이블명 where 조건식;
            
		- 제약 조건
			1. not null
            2. unique
            3. default 값
            4. primary key(pk필드명)
            5. foreign key(fk필드명) references 참조할테이블명(참조할pk필드명) // 참조 키기에 무조건 누구를 참조(references)할지 정해야 함
         

*/

# 1. 데이터베이스 생성
drop database if exists test5;
create database test5;
use test5;	#1. db서버[서버pc]내 여러개의 데이터베이스가 존재하기 때문에 db선택해야한다.

show variables like 'datadir';

# 1. 테이블 생성
drop table if exists table1; # 관례적으로 미리 해놓는게 편하고, 후 처리 작업시 가능하다.
-- create table table1( 필드명 타입 제약조건 , 필드명 타입 제약조건 , 필드명 타입 제약조건 , 관계제약조건(pk, fk));
create table table1(
	데이터필드1 int,
    데이터필드2 varchar(30)
);

#[C] insert
insert into table1 values(1, '유재석');
insert into table1 ( 데이터필드1 )  values (5);	# 생략된 필드명의 값의 기본값은 null -> 기본 null 혹은 default (SQL의 기본은 int도 null)



#[R] insert
	# 1. 모든 필드*(와일드카드)를 표시하는 레코드 검색
select * from table1;
	# 2. 특정 필드를 표시하는 레코드 검색
select 데이터필드2 from table1;

#[U] update
	# 1. 모든 레코드의 필드 값을 수정
update table1 set 데이터필드2 = '강호동';
	# 2. 특정(조건에 충족하는) 레코드의 필드 값을 수정
update table1 set 데이터필드2 = '유재석' where 데이터필드1 = 1 ;

#[D] delete	
# (dml 이라 복구가 됨) / 추후에 취소 가능 / 특정(where) delete는 특정where을 쓰는 경우로 대부분 쓴다.
delete from table1;
	# 2. 특정(조건에 충족하는) 레코드 삭제
delete from table1 where 데이터필드1 = 5;
	# vs
    # 1. 테이블의 데이터 모두 삭제(ddl 이라 복구가 안됨) / 추후 취소 불가능
truncate table table1;

use test5;
drop table if exists members;
create table members(
	name varchar(30)
);



# 정의어는 여기서 하고(만들기) 실제 조작어는 자바에서 but test용 db

insert into members values('유재석');
insert into members values('강호동');
select*from members;
update members set name='신동엽(바꿀이름)' where name = '강호동';
delete from members where name ='신동엽';