create table anyTimeUser(
id number(4,2) ,
createDate Date default sysdate,
email varchar(100) primary Key, -- 카카오 이메일
auth varchar(30), -- 카카오 로그인시 카카오auth추가
password varchar(300),
rule varchar(30), -- admin, User 체크해야함
username varchar(100), -- 20자 넘지않기,카카오닉네임
age varchar(30),
ageGroup varchar(30),
grade number(4,2), -- 현재학년
enterYear varchar(50), --입학년도
school varchar(300),
expiration_date Date default sysdate -- 만기일
);

CREATE SEQUENCE Autoadd
  START WITH 1
  INCREMENT BY 1
  MAXVALUE 10000
  MINVALUE 1
  NOCYCLE;


select * from anyTimeUser;
drop table anyTimeUser;
insert into anyTimeUser values(Autoadd.NEXTVAL,sysdate,'aa','kakao','1234','user','hi','12','30~54',1,'22','가좌중학교',sysdate + (INTERVAL '3' YEAR));
delete from anyTimeUser where email = 'dpound@naver.com';

commit;
