package it.its.fila4.dto;

	import java.util.List;

import it.its.fila4.dao.CittaDao;
import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Builder
	@Data
	@NoArgsConstructor
	@AllArgsConstructor

	public class CittaDto {
		private List<CittaDao> cittaData;

	}


