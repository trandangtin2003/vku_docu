package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.dto;

public class Form2Dto {
    private String soCMND;
    private String hoTen;
    private String maNganhTotNghiep;
    private String maTruongTotNghiep;
    private String maNganhCongTy;
    private String tenCongTy;
    private Integer thoiGianLamViec;

    // Constructors, Getters và Setters

    public Form2Dto() {
    }

    // Tạo constructor với tất cả các thuộc tính nếu cần
    public Form2Dto(String soCMND, String hoTen, String maNganhTotNghiep, String maTruongTotNghiep, String maNganhCongTy, String tenCongTy, Integer thoiGianLamViec) {
        this.soCMND = soCMND;
        this.hoTen = hoTen;
        this.maNganhTotNghiep = maNganhTotNghiep;
        this.maTruongTotNghiep = maTruongTotNghiep;
        this.maNganhCongTy = maNganhCongTy;
        this.tenCongTy = tenCongTy;
        this.thoiGianLamViec = thoiGianLamViec;
    }

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getMaNganhTotNghiep() {
	    return maNganhTotNghiep != null ? maNganhTotNghiep : "";
	}

	public void setMaNganhTotNghiep(String maNganhTotNghiep) {
		this.maNganhTotNghiep = maNganhTotNghiep;
	}

	public String getMaTruongTotNghiep() {
		return maTruongTotNghiep;
	}

	public void setMaTruongTotNghiep(String maTruongTotNghiep) {
		this.maTruongTotNghiep = maTruongTotNghiep;
	}
	

	public String getMaNganhCongTy() {
		return maNganhCongTy;
	}

	public void setMaNganhCongTy(String maNganhCongTy) {
		this.maNganhCongTy = maNganhCongTy;
	}

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public Integer getThoiGianLamViec() {
		return thoiGianLamViec;
	}

	public void setThoiGianLamViec(Integer thoiGianLamViec) {
		this.thoiGianLamViec = thoiGianLamViec;
	}
	

	@Override
	public String toString() {
		return "Form2Dto [soCMND=" + soCMND + ", hoTen=" + hoTen + ", maNganhTotNghiep=" + maNganhTotNghiep
				+ ", maTruongTotNghiep=" + maTruongTotNghiep + ", maNganhCongTy=" + maNganhCongTy + ", tenCongTy="
				+ tenCongTy + ", thoiGianLamViec=" + thoiGianLamViec + "]";
	}




}
