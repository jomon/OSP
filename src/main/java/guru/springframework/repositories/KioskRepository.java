package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import guru.springframework.domain.Kiosk;

public interface KioskRepository extends CrudRepository<Kiosk, Integer> {

}
