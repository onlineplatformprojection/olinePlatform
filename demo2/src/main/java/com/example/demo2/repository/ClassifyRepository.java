package com.example.demo2.repository;

import com.example.demo2.model.Classify;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassifyRepository extends JpaRepository<Classify, Integer> {

	List<Classify> findAll();

	Classify findByClassifyName(String name);

}
