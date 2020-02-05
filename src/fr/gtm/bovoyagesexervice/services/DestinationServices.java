package fr.gtm.bovoyagesexervice.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Singleton;

import fr.gtm.bovoyagesexervice.DAO.DestinationDAO;
import fr.gtm.bovoyagesexervice.DTO.DestinationDTO;
import fr.gtm.bovoyagesexervice.entities.DateVoyage;
import fr.gtm.bovoyagesexervice.entities.Destination;

@Singleton
public class DestinationServices {

	@EJB private DestinationDAO destinationdao ;
	
	public List<Destination> findAlldestinations(){
		
		return destinationdao.findAll();
		
	}

	public List<DateVoyage> getDatesByDestinationId(Long idDestination) {
		return destinationdao.getDateVoyage(idDestination);
	}
	
	public List<String> getImagesByDestinationId(long idDestination){
		return destinationdao.getImages(idDestination);
}	
//	public List<DestinationDTO> findAllDestinationDto() {
//		List<Destination> destinations = destinationdao.findAll();
//		List<DestinationDTO>  dtos = new ArrayList<DestinationDTO>();
//		for(Destination d : destinations) {
//			DestinationDTO dtodesti = new DestinationDTO(d);
//			if(d.getImages().size() != 0) {
//				dtodesti.setImages(d.getImages().get(0));
//			dtos.add(dtodesti);
//			}
//}
//		return dtos;
//}
}
