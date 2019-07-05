package com.belajar.springboot.controller;

import com.belajar.springboot.model.MahasiswaModel;
import com.belajar.springboot.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class MahasiswaRestController {

    @Autowired
    private MahasiswaService mahasiswaService;

    @GetMapping("mahasiswa/rest")
    private MahasiswaModel getMahasiswaJson(@RequestParam UUID nim) {
        MahasiswaModel mahasiswaModel = new MahasiswaModel();
        mahasiswaModel.setNama("Nabil");
        mahasiswaModel.setJurusan("Sistem Informasi");
        return mahasiswaModel;
    }
}
