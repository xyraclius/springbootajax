package com.belajar.springboot.service;

import java.util.List;

import com.belajar.springboot.model.MahasiswaModel;

public interface MahasiswaService {
	MahasiswaModel save(MahasiswaModel mahasiswaModel);
	
	List<MahasiswaModel> findAll();
}
