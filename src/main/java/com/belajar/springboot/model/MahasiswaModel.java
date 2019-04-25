package com.belajar.springboot.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name = "Mahasiswa")
public class MahasiswaModel {

	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@GeneratedValue(generator = "uuid")
	@Column(name = "NIM", nullable = false, length = 16)
	private UUID nim;

	@Column(name = "NAMA")
	private String nama;

	@Column(name = "JURUSAN")
	private String jurusan;
}
