package it.its.fila4.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.its.fila4.dao.DipendentiDao;
import it.its.fila4.dto.BaseResponseDto;
import it.its.fila4.dto.DipendentiDto;
import it.its.fila4.service.DipendentiService;

@RestController
@RequestMapping(value = "api/dipendenti")

public class DipendentiController {
	@Autowired
	private DipendentiService dipendentiService;
	private static final Logger Logger = LoggerFactory.getLogger(DipendentiController.class);

	@GetMapping(produces = "application/json")
	public BaseResponseDto<List<DipendentiDto>> fetchAll() {
		BaseResponseDto<List<DipendentiDto>> response = new BaseResponseDto<>();
		Logger.info("*****Otteniamo tutte le promozioni*****");
		List<DipendentiDao> dipendenti = dipendentiService.SelTutti();

		response.setTimestamp(new Date());
		response.setStatus(HttpStatus.OK.value());
		response.setMessage("SERVIZIO ELABORATO CORRETTAMENTE");

		if (dipendenti.isEmpty()) {
			response.setResponse(null);
			return response;

		}
		Logger.info("Numero dei record: " + dipendenti.size());
		DipendentiDto dto = new DipendentiDto();
		dto.setDipendentiData(dipendenti);
		response.setResponse(dto);
		return response;


	}

}
