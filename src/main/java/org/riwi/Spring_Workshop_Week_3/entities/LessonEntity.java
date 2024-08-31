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
@Table(name = "lesson")
public class LessonEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(name= "name", nullable = false)
    private String name;
    @Column(name= "date", nullable = true)
    private String date;
    @Column(name= "duration", nullable = true)
    private String duration;
    @OneToMany(mappedBy = "lessonEntity")
    private List<MediaEntity> mediaEntities;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private CourseEntity courseEntity;


}
