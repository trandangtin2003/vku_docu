package com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.KhachHangEntity;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.entity.TiemChungEntity;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.KhachHangService;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.LieuVacXinService;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.LoaiVacXinService;
import com.IT176_TranDangTin_javaWeb.IT176_TranDangTin_javaWeb.service.TiemChungService;

@Controller
@RequestMapping("/tiemchung")
public class TiemChungController {

	private final KhachHangService khachHangService;
	private final LieuVacXinService lieuVacXinService;
	private final LoaiVacXinService loaiVacXinService;
	private final TiemChungService tiemChungService;

	@Autowired
	public TiemChungController(KhachHangService khachHangService, LieuVacXinService lieuVacXinService,
			LoaiVacXinService loaiVacXinService, TiemChungService tiemChungService) {
		this.khachHangService = khachHangService;
		this.lieuVacXinService = lieuVacXinService;
		this.loaiVacXinService = loaiVacXinService;
		this.tiemChungService = tiemChungService;
	}

	@PostMapping
	public String handleTotNghiep(RedirectAttributes redirectAttributes,
			@ModelAttribute TiemChungEntity tiemChung, @RequestParam("maKH") String maKH,
			@RequestParam("hoTen") String hoTen, @RequestParam("cMND") Integer cMND) {
		KhachHangEntity khachHang = new KhachHangEntity();
		khachHang.setMaKH(maKH); // Gán giá trị soCMND
		khachHang.setHoTen(hoTen);
		khachHang.setcMND(cMND);

		khachHangService.save(khachHang);
		tiemChung.setKhachhang(khachHang);
		tiemChungService.save(tiemChung);
		redirectAttributes.addFlashAttribute("message", "Thông tin tim chủng đã được lưu thành công!");

		return "redirect:/";
	}

}
