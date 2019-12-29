package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.annonceDao;
import com.example.demo.entities.annonce;

@RestController
public class annonceService {
	
	@Autowired
	private annonceDao annoncedao;

	public annonceDao getAnnoncedao() {
		return annoncedao;
	}


	public void setAnnoncedao(annonceDao annoncedao) {
		this.annoncedao = annoncedao;
	}


	public annonceService() {
		// TODO Auto-generated constructor stub
	}
	
	
	@GetMapping("/")
	public String createAnnonce() {
		annonce an = new annonce("test", "test", "test");
		annoncedao.save(an);	
		return an.getTitle();
	}
	


}
