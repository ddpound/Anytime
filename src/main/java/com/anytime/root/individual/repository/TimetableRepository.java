package com.anytime.root.individual.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.anytime.root.individual.dto.Timetable;

public interface TimetableRepository {
	public ArrayList<Timetable> getTimetable(@Param("selc") int selc, @Param("id") String id);
	public int countById(String id);
	public int getItemNo(String id);
	public void add(Timetable timetable);
	public void modify(Timetable timetable);
	public void delete(@Param("id") String id, @Param("itemNo") int itemNo);
}
