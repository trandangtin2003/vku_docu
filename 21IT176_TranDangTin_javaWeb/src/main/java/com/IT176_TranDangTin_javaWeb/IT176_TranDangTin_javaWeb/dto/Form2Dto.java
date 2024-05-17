package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.dto;

import java.sql.Date;

public class Form2Dto {

    private String hoTen;
    private Date ngaySinh;
    private String diaChi;
    private String soDienThoai;
//    private String tenLoaiVX;
    private Date ngayTiem;
    private String sucKhoeSauTiem;
    private String DanhGia;

    // Constructors, Getters và Setters

    public Form2Dto() {
    }

	public Form2Dto(String hoTen, Object ngaySinh, Object diaChi, Object soDienThoai, Object ngayTiem,
			Object sucKhoeSauTiem, Object danhGia) {
		this.hoTen = hoTen;
		this.ngaySinh = (Date) ngaySinh;
		this.diaChi = (String) diaChi;
		this.soDienThoai = (String) soDienThoai;
//		this.tenLoaiVX = tenLoaiVX;
		this.ngayTiem = (Date) ngayTiem;
		this.sucKhoeSauTiem = (String) sucKhoeSauTiem;
		DanhGia = (String) danhGia;
	}

	
	

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

//	public String getTenLoaiVX() {
//		return tenLoaiVX;
//	}
//
//	public void setTenLoaiVX(String tenLoaiVX) {
//		this.tenLoaiVX = tenLoaiVX;
//	}

	public Date getNgayTiem() {
		return ngayTiem;
	}

	public void setNgayTiem(Date ngayTiem) {
		this.ngayTiem = ngayTiem;
	}

	public String getSucKhoeSauTiem() {
		return sucKhoeSauTiem;
	}

	public void setSucKhoeSauTiem(String sucKhoeSauTiem) {
		this.sucKhoeSauTiem = sucKhoeSauTiem;
	}

	public String getDanhGia() {
		return DanhGia;
	}

	public void setDanhGia(String danhGia) {
		DanhGia = danhGia;
	}

	@Override
	public String toString() {
		return "Form2Dto [hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", soDienThoai="
				+ soDienThoai +  ", ngayTiem=" + ngayTiem + ", sucKhoeSauTiem="
				+ sucKhoeSauTiem + ", DanhGia=" + DanhGia + "]";
	}
    
    

	/*
	 * // Tạo constructor với tất cả các thuộc tính nếu cần public Form2Dto(String
	 * soCMND, String hoTen, String maNganhTotNghiep, String maTruongTotNghiep,
	 * String maNganhCongTy, String tenCongTy, Integer thoiGianLamViec) {
	 * this.soCMND = soCMND; this.hoTen = hoTen; this.maNganhTotNghiep =
	 * maNganhTotNghiep; this.maTruongTotNghiep = maTruongTotNghiep;
	 * this.maNganhCongTy = maNganhCongTy; this.tenCongTy = tenCongTy;
	 * this.thoiGianLamViec = thoiGianLamViec; }
	 * 
	 * public String getSoCMND() { return soCMND; }
	 * 
	 * public void setSoCMND(String soCMND) { this.soCMND = soCMND; }
	 * 
	 * public String getHoTen() { return hoTen; }
	 * 
	 * public void setHoTen(String hoTen) { this.hoTen = hoTen; }
	 * 
	 * public String getMaNganhTotNghiep() { return maNganhTotNghiep != null ?
	 * maNganhTotNghiep : ""; }
	 * 
	 * public void setMaNganhTotNghiep(String maNganhTotNghiep) {
	 * this.maNganhTotNghiep = maNganhTotNghiep; }
	 * 
	 * public String getMaTruongTotNghiep() { return maTruongTotNghiep; }
	 * 
	 * public void setMaTruongTotNghiep(String maTruongTotNghiep) {
	 * this.maTruongTotNghiep = maTruongTotNghiep; }
	 * 
	 * 
	 * public String getMaNganhCongTy() { return maNganhCongTy; }
	 * 
	 * public void setMaNganhCongTy(String maNganhCongTy) { this.maNganhCongTy =
	 * maNganhCongTy; }
	 * 
	 * public String getTenCongTy() { return tenCongTy; }
	 * 
	 * public void setTenCongTy(String tenCongTy) { this.tenCongTy = tenCongTy; }
	 * 
	 * public Integer getThoiGianLamViec() { return thoiGianLamViec; }
	 * 
	 * public void setThoiGianLamViec(Integer thoiGianLamViec) {
	 * this.thoiGianLamViec = thoiGianLamViec; }
	 * 
	 * 
	 * @Override public String toString() { return "Form2Dto [soCMND=" + soCMND +
	 * ", hoTen=" + hoTen + ", maNganhTotNghiep=" + maNganhTotNghiep +
	 * ", maTruongTotNghiep=" + maTruongTotNghiep + ", maNganhCongTy=" +
	 * maNganhCongTy + ", tenCongTy=" + tenCongTy + ", thoiGianLamViec=" +
	 * thoiGianLamViec + "]"; }
	 */
    



}
