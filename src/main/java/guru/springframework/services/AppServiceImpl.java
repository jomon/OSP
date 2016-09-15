package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.domain.App;
import guru.springframework.repositories.AppRepository;
@Service
public class AppServiceImpl implements AppService {
private AppRepository appRepository;
    
@Autowired
    public void setAppRepository(AppRepository appRepository) {
    this.appRepository = appRepository;
}

    @Override
    public Iterable<App> listAllApps() {
        // TODO Auto-generated method stub
        return appRepository.findAll();
    }

    @Override
    public App getAppById(Integer Id) {
        // TODO Auto-generated method stub
        return appRepository.findOne(Id);
    }

    @Override
    public App saveApp(App app) {
        // TODO Auto-generated method stub
         return appRepository.save(app);
    }

}
