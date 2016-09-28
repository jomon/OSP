package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import guru.springframework.domain.Browser;

@Repository
public interface BrowserRepository extends CrudRepository<Browser, Integer> {

}
