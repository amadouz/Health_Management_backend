package com.sante.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.sante.entites.Parametres;

@Repository
public interface ParametresRepository extends JpaRepository<Parametres, Long> {

}
