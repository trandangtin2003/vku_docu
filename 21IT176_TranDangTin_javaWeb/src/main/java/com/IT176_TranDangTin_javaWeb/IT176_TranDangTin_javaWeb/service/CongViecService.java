//package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.CongViecEntity;
//import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.NganhEntity;
//import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.repository.CongViecRepository;
//
//@Service
//public class CongViecService {
//
//    private final CongViecRepository congViecRepository;
//
//    @Autowired
//    public CongViecService(CongViecRepository congViecRepository) {
//        this.congViecRepository = congViecRepository;
//    }
//
//  
//    @Transactional
//	public List<CongViecEntity> searchByCMND(String soCMND) {
//		// TODO Auto-generated method stub
//		return congViecRepository.getBysoCMND(soCMND);
//	}
//
//    // Thêm các phương thức service khác nếu cần
//}
