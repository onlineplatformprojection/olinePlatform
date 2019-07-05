package com.example.demo2.controller;

import com.example.demo2.model.Video;
import com.example.demo2.service.VideoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class VideoController {

	@Resource
	VideoService videoService;

	@RequestMapping("/video")
	public List<Video> video(@RequestParam("chapterId") int chapterId){
		return videoService.findAllVideoByChapterId(chapterId);
	}
}
