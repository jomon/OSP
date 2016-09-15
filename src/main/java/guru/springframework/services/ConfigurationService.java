package guru.springframework.services;

import guru.springframework.domain.Configuration;

public interface ConfigurationService {
    Iterable<Configuration> listAllConfigurations();
    Configuration getConfigurationById(Integer Id);
    Configuration saveConfiguration(Configuration configuration);
 
}
