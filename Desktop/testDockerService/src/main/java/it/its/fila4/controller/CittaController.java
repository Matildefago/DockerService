package it.its.fila4.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.its.fila4.dao.CittaDao;
import it.its.fila4.dto.BaseResponseDto;
import it.its.fila4.dto.CittaDto;
import it.its.fila4.service.CittaService;

@RestController
@RequestMapping(value = "api/citta")

public class CittaController {
	@Autowired
	private CittaService cittaService;
//	private static final Logger Logger = LoggerFactory.getLogger(CittaController.class);

	@GetMapping(produces = "application/json")
	public BaseResponseDto<List<CittaDto>> fetchAll() {
		BaseResponseDto<List<CittaDto>> response = new BaseResponseDto<>();
//		Logger.info("*****Otteniamo tutte le promozioni*****");
		List<CittaDao> citta = cittaService.SelTutti();

		response.setTimestamp(new Date());	
		response.setStatus(HttpStatus.OK.value());
//		response.setMessage("SERVIZIO_ELABORATO_CORRETTAMENTE");

		if (citta.isEmpty()) {
			response.setResponse(null);
			return response;

		}
//		Logger.info("Numero dei record: " + citta.size());
		CittaDto dto = new CittaDto();
		dto.setCittaData(citta);
		response.setResponse(dto);
		return response;


	}

}
