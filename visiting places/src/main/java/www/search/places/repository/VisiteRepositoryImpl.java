package www.search.places.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import www.search.places.entity.VisiteEntity;
@Component
public class VisiteRepositoryImpl implements VisiteRepository {
    @Autowired
	private EntityManagerFactory factory;
	@Override
	public boolean save(VisiteEntity entity) {
		System.out.println("repository  method");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tra=manager.getTransaction();
		try {
			tra.begin();
			manager.persist(entity);
			tra.commit();
		}catch(Exception ex) {
			ex.printStackTrace();
			tra.rollback();
		}finally {
			manager.close();
		}
		return true;
	}
	@Override
	public Optional<List<VisiteEntity>> findByGod(String god) {
	       EntityManager manager=factory.createEntityManager();
	       try {
	    	   Query query=manager.createNamedQuery("findByGod");
	    	   query.setParameter("gd", god);
	    	   return Optional.ofNullable(query.getResultList());
	       }finally{
	    	   manager.close();
	       }
		
	}
	

}
