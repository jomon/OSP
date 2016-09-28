package guru.springframework.bootstrap;

import guru.springframework.domain.KioskList;
import guru.springframework.repositories.KioskListRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class KioskListLoader implements ApplicationListener<ContextRefreshedEvent> {

    private KioskListRepository kioskListRepository;

    private Logger log = Logger.getLogger(KioskListLoader.class);

    @Autowired
    public void setKioskListRepository(KioskListRepository kioskListRepository) {
        this.kioskListRepository = kioskListRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        KioskList single = new KioskList();
        single.setName("SINGLE APP KIOSK");
        kioskListRepository.save(single);

        log.info("Saved single - id: " + single.getId());

        KioskList browser = new KioskList();
        browser.setName("BROWSER KIOSK");
        kioskListRepository.save(browser);

        log.info("Saved browser - id:" + browser.getId());

        KioskList dash = new KioskList();
        dash.setName("DASHBOARD KIOSK");
        kioskListRepository.save(dash);

        log.info("Saved dash - id: " + dash.getId());
    }
}
