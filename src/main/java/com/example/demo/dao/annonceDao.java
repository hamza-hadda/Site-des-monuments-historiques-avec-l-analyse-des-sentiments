package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.annonce;

public interface annonceDao extends JpaRepository<annonce, Long>{

}
