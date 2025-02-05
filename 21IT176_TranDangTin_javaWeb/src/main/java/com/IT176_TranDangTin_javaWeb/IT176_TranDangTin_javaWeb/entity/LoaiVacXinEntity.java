package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "LOAIVACXIN")
public class LoaiVacXinEntity {
    @Id
    @Column(name = "MaLoaiVX", nullable = false)
    private String maLoaiVX;

    @Column(name = "TenLoaiVX", nullable = false)
    private String tenLoaiVX;

    @Column(name = "NuocSX")
    private String nuocSX;
    
    @Column(name = "SoNgayTiemNhac")
	private Integer soNgayTiemNhac;

    @OneToMany(mappedBy = "loaivacxin")
    private Set<LieuVacXinEntity> lieuVacXinEntities;

	public String getMaLoaiVX() {
		return maLoaiVX;
	}

	public void setMaLoaiVX(String maLoaiVX) {
		this.maLoaiVX = maLoaiVX;
	}

	public String getTenLoaiVX() {
		return tenLoaiVX;
	}

	public void setTenLoaiVX(String tenLoaiVX) {
		this.tenLoaiVX = tenLoaiVX;
	}

	public String getNuocSX() {
		return nuocSX;
	}

	public void setNuocSX(String nuocSX) {
		this.nuocSX = nuocSX;
	}

	public Integer getSoNgayTiemNhac() {
		return soNgayTiemNhac;
	}

	public void setSoNgayTiemNhac(Integer soNgayTiemNhac) {
		this.soNgayTiemNhac = soNgayTiemNhac;
	}

	public Set<LieuVacXinEntity> getLieuVacXinEntities() {
		return lieuVacXinEntities;
	}

	public void setLieuVacXinEntities(Set<LieuVacXinEntity> lieuVacXinEntities) {
		this.lieuVacXinEntities = lieuVacXinEntities;
	}

	@Override
	public String toString() {
		return "LoaiVacXinEntity [maLoaiVX=" + maLoaiVX + ", tenLoaiVX=" + tenLoaiVX + ", nuocSX=" + nuocSX
				+ ", soNgayTiemNhac=" + soNgayTiemNhac + ", lieuVacXinEntities=" + lieuVacXinEntities + "]";
	}
	
    
}
