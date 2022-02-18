package com.example.EquipeJoeurGroup.entities;

import java.util.List;

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
public class Equipe {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	 private String country;
	 private String coach;
	 
	 @OneToMany(mappedBy="equipe")
	 private List<Joueur> players;
	 
	 @ManyToOne
	 @JoinColumn(name="groupId")
	 private Group group;
	 
	 
	 
}