package guru.springframework.services;

import guru.springframework.domain.Device;

public interface DeviceService {
	Iterable<Device> listAllDevices();
	Device getDeviceById(Integer Id);
	Device saveDevice(Device device);
}
