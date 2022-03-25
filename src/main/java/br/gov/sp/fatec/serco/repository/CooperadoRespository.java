package br.gov.sp.fatec.serco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.serco.entity.Cooperados;

public interface CooperadoRespository extends JpaRepository<Long, Cooperados> {
    
}
