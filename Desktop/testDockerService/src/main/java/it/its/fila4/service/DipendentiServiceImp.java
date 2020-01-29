package it.its.fila4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.its.fila4.dao.DipendentiDao;
import it.its.fila4.repository.DipendentiRepository;

@Service
@Transactional
public class DipendentiServiceImp implements DipendentiService{
	@Autowired
	DipendentiRepository dipendentiRepository;

	@Override
	public List<DipendentiDao> SelTutti() {
		return dipendentiRepository.findAll();

	}

}
