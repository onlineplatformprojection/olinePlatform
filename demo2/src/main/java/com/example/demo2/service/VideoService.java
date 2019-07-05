package com.example.demo2.service;

import com.example.demo2.model.Video;
import com.example.demo2.repository.VideoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VideoService {

	@Resource
	private VideoRepository videoRepository;

	//查询
	public List<Video> getVideoList(){
		return videoRepository.findAll();
	}

	public Video findVideoById(int id) {
		return videoRepository.findByVideoId(id);
	}

	public Video getVideoByVideoName(String videoName) {
		return videoRepository.findByVideoName(videoName);
	}

	public List<Video> getVideoByVideoNameLike(String videoName){
		return videoRepository.findByVideoNameLike(videoName);
	}

	//增加
	public void save(Video video) {
		videoRepository.save(video);
	}

	public void saveAll(List<Video> videos) {
		videoRepository.saveAll(videos);
	}

	//删除
	public void deleteVideo(Video video){
		videoRepository.delete(video);
	}

	public void deleteVideoById(int id){
		videoRepository.deleteById(id);
	}

	public void deleteVideoByName(String videoName){
		videoRepository.deleteVideoByVideoName(videoName);
	}

	public void deleteVideoByChapterId(int id){
		videoRepository.deleteByChapterId(id);
	}

	public List<Video> findAllVideoByChapterId(int chapterId){
		return videoRepository.findAllByChapterId(chapterId);
	}
}
