package guru.springframework.bootstrap;

import guru.springframework.domain.Browser;
import guru.springframework.repositories.BrowserRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class BrowserLoader implements ApplicationListener<ContextRefreshedEvent> {

    private BrowserRepository browserRepository;

    private Logger log = Logger.getLogger(BrowserLoader.class);

    @Autowired
    public void setBrowserRepository(BrowserRepository browserRepository) {
        this.browserRepository = browserRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Browser osp = new Browser();
        osp.setName("OSP BROWSER");
        browserRepository.save(osp);

        log.info("Saved osp - id: " + osp.getId());

        Browser std = new Browser();
        std.setName("STANDERED BROWSER");
        browserRepository.save(std);

        log.info("Saved std - id:" + std.getId());

        Browser app = new Browser();
        app.setName("APPLICATION BROWSER");
        browserRepository.save(app);

        log.info("Saved app - id: " + app.getId());
    }
}
