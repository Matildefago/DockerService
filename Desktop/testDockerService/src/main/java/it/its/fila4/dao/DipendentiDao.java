package it.its.fila4.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="dipendenti")
@Data

public class DipendentiDao implements Serializable{
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="cognome")
	private String cognome;
	
	@Column(name="taxCode")
	private String taxCode;
	
	@Column(name="indirizzo")
	private String indirizzo;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telefono")
	private String telefono;

	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="iso_nazione")
	private String iso_nazione;
	
	@Column(name="id_regione")
	private String id_regione;
	
	@Column(name="id_provincia")
	private String id_provincia;
	
	@Column(name="id_citta")
	private String id_citta;

}
