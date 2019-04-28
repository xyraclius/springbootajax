package com.belajar.springboot.service;

import com.belajar.springboot.model.MahasiswaModel;

import java.util.List;
import java.util.UUID;

public interface MahasiswaService {
	MahasiswaModel save(MahasiswaModel mahasiswaModel);
	
	List<MahasiswaModel> findAll();

	MahasiswaModel findByNim(UUID nim);
}
