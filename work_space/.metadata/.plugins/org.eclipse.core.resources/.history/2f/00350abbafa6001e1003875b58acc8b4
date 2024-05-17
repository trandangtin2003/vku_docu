package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Nganh")
public class NganhEntity {
    @Id
    @Column(name = "MaNganh", nullable = false)
    private String maNganh;

    @Column(name = "TenNganh", nullable = false)
    private String tenNganh;

    @Column(name = "LoaiNganh")
    private String loaiNganh;

    @OneToMany(mappedBy = "nganh")
    private Set<TotNghiepEntity> totNghiepEntities;

    @OneToMany(mappedBy = "nganh")
    private Set<CongViecEntity> congViecEntities;

    // Getters và setters
    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public String getTenNganh() {
        return tenNganh;
    }

    public void setTenNganh(String tenNganh) {
        this.tenNganh = tenNganh;
    }

    public String getLoaiNganh() {
        return loaiNganh;
    }

    public void setLoaiNganh(String loaiNganh) {
        this.loaiNganh = loaiNganh;
    }

    public Set<TotNghiepEntity> getTotNghiepEntities() {
        return totNghiepEntities;
    }

    public void setTotNghiepEntities(Set<TotNghiepEntity> totNghiepEntities) {
        this.totNghiepEntities = totNghiepEntities;
    }

    public Set<CongViecEntity> getCongViecEntities() {
        return congViecEntities;
    }

    public void setCongViecEntities(Set<CongViecEntity> congViecEntities) {
        this.congViecEntities = congViecEntities;
    }
}
