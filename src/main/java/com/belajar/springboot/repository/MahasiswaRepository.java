package com.belajar.springboot.repository;

import com.belajar.springboot.model.MahasiswaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MahasiswaRepository extends JpaRepository<MahasiswaModel, UUID> {
    MahasiswaModel findByNim(UUID nim);
}