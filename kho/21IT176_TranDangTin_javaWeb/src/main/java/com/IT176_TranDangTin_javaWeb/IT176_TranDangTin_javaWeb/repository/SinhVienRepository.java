package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.dto.Form2Dto;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.SinhVienEntity;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVienEntity, String> {
	List<SinhVienEntity> findByHoTenContaining(String hoTen);

	@Query("SELECT sv.soCMND, sv.hoTen, tn.maNganh, tn.maTruong, cv.maNganh, cv.tenCongTy, cv.thoiGianLamViec "
			+ "FROM SinhVienEntity sv " + "LEFT JOIN sv.totNghiepEntities tn " + "LEFT JOIN sv.congViecEntities cv "
			+ "WHERE sv.hoTen LIKE %:hoTen%")
	List<Object[]> searchByHoTen(String hoTen);
}
