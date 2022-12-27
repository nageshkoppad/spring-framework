package www.search.places.service;

import java.util.List;
import java.util.Optional;

import www.search.places.entity.VisiteEntity;

public interface VisiteService {
 boolean saveAndValidate(VisiteEntity entity);
 default Optional<List<VisiteEntity>> findByGod(String god){
	 return Optional.empty();
 }
}
