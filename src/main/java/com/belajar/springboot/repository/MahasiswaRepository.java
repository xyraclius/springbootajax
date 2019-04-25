package com.belajar.springboot.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.springboot.model.MahasiswaModel;

public interface MahasiswaRepository extends JpaRepository<MahasiswaModel, UUID> {
	
	
	
}
