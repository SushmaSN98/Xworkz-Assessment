package com.xworkz.student;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.student.dao.StudentDAO;
import com.xworkz.student.dao.StudentDAOImpl;
import com.xworkz.student.dto.StudentDTO;
import com.xworkz.student.service.StudentService;
import com.xworkz.student.service.StudentServiceImpl;

public class StudentServiceTester {

	public static void main(String[] args) {
		List<StudentDTO> list = new ArrayList<StudentDTO>();

		StudentDAO dao = new StudentDAOImpl();
		StudentService studentService = new StudentServiceImpl();
		StudentDTO dto=new StudentDTO("Sushma","ElectronicsAndCommunication",9731221789l,60);
		
		
	    StudentService service=new StudentServiceImpl();
		service.validateAndSave(dto);
		
		service.validateAndUpdatePercentageByName(60, "Sushma");
		
		service.validateAndDeleteAll();
		
		service.validateAndAddMultipleStudentList(list);

		

		


	}

}
