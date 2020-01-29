package it.its.fila4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.its.fila4.dao.DipendentiDao;

@Repository
public interface DipendentiRepository extends JpaRepository<DipendentiDao, Long>{


}
