package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.TiemChungEntity;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.KhachHangService;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.LieuVacXinService;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.LoaiVacXinService;

@Controller
public class HomeController {

    private final KhachHangService khachHangService;
    private final LieuVacXinService lieuVacXinService;
    private final LoaiVacXinService loaiVacXinService;
//    private final TiemChungService tiemChungService;

    @Autowired
    public HomeController(KhachHangService khachHangService, LieuVacXinService lieuVacXinService,LoaiVacXinService loaiVacXinService) {
        this.khachHangService = khachHangService;
        this.lieuVacXinService = lieuVacXinService;
        this.loaiVacXinService = loaiVacXinService;
//        this.tiemChungService = tiemChungService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("tiemChung", new TiemChungEntity());
       
        System.out.println("loại vacxin "+loaiVacXinService.findAll().toString());
        model.addAttribute("vacxins", lieuVacXinService.findAll());
        model.addAttribute("loaivacxins", loaiVacXinService.findAll());
        model.addAttribute("dieu_huong", "form");
        return "index";
    }

   
}
