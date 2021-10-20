package com.project.controller;

import com.project.model.Student;
import com.project.service.StudentService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;


    /**
     * @param id
     * @return
     */
    @GetMapping("/get_by_id")
    public ResponseEntity<Student> getStudentsByLabel(@RequestParam(name = "id") @NotNull final Long id) {

        return ResponseEntity.ok(studentService.getById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAll() {
        return ResponseEntity.ok(studentService.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<Student> saveStudents(@RequestBody @NotNull final Student student) {
        return ResponseEntity.ok(studentService.save(student));
    }


    @DeleteMapping("/delete")
    public void deleteStudents(@RequestParam(name = "id") @NotNull final Long id) {
        studentService.deleteStudent(id);
    }
}
