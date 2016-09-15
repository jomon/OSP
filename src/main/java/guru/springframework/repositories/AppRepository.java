package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.domain.App;
@Repository
public interface AppRepository extends CrudRepository<App, Integer> {

}
