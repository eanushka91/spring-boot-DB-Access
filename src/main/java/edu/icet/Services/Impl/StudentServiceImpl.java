package edu.icet.Services.Impl;

import edu.icet.Dto.Student;
import edu.icet.Services.StudentService;
import edu.icet.controller.StudentController;
import edu.icet.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    Studentrepository repository;

    @Override
    public List<Student> getStudent(){
        List<Student> all = repository.findAll();
        return all;
    }

    @Override
    public void addStudent(Student student) {
        repository.save(student);
    }

    @Override
    public void deleteStudentById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateStudent(Student student) {
        repository.save(student);
    }
}
