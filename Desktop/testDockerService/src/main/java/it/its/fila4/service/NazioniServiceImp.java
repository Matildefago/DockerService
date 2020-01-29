package it.its.fila4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.its.fila4.dao.NazioniDao;
import it.its.fila4.repository.NazioniRepository;

@Service
@Transactional
public class NazioniServiceImp implements NazioniService {
	@Autowired
	NazioniRepository nazioniRepository;
	
	@Override 
	public List<NazioniDao> SelTutti(){
		return nazioniRepository.findAll();
		
	}
	

}
