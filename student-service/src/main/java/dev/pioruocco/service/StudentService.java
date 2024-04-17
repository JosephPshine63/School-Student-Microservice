package dev.pioruocco.service;

import dev.pioruocco.entity.Student;
import dev.pioruocco.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }


    public List<Student> findAllStudentsBySchool(int id) {
        return studentRepository.findAllBySchoolId(id);
    }
}
