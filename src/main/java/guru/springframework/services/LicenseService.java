package guru.springframework.services;


import guru.springframework.domain.License;

public interface LicenseService {
    Iterable<License> listAllLicenses();

    License getLicenseById(Integer id);

    License saveLicense(License license);
}
