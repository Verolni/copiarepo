package org.riwi.Spring_Workshop_Week_3.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.riwi.Spring_Workshop_Week_3.Enum.MediaType;

import java.util.List;
@ToString
@Getter
@Setter
@Entity
public class MediaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;
    @Enumerated(EnumType.STRING)
    @Column(name = "media_type", nullable = false)
    private MediaType mediaType;
    @ManyToOne
    @JoinColumn(name = "lesson_id")
   private LessonEntity lessonEntity;

}
