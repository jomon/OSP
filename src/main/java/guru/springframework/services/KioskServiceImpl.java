package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import guru.springframework.domain.Kiosk;
import guru.springframework.repositories.KioskRepository;
@Service
public class KioskServiceImpl implements KioskService{
    
private KioskRepository kioskRepository;
   @Autowired
    public void setKioskRepository(KioskRepository kioskRepository) {
    this.kioskRepository = kioskRepository;
}

    @Override
    public Iterable<Kiosk> listAllKiosks() {
        // TODO Auto-generated method stub
        return kioskRepository.findAll();
    }

    @Override
    public Kiosk getKioskById(Integer Id) {
        // TODO Auto-generated method stub
        return kioskRepository.findOne(Id);
    }

    @Override
    public Kiosk saveKiosk(Kiosk kiosk) {
        // TODO Auto-generated method stub
        return kioskRepository.save(kiosk);
    }
    
}