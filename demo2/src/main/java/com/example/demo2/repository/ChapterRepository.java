package com.example.demo2.repository;

import com.example.demo2.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ChapterRepository extends JpaRepository<Chapter, Integer> {

	Chapter findByChapterId(Integer id) ;

	Chapter findByChapterId(int id);

	List<Chapter> findAllByCourseId(Integer courseId) ;

}
