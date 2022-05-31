drop table member cascade constraints;
drop table Score cascade constraints;
drop table Ranking cascade constraints;
create table member(
  ID varchar(20),
  pw varchar(15) not null,
  exp number(2),
 score number(4),
  constraint member_ID_pk primary key(ID)
);
create table score(
  ID varchar(20),
 TotalScore number(3),
 tutorialOne1 number(1),
 tutorialOne2 number(1),
 tutorialOne3 number(1),
  questionDateTwo1Score number(2),
  questionDateTwo2Score number(2),
  questionDateTwo3Score number(2),
  questionDateThree1Score number(2),
  questionDateThree2Score number(2),
  questionDateThree3Score number(2),
  questionDateFour1Score number(2),
  questionDateFour2Score number(2),
  questionDateFour3Score number(2),
  questionDateFive1Score number(2),
  questionDateFive2Score number(2),
  questionDateFive3Score number(2)
);
create table ranking(
  ID varchar(20) primary key,
  Ranking number(4),
  answerRate number(3) not null,
  constraint ranking_ID_fk FOREIGN KEY(ID) references member(ID)
);