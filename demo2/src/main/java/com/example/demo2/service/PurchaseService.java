package com.example.demo2.service;

import com.example.demo2.model.Purchase;
import com.example.demo2.repository.PurchaseRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PurchaseService {

    @Resource
    private PurchaseRepository purchaseRepository;

    public List<Purchase> listByUserId(Long userId) {
        return purchaseRepository.findAllByUserIdOrderByPurDate(userId) ;
    }

    public Purchase findByUserIdAndCourseId(Long userId,Integer courseId){
        return purchaseRepository.findByUserIdAndCourseId(userId,courseId) ;
    }

    public void savePurchase(Purchase purchase){
        purchaseRepository.save(purchase);
    }

}
