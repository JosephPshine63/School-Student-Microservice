package dev.pioruocco.client;

import dev.pioruocco.dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentClient {
    @GetMapping(path = "/school/{school-id}")
    List<StudentDto> findAllStudentsBySchool(@PathVariable("school-id") int id);

}
