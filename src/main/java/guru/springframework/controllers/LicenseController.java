package guru.springframework.controllers;

import guru.springframework.domain.License;
import guru.springframework.services.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LicenseController {

    private LicenseService licenseService;

    @Autowired
    public void setLicenseService(LicenseService licenseService) {
        this.licenseService = licenseService;
    }

    @RequestMapping(value = "/licenses", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("licenses", licenseService.listAllLicenses());
        System.out.println("Returning licenses:");
        return "licenses";
    }

    @RequestMapping("license/{id}")
    public String showLicense(@PathVariable Integer id, Model model){
        model.addAttribute("license", licenseService.getLicenseById(id));
        return "licenseshow";
    }

    @RequestMapping("license/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("license", licenseService.getLicenseById(id));
        return "licenseform";
    }

    @RequestMapping("license/new")
    public String newLicense(Model model){
        model.addAttribute("license", new License());
        return "licenseform";
    }

    @RequestMapping(value = "license", method = RequestMethod.POST)
    public String saveLicense(License license){
        licenseService.saveLicense(license);
        return "redirect:/licenses";
    }

}
