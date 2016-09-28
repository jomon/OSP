package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import guru.springframework.domain.Wifi;
import guru.springframework.repositories.WifiRepository;
@Service
public class WifiServiceImpl implements WifiService{
	
private WifiRepository wifiRepository;
   @Autowired
	public void setWifiRepository(WifiRepository wifiRepository) {
	this.wifiRepository = wifiRepository;
}

	@Override
	public Iterable<Wifi> listAllWifies() {
		// TODO Auto-generated method stub
		return wifiRepository.findAll();
	}

	@Override
	public Wifi getWifiById(Integer Id) {
		// TODO Auto-generated method stub
		return wifiRepository.findOne(Id);
	}

	@Override
	public Wifi saveWifi(Wifi wifi) {
		// TODO Auto-generated method stub
		return wifiRepository.save(wifi);
	}
	
}