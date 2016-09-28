package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.domain.Authentication;
@Repository
public interface AuthenticationRepository extends CrudRepository<Authentication, Integer> {

}
