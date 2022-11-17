package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.student.entity.Student;

@Repository
@Transactional
public interface IStudentRepository extends JpaRepository<Student, Integer> {

}
