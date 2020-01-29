package it.its.fila4.dto;

import java.util.List;

import it.its.fila4.dao.ProvinceDao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProvinceDto {
	private List<ProvinceDao> provinceData;

}

