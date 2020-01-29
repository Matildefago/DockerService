package it.its.fila4.dto;

import java.util.List;

import it.its.fila4.dao.DipendentiDao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class DipendentiDto {
	private List<DipendentiDao> dipendentiData;

}
