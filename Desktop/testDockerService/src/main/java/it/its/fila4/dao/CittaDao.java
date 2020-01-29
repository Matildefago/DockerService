package it.its.fila4.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="citta")
@Data

public class CittaDao {

	@Id
	@Column(name="id")
	private String id;
	

	@Column(name="descrizione")
	private String descrizione;
	

	@Column(name="id_provincia")
	private String id_provincia;

}
