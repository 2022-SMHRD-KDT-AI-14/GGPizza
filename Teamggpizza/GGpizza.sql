drop table member cascade constraints;
create table member(
  ID varchar(12) not null,
  pw varchar(12) not null,
  nickname varchar(12) not null,
  money number(10),
  constraint member_ID_pk primary key(ID)
);

select * from MEMBER;


