package it.its.fila4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.its.fila4.dao.CittaDao;
import it.its.fila4.repository.CittaRepository;


@Service
@Transactional
public class CittaServiceImp implements CittaService{
	
	@Autowired
	CittaRepository cittaRepository;
	
	@Override 
	public List<CittaDao> SelTutti(){
		return cittaRepository.findAll();
	}
	

}
