package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.domain.KioskList;
@Repository
public interface KioskListRepository extends CrudRepository<KioskList, Integer> {

}
