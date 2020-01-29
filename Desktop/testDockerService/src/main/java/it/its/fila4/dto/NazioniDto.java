package it.its.fila4.dto;
import java.util.List;

import it.its.fila4.dao.NazioniDao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class NazioniDto {
	private List<NazioniDao> nazioniData;

}
