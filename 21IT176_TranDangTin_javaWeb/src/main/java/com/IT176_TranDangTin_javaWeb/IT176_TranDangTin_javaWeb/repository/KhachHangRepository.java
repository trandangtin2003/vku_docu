package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.KhachHangEntity;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHangEntity, String> {

	List<KhachHangEntity> getBysoDienThoai(String soDienThoai);

//	List<KhachHangEntity> findByHoTenContaining(String hoTen);
//
//	@Query("SELECT  kh.hoTen, kh.ngaySinh, kh.soDienThoai, kh.diaChi, tc.ngayTiem, tc.sucKhoeSauTiem, tc.danhGia "
//			+ "FROM KhachHangEntity kh " + "LEFT JOIN kh.tiemChungEntities tc "
//			+ "WHERE kh.soDienThoai LIKE %:soDienThoai%")
//	List<Object[]> searchBySDT(String soDienThoai);

//	@Query("SELECT  kh.hoTen, kh.ngaySinh, kh.soDienThoai, kh.diaChi, cv.tenCongTy, cv.thoiGianLamViec "
//			+ "FROM KhachHangEntity kh " + "LEFT JOIN kh.tiemChungEntities tc " + "LEFT JOIN tc.congViecEntities cv "
//			+ "WHERE kh.soDienThoai LIKE %:soDienThoai%")
//	List<Object[]> searchBySDT(String soDienThoai);
}
