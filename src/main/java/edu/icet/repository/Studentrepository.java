package edu.icet.repository;

import edu.icet.Dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepository extends JpaRepository<Student,Integer>{

}
