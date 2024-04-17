package dev.pioruocco.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "school")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class School {

    @Id
    private Integer id;
    private String name;
    private String email;

}
