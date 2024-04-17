package dev.pioruocco.controller;

import dev.pioruocco.entity.FullSchoolResponse;
import dev.pioruocco.entity.School;
import dev.pioruocco.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/rest-api/schools")
public class SchoolController {

    private final SchoolService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<School> saveSchool(@RequestBody School school){
        return new ResponseEntity<>(service.saveSchool(school), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<School>> getAllSchools(){
        return ResponseEntity.ok(service.findAllSchools());
    }

    @GetMapping(path = "/with-students/{schoolId}")
    public ResponseEntity<FullSchoolResponse> findAllScholsWithStudents(@PathVariable("schoolId") int id){
        return new ResponseEntity<>(
                service.findSchoolsWithStudents(id),
                HttpStatus.OK
        );
    }
}
