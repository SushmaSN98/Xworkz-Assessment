package com.xworkz.student.dao;

import java.util.Iterator;
import java.util.List;
import com.xworkz.student.dto.StudentDTO;

public class StudentDAOImpl implements StudentDAO {
	
    private List<StudentDTO> studentList;
    
    public StudentDAOImpl() {
    System.out.println("created StudentDAOImpl");
    this.studentList=studentList;
    }
	@Override
	public boolean save(StudentDTO dto) {
		System.out.println("invoked save ");
		boolean added=this.studentList.add(dto);
		System.out.println("added"+added);
		return added;
	}

	@Override
	public boolean updatePercentageByName(double percentage, String name) {
		System.out.println("invoked updatePercentageByName");
		System.out.println("Name"+name);
		System.out.println("Percentage"+percentage);
		for(StudentDTO studentDTO:this.studentList) {
			System.out.println("can update the percentage");
			studentDTO.setPercentage(percentage);
			return true;
		}{
			System.out.println("cannot update");
		}
		return false;
	}

	

	@Override
	public void deleteAll() {
		System.out.println("invoked deleteAll");
		Iterator<StudentDTO> iterator=studentList.iterator();
		while(iterator.hasNext()) {
			StudentDTO studentDTO=iterator.next();
			iterator.remove();
		}
	}
	@Override
	public boolean addMultipleStudentList(List<StudentDTO> dto) {
		if(dto!=null) {
		boolean added=dto.addAll(studentList);
		System.out.println("multiple data added"+added);
		System.out.println("dto");
		return true;
		
		}
		return false;
	}

	

}
