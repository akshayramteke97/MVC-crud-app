package in.akshay.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.akshay.dto.StudentDto;
import in.akshay.service.IStudentService;
import in.akshay.vo.StudentVo;

@Component(value="controller")
public class MainController {
	
	@Autowired
	private IStudentService service;
	@Autowired
	private LocalDate date;
	
	public String processSave(StudentVo vo) {
		
		StudentDto dto = new StudentDto();
		dto.setSname(vo.getSname());
		dto.setSaddrss(vo.getSaddrss());
		dto.setSage(Integer.parseInt(vo.getSage()));
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		dto.setSdob(date.parse(vo.getSdob(), pattern));
	
		String result = service.serviceProcess(dto);
		
		return result;
		
	}
}
