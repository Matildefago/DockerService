package it.its.fila4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.its.fila4.dao.ProvinceDao;

@Repository
public interface ProvinceRepository extends JpaRepository<ProvinceDao, Long> {

}
