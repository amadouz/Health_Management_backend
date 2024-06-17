package com.sante.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sante.entites.ServicesSante;

@Repository
public interface ServicesSanteRepository extends JpaRepository<ServicesSante, Long> {

}
