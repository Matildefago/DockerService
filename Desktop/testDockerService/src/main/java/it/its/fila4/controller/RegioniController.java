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

import it.its.fila4.dao.RegioniDao;
import it.its.fila4.dto.BaseResponseDto;
import it.its.fila4.dto.RegioniDto;
import it.its.fila4.service.RegioniService;

@RestController
@RequestMapping(value = "api/regioni")

public class RegioniController {
	@Autowired
	private RegioniService regioniService;
	private static final Logger Logger = LoggerFactory.getLogger(RegioniController.class);

	@GetMapping(produces = "application/json")
	public BaseResponseDto<List<RegioniDto>> fetchAll() {
		BaseResponseDto<List<RegioniDto>> response = new BaseResponseDto<>();
		Logger.info("*****Otteniamo tutte le promozioni*****");
		List<RegioniDao> regioni = regioniService.SelTutti();

		response.setTimestamp(new Date());
		response.setStatus(HttpStatus.OK.value());
		response.setMessage("SERVIZIO ELABORATO CORRETTAMENTE");

		if (regioni.isEmpty()) {
			response.setResponse(null);
			return response;

		}
		Logger.info("Numero dei record: " + regioni.size());
		RegioniDto dto = new RegioniDto();
		dto.setRegioniData(regioni);
		response.setResponse(dto);
		return response;


	}

}
