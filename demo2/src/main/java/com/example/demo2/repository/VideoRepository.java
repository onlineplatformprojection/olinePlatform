package com.example.demo2.repository;

import com.example.demo2.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface VideoRepository extends JpaRepository<Video, Integer> {

	Video findByVideoId(int id);

	List<Video> findAllByChapterId(int id);

	Video findByVideoName(String videoName);

	List<Video> findByVideoNameLike(String videoName);

	void deleteVideoByVideoName(String videoName);

	void deleteByChapterId(int chapterId);

}
