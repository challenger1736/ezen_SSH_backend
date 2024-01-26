use java;

drop table if exists category;
create table category( 
cno int auto_increment,
cname varchar(20) not null unique,
primary key(cno)
 );

drop table if exists board;
create table board(
cno int not null,
bno int  auto_increment,
mno int not null,
btitle varchar(30),
bcontents longtext,
bdate datetime default now(),
bview bigint default 0,
primary key(bno),
foreign key(cno) references category(cno),
foreign key(mno) references member(mno)
);

drop table if exists comment;
create table comment(
bno int not null,
cono int auto_increment,
mno int not null,
cocontents varchar(100),
primary key(cono),
foreign key(bno) references board(bno),
foreign key(mno) references member(mno)
);

select*from category;
select*from board;
select*from comment;