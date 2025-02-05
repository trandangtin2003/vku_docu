package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.dto.Form2Dto;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.KhachHangEntity;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.KhachHangService;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.LieuVacXinService;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.LoaiVacXinService;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.TiemChungService;

@Controller
@RequestMapping("/khachhang")
public class KhachHangController {
	private final KhachHangService khachHangService;
	private final LieuVacXinService lieuVacXinService;
	private final LoaiVacXinService loaiVacXinService;
	private final TiemChungService tiemChungService;

	@Autowired
	public KhachHangController(KhachHangService khachHangService, LieuVacXinService lieuVacXinService,
			LoaiVacXinService loaiVacXinService, TiemChungService tiemChungService) {
		this.khachHangService = khachHangService;
		this.lieuVacXinService = lieuVacXinService;
		this.loaiVacXinService = loaiVacXinService;
		this.tiemChungService = tiemChungService;
	}


//	@GetMapping("/form1")
//	public String Form1(Model model) {
//		model.addAttribute("dieu_huong", "form1");
//		return "index";
//	}
//
//	@PostMapping("/search1")
//	public String search1(@RequestParam("hoTen") String hoTen, Model model) {
//		List<SinhVienEntity> sinhVienList = sinhVienService.findByHoTen(hoTen);
//		model.addAttribute("sinhviens", sinhVienList);
//		model.addAttribute("dieu_huong", "form1");
//		return "index";
//	}
//	
	
	
	@GetMapping("/form2")
	public String Form2(Model model) {
		model.addAttribute("dieu_huong", "form2");
		return "index";
	}
	
//	cách 1
	
//	@PostMapping("/search2")
//    public String search2(@RequestParam("soDienThoai") String soDienThoai, Model model) {
//        List<Form2Dto> searchResults = khachHangService.searchBySDT(soDienThoai);
//        model.addAttribute("ketqua", searchResults);
//        System.out.println("form2 :"+ searchResults.toString());
//        model.addAttribute("dieu_huong", "form2");
//		return "index";
//    }
	
	@PostMapping("/search2")
    public String search2(@RequestParam("soDienThoai") String soDienThoai, Model model) {
        List<KhachHangEntity> searchResults = khachHangService.searchBysoDienThoai(soDienThoai);
        model.addAttribute("ketqua", searchResults);
        System.out.println("form2 :"+ searchResults.toString());
        model.addAttribute("dieu_huong", "form2");
		return "index";
    }
	
	
	
//	cách 2
//	@PostMapping("/search2")
//    public String search2(@RequestParam("soCMND") String soCMND, Model model) {
//        List<TotNghiepEntity> searchTotNghiep = totNghiepService.searchByCMND(soCMND);
//        List<CongViecEntity> searchCongViec = congViecService.searchByCMND(soCMND);
//        
//        model.addAttribute("ketquaTotNghiep", searchTotNghiep);
//        model.addAttribute("ketquaCongViec", searchCongViec);
//        model.addAttribute("dieu_huong", "form2");
//        
//        return "index";
//    }
}
