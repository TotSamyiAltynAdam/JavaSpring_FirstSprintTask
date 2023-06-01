package kz.springboot.firstSprintTask.db;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {
    private Long id;
    String name;
    String surname;
    int exam;
    String mark;

}
