package com.example.demo2.repository;

import com.example.demo2.model.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Set;



public interface CourseRepository extends JpaRepository<Course, Integer> {

	Course findByCourseId(Integer id) ;

	List<Course> findAllByCourseIdIn(Set<Integer> ids) ;

	List<Course> findByCourseNameLike(String courseName);

	//Page<course> findGoodCourse(PageRequest pageable);

	@Query(value = "select * from course order by RAND() limit 5", nativeQuery = true)
	List<Course> findCoursesRandom();

}
