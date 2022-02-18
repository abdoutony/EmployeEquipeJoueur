package com.example.EquipeJoeurGroup.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EquipeJoeurGroup.entities.Joueur;

@Repository
public interface JoueurRepository extends JpaRepository<Joueur,Long> {
	
	   // ici on declare les requetes 
      public List<Joueur> findByNomContains(String nom);
}
