package com.example.EquipeJoeurGroup.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EquipeJoeurGroup.entities.Equipe;


@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Long> {
   
	
}
