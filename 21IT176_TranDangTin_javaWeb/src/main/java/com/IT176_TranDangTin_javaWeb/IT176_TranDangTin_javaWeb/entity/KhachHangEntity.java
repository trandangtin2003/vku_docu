package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "KHACHHANG")
public class KhachHangEntity {
    @Id
    @Column(name = "MaKH", nullable = false)
    private String maKH;

    @Column(name = "HoTen", nullable = false)
    private String hoTen;
    
    @Column(name = "NgaySinh")
    private java.sql.Date ngaySinh;
    
    @Column(name = "CMND", nullable = false)
    private Integer cMND;
    
    @Column(name = "SoDienThoai")
    private String soDienThoai;
    
    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "Email")
    private String email;


    @OneToMany(mappedBy = "khachhang")
    private Set<TiemChungEntity> tiemChungEntities;


	public String getMaKH() {
		return maKH;
	}


	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}


	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public java.sql.Date getNgaySinh() {
		return ngaySinh;
	}


	public void setNgaySinh(java.sql.Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}


	public Integer getcMND() {
		return cMND;
	}


	public void setcMND(Integer cMND) {
		this.cMND = cMND;
	}


	public String getSoDienThoai() {
		return soDienThoai;
	}


	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Set<TiemChungEntity> getTiemChungEntities() {
		return tiemChungEntities;
	}


	public void setTiemChungEntities(Set<TiemChungEntity> tiemChungEntities) {
		this.tiemChungEntities = tiemChungEntities;
	}

   

    // Getters và setters
    
}
