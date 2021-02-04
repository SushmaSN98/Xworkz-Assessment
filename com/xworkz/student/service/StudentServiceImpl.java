package com.xworkz.student.service;

import java.util.Iterator;
import java.util.List;
import com.xworkz.student.dao.StudentDAO;
import com.xworkz.student.dto.StudentDTO;

public class StudentServiceImpl implements StudentService{
	
	private StudentDAO dao;
	private boolean validData;
	private StudentDAO studentDAO;
	
	public StudentServiceImpl() {
		System.out.println("created StudentServiceImpl");
		this.studentDAO=dao;
	}

	@Override
	public boolean validateAndSave(StudentDTO dto) {
		System.out.println("invoked validateAndSave");
		System.out.println("arg1"+dto);
		if(dto!=null) {
			System.out.println("dto is not null,its valid");
			String Name=dto.getName();
			
			if(Name!=null && Name.length()>=5 && !Name.isEmpty()) {
				System.out.println("Name is valid");
				validData=true;
				}
		else {
			System.out.println("dto is not valid");
			validData=false;
		}
		
			
		}
	
	
	
	if(validData) {
		String branch=dto.getBranch();
		if(branch!=null) {
			System.out.println("branch is valid");
			validData=true;
		}else {
			System.out.println("branch is not valid");
			validData=false;
		}
	}
	
	if(validData) {
		long phoneNumber=dto.getPhoneNumber();
		if(phoneNumber==10) {
			System.out.println("phoneNumber is valid");
			validData=true;
		}else {
			System.out.println("phoneNumber is not valid");
			validData=false;
		}
	}
	if(validData) {
		double percentage=dto.getPercentage();
		if(percentage<10) {
			System.out.println("Percentage is valid");
			validData=true;
		}else {
			System.out.println("percentage is not valid");
			validData=false;
		}
	}
	return validData;
	}
	

	@Override
	public boolean validateAndUpdatePercentageByName(double percentage, String name) {
		System.out.println("invoked validateAndUpdatePercentageByName");
		if(name!=null && name.length()<6 &&  !name.isEmpty() && !name.contains(" ")) {
		this.studentDAO.updatePercentageByName(percentage,name); 
		return true;
		}else {
		return false;
	}
	}

	@Override
	public void validateAndDeleteAll() {
		System.out.println("invoked validateDeleteAll");
		dao.deleteAll();
		
	}

	@Override
	public boolean validateAndAddMultipleStudentList(List<StudentDTO> dto) {
		System.out.println("invokedValidateAndMultipleStudentList");
		boolean valid=false;
		if(dto!=null && dto.size()>0) {
			int size=dto.size();
			int tempSize=0;
			this.validateAndAddMultipleStudentList(dto);
			return true;
		}else {
		return false;
	}

}
}
