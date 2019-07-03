package com.example.demo2.service;

import com.example.demo2.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface VideoRepository extends JpaRepository<Video, Integer> {

	Video findById(int id);

	Video findByVideoName(String videoName);

	List<Video> findByVideoNameLike(String videoName);

	void deleteVideoByVideoName(String videoName);

	void deleteByChapterId(int chapterId);

}
