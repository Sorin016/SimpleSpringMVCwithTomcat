package entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sudents")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Name;

    public Student() {}

    public Student(String name, String lastName, String email) {
        Name = name;
        LastName = lastName;
        Email = email;
    }

    private String LastName;
    private String Email;
}
