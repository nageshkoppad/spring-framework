package www.search.places.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import www.search.places.entity.VisiteEntity;
import www.search.places.repository.VisiteRepository;
@Component
public class VisiteServiceImpl implements VisiteService {
@Autowired
	private VisiteRepository repo;
	@Override
	public boolean saveAndValidate(VisiteEntity entity) {
		
		return this.repo.save(entity);
	}
	@Override
	public Optional<List<VisiteEntity>> findByGod(String god) {
		
		return this.repo.findByGod(god);
	}
	

}
