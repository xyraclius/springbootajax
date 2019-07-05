package com.belajar.springboot.service.impl;

import com.belajar.springboot.model.MahasiswaModel;
import com.belajar.springboot.repository.MahasiswaRepository;
import com.belajar.springboot.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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

    @Override
    public MahasiswaModel findByNim(UUID nim) {
        return mahasiswaRepository.findByNim(nim);
    }

    @Override
    public void delete(MahasiswaModel mahasiswaModel) {
        mahasiswaRepository.delete(mahasiswaModel);
    }
}
