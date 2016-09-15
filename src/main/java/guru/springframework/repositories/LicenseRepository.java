package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.domain.License;;
@Repository
public interface LicenseRepository extends CrudRepository<License, Integer> {

}
