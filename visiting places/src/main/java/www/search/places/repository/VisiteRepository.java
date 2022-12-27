package www.search.places.repository;

import java.util.List;
import java.util.Optional;

import www.search.places.entity.VisiteEntity;

public interface VisiteRepository {
boolean save(VisiteEntity entity);
 default Optional<List<VisiteEntity>> findByGod(String god){
	  return Optional.empty();
  }
}
