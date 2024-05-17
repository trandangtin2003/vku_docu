package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Truong")
public class TruongEntity {
    @Id
    @Column(name = "MaTruong", nullable = false)
    private String maTruong;

    @Column(name = "TenTruong", nullable = false)
    private String tenTruong;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "SoDT")
    private String soDT;

    @OneToMany(mappedBy = "truong")
    private Set<TotNghiepEntity> totNghiepEntities;

    // Getters và setters
    public String getMaTruong() {
        return maTruong;
    }

    public void setMaTruong(String maTruong) {
        this.maTruong = maTruong;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public Set<TotNghiepEntity> getTotNghiepEntities() {
        return totNghiepEntities;
    }

    public void setTotNghiepEntities(Set<TotNghiepEntity> totNghiepEntities) {
        this.totNghiepEntities = totNghiepEntities;
    }
}
