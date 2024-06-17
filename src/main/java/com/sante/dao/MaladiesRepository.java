package com.sante.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sante.entites.Maladies;

@Repository
public interface MaladiesRepository extends JpaRepository<Maladies, Long> {
}
