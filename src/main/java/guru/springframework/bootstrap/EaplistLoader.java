package guru.springframework.bootstrap;

import guru.springframework.domain.Eaplist;
import guru.springframework.repositories.EaplistRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class EaplistLoader implements ApplicationListener<ContextRefreshedEvent> {

    private EaplistRepository eaplistRepository;

    private Logger log = Logger.getLogger(EaplistLoader.class);

    @Autowired
    public void setEaplistRepository(EaplistRepository eaplistRepository) {
        this.eaplistRepository = eaplistRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Eaplist wep = new Eaplist();
        wep.setName("WEP");
        eaplistRepository.save(wep);

        log.info("Saved wep - id: " + wep.getId());

        Eaplist wap = new Eaplist();
        wap.setName("WAP");
        eaplistRepository.save(wap);

        log.info("Saved wap - id:" + wap.getId());
    }
}
