package fr.gtm.bovoyagesexervice.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Table(name = "dates_voyages")
@Data
public class DateVoyage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pk_date_voyage")
	private long id;
	@Column(name="date_depart")
	private LocalDate dateDepart;
	@Column(name="date_retour")
	private LocalDate dateRetour;
	private int prixHT;
	@Column(name="nb_places")
	private int nbPlace;
	
	@Transient
	private List<DateVoyage> datesVoyages = new ArrayList<>();
	
	
	public DateVoyage() {}
	
	public DateVoyage(LocalDate dateDepart, LocalDate dateRetour, int prixHT, int nbPlace) {

 
		this.dateDepart = dateDepart;
		this.dateRetour = dateRetour;
		this.prixHT = prixHT;
		this.nbPlace = nbPlace;
	}
	
	
}
