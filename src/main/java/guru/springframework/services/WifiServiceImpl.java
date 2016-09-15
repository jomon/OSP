package guru.springframework.services;

import org.springframework.stereotype.Service;

import guru.springframework.domain.Wifi;
import guru.springframework.repositories.WifiRepository;
@Service
public class WifiServiceImpl implements WifiService{
private WifiRepository wifiRepository;
	@Override
	public Iterable<Wifi> listAllWifies() {
		// TODO Auto-generated method stub
		return wifiRepository.findAll();
	}

	@Override
	public Wifi getWifiById(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Wifi savewifi(Wifi wifi) {
		// TODO Auto-generated method stub
		return null;
	}
	
}