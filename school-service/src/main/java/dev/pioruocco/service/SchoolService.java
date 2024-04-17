package dev.pioruocco.service;

import dev.pioruocco.client.StudentClient;
import dev.pioruocco.entity.FullSchoolResponse;
import dev.pioruocco.entity.School;
import dev.pioruocco.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository repository;
    private final StudentClient client;

    public School saveSchool(School school){
        return repository.save(school);
    }

    public List<School> findAllSchools(){
        return repository.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(int schoolId) {
        var school = repository.findById(schoolId).orElse(
                School.builder()
                        .name("NOT FOUND")
                        .email("NOT FOUND")
                        .build()
        );

        var students = client.findAllStudentsBySchool(schoolId);

        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
