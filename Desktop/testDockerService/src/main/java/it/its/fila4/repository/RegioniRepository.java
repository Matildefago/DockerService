package it.its.fila4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.its.fila4.dao.RegioniDao;


@Repository
public interface RegioniRepository extends JpaRepository<RegioniDao, Long> {

}
