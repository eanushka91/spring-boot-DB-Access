package edu.icet.controller;

import edu.icet.Dto.Student;
import edu.icet.Services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping
@RequiredArgsConstructor
public class StudentController {
    
    final StudentService service;

    @GetMapping
    public List<Student> getStudent(){
        List<Student> student = service.getStudent();
        return student;
    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public void  deleteStudentById(@PathVariable Integer id){
        service.deleteStudentById(id);
    }

    @PutMapping
    public void updateStudent(@RequestBody Student Student){
        service.addStudent(Student);
    }
}
