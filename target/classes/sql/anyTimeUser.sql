select *from ANYTIMEBOARD;
select *from ANYTIMEUSER;

create table ANYTIMEUSER(
id Number(4,2),
createdate Date default sysdate,
email varchar2(100) PRIMARY KEY,
auth varchar2(30),
Password varchar2(300),
rule varchar2(30), -- 유저인지, 관리자인지
username varchar2(100), -- 사용할 닉네임
age varchar2(30),
agegroup varchar2(30), --연령대
grade number(4,2),
enteryear varchar2(50), -- 입학년도
SCHOOL varchar2(300),
EXPIRATION_DATE date default sysdate -- 만기일(mapper파일에서 해결함 +3년)
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
-------------------------- 밑으로는 bookshop sql 문

create table ANYTIMEBOARD(
BOARDID NUMBER(4,0) PRIMARY KEY,
BOOKTITLE VARCHAR2(200 BYTE),
BOOKISBN VARCHAR2(100 BYTE),
WRITER VARCHAR2(100 BYTE), -- 작성자(email)
SCHOOL VARCHAR2(300 BYTE), -- 작성자 학교
UNDERLINE VARCHAR2(50 BYTE), -- 밑줄
HANDWRITE VARCHAR2(50 BYTE), -- 손글씨 유무
COVER VARCHAR2(50 BYTE), -- 책표지상태 
NAMEWRITE VARCHAR2(50 BYTE), -- 이름 쓰기상태
PAGE VARCHAR2(50 BYTE), -- 페이지 종이상태
MEANSOFTRANSACTION VARCHAR2(50 BYTE), -- 직거래 확인 유무
PRICE NUMBER,
PHOTO CLOB,
createdate Date default sysdate, 

CONSTRAINT fk_bookId FOREIGN KEY(WRITER)
         REFERENCES ANYTIMEUSER(email) ON DELETE CASCADE

);

drop table ANYTIMEBOARD;
commit;
