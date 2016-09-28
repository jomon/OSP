package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import guru.springframework.domain.Wifi;
import guru.springframework.repositories.AuthenticationRepository;
import guru.springframework.services.EaplistService;
import guru.springframework.services.WifiService;
 
 
@Controller
public class WifiController {
   

	private WifiService wifiService;
    private EaplistService eaplistService;
    private AuthenticationRepository authenticationrepository;
    
    @Autowired
    public void setAuthenticationrepository(AuthenticationRepository authenticationrepository) {
		this.authenticationrepository = authenticationrepository;
	}
	@Autowired
    public void setWifiService(WifiService wifiService) {
        this.wifiService = wifiService;
    }
    @Autowired
    public void setEaplistService(EaplistService eaplistService) {
  		this.eaplistService = eaplistService;
  	}
    
    @RequestMapping(value = "/wifies", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("wifis",wifiService.listAllWifies() );
        return "wifis";
    }
    
  
	@RequestMapping("wifi/new")
    public String newWifi(Model model){
        model.addAttribute("wifi", new Wifi());
        model.addAttribute("eaplist",eaplistService.listAllEaplists() );
        model.addAttribute("authenticationlist",authenticationrepository.findAll() );
        model.addAttribute("wifies",wifiService.listAllWifies() );
       return "wifiform";
    }

    @RequestMapping(value = "wifi", method = RequestMethod.POST)
    public String saveWifi(Wifi wifi){

        wifiService.saveWifi(wifi);

        return "redirect:/wifi/new";
    }
    
    @RequestMapping("wifi/{id}")
    public String showWifi(@PathVariable Integer id, Model model){
        model.addAttribute("wifi", wifiService.getWifiById(id));
        return "wifishow";
    }

    @RequestMapping("wifi/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("wifi", wifiService.getWifiById(id));
        return "wifiform";
    }

}
