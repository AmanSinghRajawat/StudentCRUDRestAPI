package com.student.StudentMgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.StudentMgmt.entity.Students;

public interface Repository extends JpaRepository<Students, Long> {

}
