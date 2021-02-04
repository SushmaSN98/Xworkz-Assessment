package com.xworkz.student.service;

import java.util.List;
import com.xworkz.student.dao.StudentDAO;
import com.xworkz.student.dto.StudentDTO;

public interface StudentService {
	
	boolean validateAndSave(StudentDTO dto);
	
	boolean validateAndUpdatePercentageByName(double percentage,String name);
	
	void validateAndDeleteAll();
	
	boolean validateAndAddMultipleStudentList(List<StudentDTO> dto);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
