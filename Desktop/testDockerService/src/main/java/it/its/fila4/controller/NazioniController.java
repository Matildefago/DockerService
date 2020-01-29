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

import it.its.fila4.dao.NazioniDao;
import it.its.fila4.dto.BaseResponseDto;
import it.its.fila4.dto.NazioniDto;
import it.its.fila4.service.NazioniService;

@RestController
@RequestMapping(value = "api/nazioni")

public class NazioniController {
	@Autowired
	private NazioniService nazioniService;
	private static final Logger Logger = LoggerFactory.getLogger(NazioniController.class);

	@GetMapping(produces = "application/json")
	public BaseResponseDto<List<NazioniDto>> fetchAll() {
		BaseResponseDto<List<NazioniDto>> response = new BaseResponseDto<>();
		Logger.info("*****Otteniamo tutte le promozioni*****");
		List<NazioniDao> nazioni = nazioniService.SelTutti();

		response.setTimestamp(new Date());
		response.setStatus(HttpStatus.OK.value());
		response.setMessage("SERVIZIO ELABORATO CORRETTAMENTE");

		if (nazioni.isEmpty()) {
			response.setResponse(null);
			return response;

		}
		Logger.info("Numero dei record: " + nazioni.size());
		NazioniDto dto = new NazioniDto();
		dto.setNazioniData(nazioni);
		response.setResponse(dto);
		return response;


	}

}
