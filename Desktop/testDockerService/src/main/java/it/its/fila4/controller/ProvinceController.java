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

import it.its.fila4.dao.ProvinceDao;
import it.its.fila4.dto.BaseResponseDto;
import it.its.fila4.dto.ProvinceDto;
import it.its.fila4.service.ProvinceService;

@RestController
@RequestMapping(value = "api/province")

public class ProvinceController {
	@Autowired
	private ProvinceService provinceService;
	private static final Logger Logger = LoggerFactory.getLogger(ProvinceController.class);

	@GetMapping(produces = "application/json")
	public BaseResponseDto<List<ProvinceDto>> fetchAll() {
		BaseResponseDto<List<ProvinceDto>> response = new BaseResponseDto<>();
		Logger.info("*****Otteniamo tutte le promozioni*****");
		List<ProvinceDao> province = provinceService.SelTutti();

		response.setTimestamp(new Date());
		response.setStatus(HttpStatus.OK.value());
		response.setMessage("SERVIZIO ELABORATO CORRETTAMENTE");

		if (province.isEmpty()) {
			response.setResponse(null);
			return response;

		}
		Logger.info("Numero dei record: " + province.size());
		ProvinceDto dto = new ProvinceDto();
		dto.setProvinceData(province);
		response.setResponse(dto);
		return response;


	}

}
