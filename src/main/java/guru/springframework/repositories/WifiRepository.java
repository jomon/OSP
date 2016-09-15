package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import guru.springframework.domain.Wifi;
@Repository
public interface WifiRepository extends CrudRepository<Wifi, Integer> {

}
