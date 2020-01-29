package it.its.fila4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.its.fila4.dao.RegioniDao;
import it.its.fila4.repository.RegioniRepository;

@Service
@Transactional
public class RegioniServiceImp implements RegioniService {
	@Autowired
	RegioniRepository regioniRepository;
	
	@Override 
	public List<RegioniDao> SelTutti(){
		return regioniRepository.findAll();
		
	}
	

}