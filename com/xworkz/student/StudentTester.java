package com.xworkz.student;


import com.xworkz.student.dao.StudentDAO;
import com.xworkz.student.dao.StudentDAOImpl;
import com.xworkz.student.dto.StudentDTO;

public class StudentTester {

	public static void main(String[] args) {

		StudentDTO studentDTO=new StudentDTO();
		studentDTO.setName("Sonal");
		studentDTO.setBranch("Civil");
		studentDTO.setPhoneNumber(9731221789l);
		studentDTO.setPercentage(60);
		
		StudentDAO dao=new StudentDAOImpl();
		dao.save(studentDTO);
		
		
		
		

	}

}
