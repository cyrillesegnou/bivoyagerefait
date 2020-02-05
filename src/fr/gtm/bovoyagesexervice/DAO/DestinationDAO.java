package fr.gtm.bovoyagesexervice.DAO;


import java.util.List;

import javax.ejb.Singleton;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.gtm.bovoyagesexervice.entities.DateVoyage;
import fr.gtm.bovoyagesexervice.entities.Destination;

@Singleton
public class DestinationDAO extends AbstractDao<Destination, Long>{
	
	@PersistenceContext(name ="bovoyages") private EntityManager em;
	

	public DestinationDAO(Class<Destination> entityClass) {
		super(entityClass);
	}
	public DestinationDAO() {
		super(Destination.class);
	}
	
	public DestinationDAO(EntityManager em) {
		super(Destination.class);
		this.em = em;
	}
	
	
	public List<Destination> findAll(){
		
		return em.createNamedQuery("Destination.findAll", Destination.class)
				.getResultList();
		
	}
	
	public List<DateVoyage> getDateVoyage(Long idDestination) {
		Destination destinations = em.find(Destination.class, idDestination);
		destinations.getDatesVoyages().size();
		
		return destinations.getDatesVoyages();
		
		/**
		 * recuperationd des image en font tion de l'id destianation
		 */
	}
	public List<String> getImages (long idDestination) {
		
		Destination destinations = em.find(Destination.class, idDestination); 
		destinations.getImages().size();
		
		return destinations.getImages();
		
		
	}


//	public List<fr.gtm.bovoyagesexervice.entities.Destination> findAll() {
//		
//		return em.createNamedQuery("Destination.findAll", Destination.class)
//				.getResultList();
	//}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
		
		/**
		 * 
		 * recupération des dates de voyage pour chaque destinations
		 */
	}


}
