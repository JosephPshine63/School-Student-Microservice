package dev.pioruocco.entity;

import dev.pioruocco.dto.StudentDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class FullSchoolResponse {
    private String name;
    private String email;
    private List<StudentDto> students;
}
