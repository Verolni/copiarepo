package org.riwi.Spring_Workshop_Week_3.service.ImplementationServices;

import org.riwi.Spring_Workshop_Week_3.dtos.Request.CourseRequestDTO;
import org.riwi.Spring_Workshop_Week_3.dtos.Response.CourseResponseDTO;
import org.riwi.Spring_Workshop_Week_3.repository.Interfaces.ClassRepository;
import org.riwi.Spring_Workshop_Week_3.service.InterfacesPerEntity.InterfaceCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements InterfaceCourseService {
    @Autowired

    private ClassRepository classRepository;

    @Override
    public Page<CourseResponseDTO> getCoursesPaginated(int page, int size ) {
        Pageable pageable = (Pageable) PageRequest.of(page, size);
        Page<CourseResponseDTO> CoursesPage = ClassRepository.
        return coursePage.map(this::convertToResponseDTO);
    }

    @Override
    public Page<CourseResponseDTO> searchCourses (String keyword, int page, int size){
        Pageable pageable = PageRequest.of(page, size);
        List<CourseResponseDTO> Courses = classRepository.searchByKeyword(keyword);
        return  courses.stream().map(this::convertToResponseDTO).collect(Collectors.collectingAndThen(Collectors.toList(), list -> new PageImpl<>(list, pageable, list.size()));
    }

    @Override
    public CourseResponseDTO createCourse(CourseRequestDTO requestDTO) {
        Course course = new Course();
        course.setName(requestDTO.getName());
        course.setDescription(requestDTO.getDescription());
        Course savedCourse = classRepository.save(course);
        return convertToResponseDTO(savedCourse);

    }
    @Override
    public  CourseResponseDTO updateCourse(Long id, CourseRequestDTO requestDTO){
        Course course = classRepository.findById(id).orElseThrow(()-> new RuntimeException("Course not found "));
        course.setName(requestDTO.getName());
        course.setDescription(requestDTO.getDescription());
        Course updateCourse = classRepository.save(course);
        return convertToResponseDTO(updateCourse);
    }

    private CourseResponseDTO convertToResponseDTO (Course course){
        CourseResponseDTO dto = new CourseResponseDTO();
        dto.setId(course.getId());
        dto.setName(course.getNName());
        dto.setDescription((course.getDescription());
        return dto;

    }


}
