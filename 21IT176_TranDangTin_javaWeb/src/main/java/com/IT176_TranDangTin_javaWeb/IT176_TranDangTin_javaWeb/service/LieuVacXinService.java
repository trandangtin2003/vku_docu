package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.LieuVacXinEntity;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.repository.LieuVacXinRepository;

@Service
public class LieuVacXinService {

    private final LieuVacXinRepository lieuVacXinRepository;

    @Autowired
    public LieuVacXinService(LieuVacXinRepository lieuVacXinRepository) {
        this.lieuVacXinRepository = lieuVacXinRepository;
    }

    public List<LieuVacXinEntity> findAll() {
        return lieuVacXinRepository.findAll();
    }

    // Thêm các phương thức service khác nếu cần
}
