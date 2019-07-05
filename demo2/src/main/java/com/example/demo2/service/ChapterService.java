package com.example.demo2.service;

import com.example.demo2.model.Chapter;
import com.example.demo2.repository.ChapterRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChapterService {

    @Resource
    private ChapterRepository chapterRepository ;

    public List<Chapter> listByCourseId(Integer courseId) {
        return chapterRepository.findAllByCourseId(courseId) ;
    }
    public Chapter findChapterById(Integer id){
        return chapterRepository.findByChapterId(id) ;
    }
    public List<Chapter> findChapterByCourseId(int id){
        return chapterRepository.findAllByCourseId(id);
    }
}
