package guru.springframework.services;

import guru.springframework.domain.Wifi;

public interface WifiService {
	 Iterable<Wifi> listAllWifies();
	    Wifi getWifiById(Integer Id);
	Wifi savewifi(Wifi wifi);	
}

