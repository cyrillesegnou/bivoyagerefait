package fr.gtm.bovoyagesexervice.DAO;

import javax.persistence.EntityManager;

import fr.gtm.bovoyagesexervice.entities.DateVoyage;

public class DateVoyageDAO extends AbstractDao<DateVoyage, Long>{

	public DateVoyageDAO(Class<DateVoyage> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
