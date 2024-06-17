package com.sante.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.sante.entites.Professions;


@Repository
public interface ProfessionsRepository extends JpaRepository<Professions, Long> {

}
