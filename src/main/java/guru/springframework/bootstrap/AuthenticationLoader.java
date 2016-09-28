package guru.springframework.bootstrap;

import guru.springframework.domain.Authentication;
import guru.springframework.repositories.AuthenticationRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class AuthenticationLoader implements ApplicationListener<ContextRefreshedEvent> {

    private AuthenticationRepository authenticationRepository;

    private Logger log = Logger.getLogger(AuthenticationLoader.class);

    @Autowired
    public void setAuthenticationRepository(AuthenticationRepository authenticationRepository) {
        this.authenticationRepository = authenticationRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Authentication pap = new Authentication();
        pap.setName("PAP");
        authenticationRepository.save(pap);

        log.info("Saved pap - id: " + pap.getId());

        Authentication gtc = new Authentication();
        gtc.setName("GTC");
        authenticationRepository.save(gtc);

        log.info("Saved gtc - id:" + gtc.getId());
    }
}
