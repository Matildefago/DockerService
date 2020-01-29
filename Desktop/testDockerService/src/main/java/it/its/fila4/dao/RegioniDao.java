package it.its.fila4.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="regioni")
@Data
public class RegioniDao {
	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="descrizione")
	private String descrizione;
	
	@Column(name="id_nazione")
	private String id_nazione;

}
