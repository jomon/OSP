package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.domain.Device;
@Repository
public interface DeviceRepository extends CrudRepository<Device, Integer> {

}
