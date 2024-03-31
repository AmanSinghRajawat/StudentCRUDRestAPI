package com.student.StudentMgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.student.StudentMgmt.entity.Students;
import java.util.List;

public interface Repository extends JpaRepository<Students, Long> {

    
	// Below Method will return Single Student.
	// Students findStudentByName(String name);

	// Below Method will return List Of Students.

	List<Students> findStudentByName(String name);

}
