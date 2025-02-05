package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.TotNghiepEntity;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.repository.TotNghiepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TotNghiepService {

    private final TotNghiepRepository totNghiepRepository;

    @Autowired
    public TotNghiepService(TotNghiepRepository totNghiepRepository) {
        this.totNghiepRepository = totNghiepRepository;
    }

    @Transactional
    public void save(TotNghiepEntity totNghiep) {
        totNghiepRepository.save(totNghiep);
    }

    // Thêm các phương thức service khác nếu cần
}
