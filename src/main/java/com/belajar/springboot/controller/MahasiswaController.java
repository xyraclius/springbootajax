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

    @GetMapping("mahasiswa/new")
    private String createNew(Model model) {
        model.addAttribute("mahasiswaModel", new MahasiswaModel());
        return "mahasiswa/form";
    }

    @GetMapping("mahasiswa/update")
    private String editMahasiswa(@RequestParam UUID nim, Model model) {
        MahasiswaModel mahasiswaModel = mahasiswaService.findByNim(nim);
        model.addAttribute("mahasiswaModel", mahasiswaModel);
        return "mahasiswa/form";
    }

    @PostMapping("mahasiswa/saveOrUpdate")
    private String saveOrUpdateMahasiswa(MahasiswaModel mahasiswaModel) {
        mahasiswaService.save(mahasiswaModel);
        return "redirect:/";
    }

    @GetMapping("mahasiswa/delete")
    private String deleteReportCategory(@RequestParam UUID nim) {
        MahasiswaModel mahasiswaModel = mahasiswaService.findByNim(nim);
        mahasiswaService.delete(mahasiswaModel);
        return "redirect:/";
    }
}
