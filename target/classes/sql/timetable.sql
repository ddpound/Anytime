create table timetable(
	item_no number default 1,
	id varchar2(50) not null,
	semester number default 0,
	subject varchar2(30) not null,
	day varchar2(10) not null,
	start_time number not null,
	start_minute number not null,
	end_time number not null,
	end_minute number not null
);