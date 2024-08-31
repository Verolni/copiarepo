package org.riwi.Spring_Workshop_Week_3.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ManyToAny;

import java.util.List;
@ToString
@Getter
@Setter
@Entity
@Table(name = "courses")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",nullable = false)
    private String name;
    @ManyToMany(mappedBy = "courseEntityList")
    private List<StudentEntity> studentEntityList;
    @OneToMany(mappedBy = "courseEntity")
    private List<LessonEntity> lessonEntityList;

}
