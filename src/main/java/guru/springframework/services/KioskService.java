package guru.springframework.services;

import guru.springframework.domain.Kiosk;

public interface KioskService {
        Iterable<Kiosk> listAllKiosks();
        Kiosk getKioskById(Integer Id);
        Kiosk saveKiosk(Kiosk kiosk);   
}
