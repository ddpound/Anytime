package com.anytime.root.individual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.anytime.root.individual.dto.Timetable;
import com.anytime.root.individual.repository.TimetableRepository;

import net.sf.json.JSONArray;

@Service
public class TimeTableServiceImpl implements TimetableService{
	
	private final TimetableRepository timetableRepository;
	@Autowired
	public TimeTableServiceImpl(TimetableRepository timetableRepository) {
		this.timetableRepository = timetableRepository;
	}

	@Override
	public void getTimetable(Model model, int selc, String id) {
		List<Timetable> list = timetableRepository.getTimetable(selc, id);
		//JSONArray jsonArray = new JSONArray();
		model.addAttribute("timetableList", JSONArray.fromObject(list));
	}
	
	@Override
	public void addTimetable(Timetable timetable) {
		int count = timetableRepository.countById(timetable.getId());
		if( count > 0) {
			timetable.setItemNo(timetableRepository.getItemNo(timetable.getId())+1);
		}else {
			timetable.setItemNo(1);
		}
		timetableRepository.add(timetable);
	}
	
	@Override
	public void modifyTimetable(Timetable timetable) {
		timetableRepository.modify(timetable);
		
	}

	@Override
	public void deleteTimetable(String id, int itemNo) {
		timetableRepository.delete(id, itemNo);
	}
	
}
