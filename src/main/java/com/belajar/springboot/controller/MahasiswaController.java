package com.belajar.springboot.controller;

import com.belajar.springboot.model.MahasiswaModel;
import com.belajar.springboot.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@Controller
public class MahasiswaController {

    @Autowired
    private MahasiswaService mahasiswaService;

    @GetMapping("/")
    private String home(Model model) {
        model.addAttribute("mahasiswaList", mahasiswaService.findAll());
        return "index";
    }

    @GetMapping("mahasiswa/create")
    private String createNew() {
        return "mahasiswa/create";
    }

    @GetMapping("mahasiswa/edit")
    private String editMahasiswa(@RequestParam UUID nim) {
        MahasiswaModel mahasiswaModel = mahasiswaService.findByNim(nim);
        return "mahasiswa/create";
    }

    @PostMapping(value = "mahasiswa/saveMahasiswa")
    private String saveMahasiswa(MahasiswaModel mahasiswaModel) {
        mahasiswaService.save(mahasiswaModel);
        return "redirect:../";
    }
}
