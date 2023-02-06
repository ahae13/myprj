package org.greenp.uiexam.controller;

import org.greenp.uiexam.mapper.IStudentMapper;
import org.greenp.uiexam.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class StudentController {
	
	@Autowired
	IStudentMapper mapper;
	
	@GetMapping("/")
	public @ResponseBody String root(){
		return "ui 평가";
	}
	
	@GetMapping("/main")
	public void mainPage() {
		
	}
	
	@GetMapping("/regForm")
	public void regForm() {
		log.info("regForm.......");
	}
	
	@PostMapping("/regist.do")
	public String registDo(StudentVO student) {
		
		mapper.update(student);
		
		return "success";
	}
	
	@GetMapping("/confirmForm")
	public void confirmForm() {
		
	}
	
	@PostMapping("/confirm.do")
	public @ResponseBody StudentVO confirmDo(StudentVO student) {
		
		StudentVO s = mapper.confirm(student);
		//StudentVO s = mapper.confirm(student.getSno(), student.getName());
		log.info("student : " + s);
		return s;
	}
	
	
}
