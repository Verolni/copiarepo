package org.riwi.Spring_Workshop_Week_3.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@ToString
@Getter
@Setter
@Entity
@Table(name = "student")
public class StudentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "cc", nullable = false)
    private String cc;
    @Column(name = "emai", nullable = true)
    private String email;
    @Column(name = "address", nullable = true)
    private String address;
    @Column(name = "active", nullable = false)
    private boolean active;
    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<CourseEntity> courseEntityList;

}
