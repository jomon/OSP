package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import guru.springframework.domain.Configuration;
import guru.springframework.services.ConfigurationService;

@Controller
public class ConfigurationController {
    private ConfigurationService configurationService;

    @Autowired
    public void setConfigurationService(ConfigurationService configurationService) {
        this.configurationService = configurationService;
    }
    
    @RequestMapping(value = "/configurations", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("configurations",configurationService.listAllConfigurations() );
        return "configurations";
    }
    
    @RequestMapping("configuration/new")
    public String newConfiguration(Model model){
        model.addAttribute("configuration", new Configuration());
        return "configurationform";
    }

    @RequestMapping(value = "configuration", method = RequestMethod.POST)
    public String saveConfiguration(Configuration configuration){

        configurationService.saveConfiguration(configuration);

        return "redirect:/configurations";
    }
    
    @RequestMapping("configuration/{id}")
    public String showConfiguration(@PathVariable Integer id, Model model){
        model.addAttribute("configuration", configurationService.getConfigurationById(id));
        return "configurationshow";
    }

    @RequestMapping("configuration/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("configuration", configurationService.getConfigurationById(id));
        return "configurationform";
    }
    
    @RequestMapping(value = "/disableapps", method = RequestMethod.GET)
    public String disableslist(Model model){
     
        return "disabledappform";
    }

}
