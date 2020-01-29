package it.its.fila4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.its.fila4.dao.ProvinceDao;
import it.its.fila4.repository.ProvinceRepository;


	@Service
	@Transactional
	public class ProviceServiceImp implements ProvinceService {
		@Autowired
		ProvinceRepository provinceRepository;
		 
		public List<ProvinceDao> SelTutti(){
			return provinceRepository.findAll();
			
		}
		

	}


