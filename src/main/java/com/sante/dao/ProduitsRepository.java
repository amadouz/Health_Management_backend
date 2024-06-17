package com.sante.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.sante.entites.Produits;


@Repository
public interface ProduitsRepository extends JpaRepository<Produits, Long> {

}
