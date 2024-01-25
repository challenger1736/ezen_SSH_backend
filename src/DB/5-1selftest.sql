drop database if exists db1;
create database db1;
use db1;

drop table if exists table1;
create table table1(
	mno int not null unique,
	mname varchar(10),
	primary key(mno)
);

drop table if exists table2;
create table table2(
	champion varchar(15) not null unique,
	mno int not null,
	foreign key(mno) references table1(mno)
);

insert into table1 values (1, '신승호');
insert into table2(champion, mno) values ('루시안', 1);
delete from table2 where champion = '루시안';

select * from table1;
select * from table2;
select mno, mname from table1;

update table2 set champion ='징크스' where mno =1;

