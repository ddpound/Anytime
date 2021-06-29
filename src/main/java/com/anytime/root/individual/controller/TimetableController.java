package com.anytime.root.individual.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.anytime.root.common.session.SessionName;
import com.anytime.root.individual.dto.Timetable;
import com.anytime.root.individual.service.TimetableService;

@Controller
public class TimetableController {
	
	private final TimetableService timetableService;
	@Autowired
	public TimetableController(TimetableService timetableService) {
		this.timetableService = timetableService;
	}
	
	@RequestMapping("timetable")
	public String timetableMain() {
		return "redirect:/timetable/0";
	}
	
	@RequestMapping("timetable/{selc}")
	public String timetable(Model model, HttpSession session,
			@PathVariable int selc) {
		String id = (String)session.getAttribute(SessionName.ID);
		timetableService.getTimetable(model, selc, id);
		return "timetable/timetable";
	}
	
	@PostMapping(value="timetable/add", produces = "application/json; charset=utf8")
	@ResponseBody
	public void addTimetable(Timetable timetable) {
		timetableService.addTimetable(timetable);
	}
	
	@PostMapping(value="timetable/modify", produces = "application/json; charset=utf8")
	@ResponseBody
	public void modify(Timetable timetable) {
		timetableService.modifyTimetable(timetable);
	}
	
	@PostMapping(value="timetable/delete/{id}/{itemNo}", produces = "application/json; charset=utf8")
	@ResponseBody
	public void deleteTimetable(@PathVariable String id, @PathVariable int itemNo) {
		timetableService.deleteTimetable(id, itemNo);
	}
	
}
