package edu.icet.Services;

import edu.icet.Dto.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudent();
    void addStudent(Student student);

    void deleteStudentById(Integer id);
    void updateStudent(Student student);
}
