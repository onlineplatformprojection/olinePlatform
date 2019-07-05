package com.example.demo2.service;

import com.example.demo2.model.Course;
import com.example.demo2.repository.CourseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Set;

@Service
public class CourseService {

    @Resource
    private CourseRepository courseRepository ;

    public List<Course> findAllCourse(){
        return courseRepository.findAll();
    }
    public Course findCourseById(Integer id){
        return courseRepository.findByCourseId(id) ;
    }

    public List<Course> listCourseByids(Set<Integer> ids){
        return courseRepository.findAllByCourseIdIn(ids) ;
    }

    public List<Course> findAllCourseLikeName(String courseName){
        return courseRepository.findByCourseNameLike("%" + courseName + "%");
    }


    public List<Course> findCourseRandom(){
        return courseRepository.findCoursesRandom();
    }

    public void updateCourseBuyNum(Course course){
        courseRepository.save(course);
    }




}
