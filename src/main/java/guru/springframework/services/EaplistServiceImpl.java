package guru.springframework.services;

import guru.springframework.domain.Eaplist;
import guru.springframework.repositories.EaplistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EaplistServiceImpl implements EaplistService {
    private EaplistRepository eaplistRepository;

    @Autowired
    public void setEaplistRepository(EaplistRepository eaplistRepository) {
        this.eaplistRepository = eaplistRepository;
    }

    @Override
    public Iterable<Eaplist> listAllEaplists() {
        return eaplistRepository.findAll();
    }

   
}
