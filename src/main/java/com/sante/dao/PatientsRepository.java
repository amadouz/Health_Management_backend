package com.sante.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.Patients;

@Repository
public interface PatientsRepository extends JpaRepository<Patients, Long> {

	@Query(value = "Select * from patients where compte_id = ?1", nativeQuery = true)
	public Patients affichePatient(Long compteId);

	@Query(value = "Select * from patients where compte_id = (Select id from utilisateurs where username = ?1)", nativeQuery = true)
	public Patients lePatient(String username);
	
	@Query(value = "select * from patients where id = ?1", nativeQuery = true)
	public Patients findByIdPatient(Long patientId);
	
}
