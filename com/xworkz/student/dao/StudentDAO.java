package com.xworkz.student.dao;

import java.util.List;
import com.xworkz.student.dto.StudentDTO;

public interface StudentDAO {
	
	boolean save(StudentDTO dto);
	boolean updatePercentageByName(double percentage,String name);
	void deleteAll();
	boolean addMultipleStudentList(List<StudentDTO> dto);
	
	

}
