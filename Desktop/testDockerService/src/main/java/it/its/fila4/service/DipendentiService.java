package it.its.fila4.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.its.fila4.dao.DipendentiDao;

@Service
@Transactional
public interface DipendentiService {
 
	public List<DipendentiDao> SelTutti();
	

}
