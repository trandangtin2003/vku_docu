package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.TiemChungEntity;

@Repository
public interface TiemChungRepository extends JpaRepository<TiemChungEntity, String> {

//	List<TiemChungEntity> getByID(String soCMND);
}
