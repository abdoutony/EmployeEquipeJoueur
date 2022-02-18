package com.example.EquipeJoeurGroup.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.EquipeJoeurGroup.EquipeJoeurGroupApplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Joueur {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private  Long id;
	 private String nom;
	 private String prenom;
	 @ManyToOne
	 @JoinColumn(name="equipId")
	 private Equipe equipe;
}
