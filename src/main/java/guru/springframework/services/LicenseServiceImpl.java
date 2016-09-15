package guru.springframework.services;

import guru.springframework.domain.License;
import guru.springframework.repositories.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicenseServiceImpl implements LicenseService {
    private LicenseRepository licenseRepository;

    @Autowired
    public void setLicenseRepository(LicenseRepository licenseRepository) {
        this.licenseRepository = licenseRepository;
    }

    @Override
    public Iterable<License> listAllLicenses() {
        return licenseRepository.findAll();
    }

    @Override
    public License getLicenseById(Integer id) {
        return licenseRepository.findOne(id);
    }

    @Override
    public License saveLicense(License license) {
        return licenseRepository.save(license);
    }
}
