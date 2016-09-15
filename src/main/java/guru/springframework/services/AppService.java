package guru.springframework.services;

import guru.springframework.domain.App;

public interface AppService {
	Iterable<App> listAllApps();
	App getAppById(Integer Id);
	App saveApp(App application);
}
