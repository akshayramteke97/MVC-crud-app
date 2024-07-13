package in.akshay.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.akshay.bo.StudentBo;
import in.akshay.dao.IStudentDao;
import in.akshay.dto.StudentDto;
import in.akshay.vo.StudentVo;

@Service(value="studentservice")
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentDao dao;
	
	@Override
	public String serviceProcess(StudentDto dto) {
		StudentBo bo = new StudentBo();
		bo.setSname(dto.getSname());
		bo.setSaddrss(dto.getSaddrss());
		bo.setSage(dto.getSage());
		bo.setSdob(dto.getSdob());
		String result = dao.save(bo);
		
		return result;
	}

	

}
