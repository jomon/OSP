package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.domain.Configuration;
@Repository
public interface ConfigurationRepository extends CrudRepository<Configuration, Integer> {

}
