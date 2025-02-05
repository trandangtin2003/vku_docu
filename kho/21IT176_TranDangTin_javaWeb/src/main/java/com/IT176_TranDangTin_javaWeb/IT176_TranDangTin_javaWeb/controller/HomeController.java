package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.TotNghiepEntity;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.NganhService;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.SinhVienService;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.TotNghiepService;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.TruongService;

@Controller
public class HomeController {

    private final TruongService truongService;
    private final NganhService nganhService;
    private final SinhVienService sinhVienService;
    private final TotNghiepService totNghiepService;

    @Autowired
    public HomeController(TruongService truongService, NganhService nganhService,SinhVienService sinhVienService,TotNghiepService totNghiepService) {
        this.truongService = truongService;
        this.nganhService = nganhService;
        this.sinhVienService = sinhVienService;
        this.totNghiepService = totNghiepService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("totNghiep", new TotNghiepEntity());
        model.addAttribute("truongs", truongService.findAllTruongs());
        model.addAttribute("nganhs", nganhService.findAllNganhs());
        model.addAttribute("dieu_huong", "form");
        return "index";
    }

   
}
