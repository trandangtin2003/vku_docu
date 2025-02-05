package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "LIEUVACXIN")
public class LieuVacXinEntity {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaLieuVX", nullable = false)
	private String maLieuVX;

	@Column(name = "SoLo")
	private Integer soLo;

	@Column(name = "MaLoaiVX")
	private String maLoaiVX;

	@Column(name = "NgaySanXuat", nullable = false)
	private java.sql.Date ngaySanXuat;

	@Column(name = "NgayNhap", nullable = false)
	private java.sql.Date ngayNhap;

	@Column(name = "NgayHetHan", nullable = false)
	private java.sql.Date ngayHetHan;

	@OneToMany(mappedBy = "lieuvacxin")
	private Set<TiemChungEntity> tiemChungEntities;

	@ManyToOne
	@JoinColumn(name = "MaLoaiVX", referencedColumnName = "MaLoaiVX", insertable = false, updatable = false)
	private LoaiVacXinEntity loaivacxin;

	public String getMaLieuVX() {
		return maLieuVX;
	}

	public void setMaLieuVX(String maLieuVX) {
		this.maLieuVX = maLieuVX;
	}

	public Integer getSoLo() {
		return soLo;
	}

	public void setSoLo(Integer soLo) {
		this.soLo = soLo;
	}

	public String getMaLoaiVX() {
		return maLoaiVX;
	}

	public void setMaLoaiVX(String maLoaiVX) {
		this.maLoaiVX = maLoaiVX;
	}

	public java.sql.Date getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(java.sql.Date ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public java.sql.Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(java.sql.Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public java.sql.Date getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(java.sql.Date ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	public Set<TiemChungEntity> getTiemChungEntities() {
		return tiemChungEntities;
	}

	public void setTiemChungEntities(Set<TiemChungEntity> tiemChungEntities) {
		this.tiemChungEntities = tiemChungEntities;
	}

	public LoaiVacXinEntity getLoaivacxin() {
		return loaivacxin;
	}

	public void setLoaivacxin(LoaiVacXinEntity loaivacxin) {
		this.loaivacxin = loaivacxin;
	}
	

}
