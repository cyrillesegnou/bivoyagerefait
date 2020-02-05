package fr.gtm.bovoyagesexervice.DTO;

import java.util.List;

import fr.gtm.bovoyagesexervice.entities.DateVoyage;
import fr.gtm.bovoyagesexervice.entities.Destination;
import lombok.Data;

@Data

public class DestinationDTO {
	

	private long id;
	private String region;
	private String description;
	private List<String> images;
	private List<DateVoyage> datesVoyages;
	
	
	public DestinationDTO(Destination destination) {
	
		this.id = destination.getId();
		this.region = destination.getRegion();
		this.description = destination.getDescription();
		this.images = destination.getImages();
		this.datesVoyages = destination.getDatesVoyages();
	}


	public void setImages(String string) {
		// TODO Auto-generated method stub
		
	}
	}
