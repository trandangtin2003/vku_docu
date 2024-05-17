package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.LieuVacXinEntity;

@Repository
public interface LieuVacXinRepository extends JpaRepository<LieuVacXinEntity, String> {
    // Các phương thức cần thiết cho repository có thể được thêm vào đây
}
