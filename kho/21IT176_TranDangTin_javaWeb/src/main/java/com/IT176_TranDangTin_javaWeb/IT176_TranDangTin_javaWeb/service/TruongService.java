package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.TruongEntity;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.repository.TruongRepository;

@Service
public class TruongService {

    private final TruongRepository truongRepository;

    @Autowired
    public TruongService(TruongRepository truongRepository) {
        this.truongRepository = truongRepository;
    }

    public List<TruongEntity> findAllTruongs() {
        return truongRepository.findAll();
    }

    // Thêm các phương thức service khác nếu cần
}
