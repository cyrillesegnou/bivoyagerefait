package fr.gtm.bovoyagesexervice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "destinations")
@NamedQueries({
	@NamedQuery (name = "Destination.findAll" ,
			query = "SELECT d FROM Destination d"),
})
@Data

public class Destination implements Serializable{

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pk_destination")
	private long id;
	private String region;
	private String description;

	
	@ElementCollection
	@CollectionTable(name="images",joinColumns= @JoinColumn(name="fk_destination"))
	@Column(name="image")
	private List<String> images;

	/** les dates de voyages ne connaissent pas les destinations
	 * 
	 * */
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn (name="fk_destination")
	private List<DateVoyage> datesVoyages;

	public Destination(long id, String region, String description ) {
		super();
		this.id = id;
		this.region = region;
		this.description = description;
	
		
	}
	
	public Destination () {
		
	}

	@Override
	public String toString() {
		return "Destination [id=" + id + ", region=" + region + ", description=" + description + ", images=" + images
				+ ", datesVoyage=" + datesVoyages + "]";
	}
}
