package com.anytime.root.individual.service;

import org.springframework.ui.Model;

import com.anytime.root.individual.dto.Timetable;

public interface TimetableService {
	public void getTimetable(Model model, int selc, String id);
	public void addTimetable(Timetable timetable);
	public void modifyTimetable(Timetable timetable);
	public void deleteTimetable(String id, int itemNo);
}
