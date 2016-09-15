package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.domain.Device;
import guru.springframework.repositories.DeviceRepository;
@Service
public class DeviceServiceImpl implements DeviceService {
private DeviceRepository deviceRepository;
    
@Autowired
	public void setDeviceRepository(DeviceRepository deviceRepository) {
	this.deviceRepository = deviceRepository;
}

	@Override
	public Iterable<Device> listAllDevices() {
		// TODO Auto-generated method stub
		return deviceRepository.findAll();
	}

	@Override
	public Device getDeviceById(Integer Id) {
		// TODO Auto-generated method stub
		return deviceRepository.findOne(Id);
	}

	@Override
	public Device saveDevice(Device device) {
		// TODO Auto-generated method stub
		 return deviceRepository.save(device);
	}

}
