package com.sante.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sante.entites.RendezVous;


@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {
    @Query(value = "Select * from rendez_vous where patient_id = ?1",nativeQuery = true)
	List<RendezVous> getByPatient(Long patientId);

    @Query(value = "Select * from rendez_vous where medecin_id = ?1", nativeQuery = true)
	List<RendezVous> getByMedecin(Long medecinId);

    @Query(value = "Select *  from rendez_vous where service_id = ?1", nativeQuery = true)
	List<RendezVous> getByIdService(Long serviceId);

    @Query(value = "Select * from rendez_vous where id = ?1", nativeQuery = true)
	RendezVous getById(Long rendezVousId);
    

}
