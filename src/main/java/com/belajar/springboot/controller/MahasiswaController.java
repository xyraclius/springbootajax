package com.belajar.springboot.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.belajar.springboot.model.MahasiswaModel;
import com.belajar.springboot.service.MahasiswaService;

@Controller
public class MahasiswaController {

	@Autowired
	private MahasiswaService mahasiwaService;

	@GetMapping("/")
	public String home() {
		List<MahasiswaModel> showAll = mahasiwaService.findAll();
		for(MahasiswaModel mahasiswaModel : showAll) {
		UUID nim = mahasiswaModel.getNim();
		System.out.println(nim);
		}
		return "index";
	}

	@GetMapping("mahasiswa/create")
	public String createNew(Model model) {
		return "mahasiswa/create";
	}

	@PostMapping(value = "mahasiswa/saveMahasiswa")
	private String saveMahasiswa(MahasiswaModel mahasiswaModel) {
		mahasiwaService.save(mahasiswaModel);
		return "redirect:../";
	}
}
