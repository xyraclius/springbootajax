package com.belajar.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belajar.springboot.model.MahasiswaModel;
import com.belajar.springboot.repository.MahasiswaRepository;
import com.belajar.springboot.service.MahasiswaService;

@Service
public class MahasiswaServiceImpl implements MahasiswaService {

	@Autowired
	MahasiswaRepository mahasiswaRepository;

	@Override
	public MahasiswaModel save(MahasiswaModel mahasiswaModel) {
		return mahasiswaRepository.save(mahasiswaModel);
	}

	@Override
	public List<MahasiswaModel> findAll() {
		return mahasiswaRepository.findAll();
	}

}
