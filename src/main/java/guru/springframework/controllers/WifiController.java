package guru.springframework.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import guru.springframework.domain.Wifi;
import guru.springframework.services.WifiService;

@Controller
public class WifiController {
	private WifiService wifiService;
	
@RequestMapping("/wifi")
public String newwifi(Model model){
    model.addAttribute("wify", new Wifi());
    return "wifiform";
}
@RequestMapping(value = "addwifi", method = RequestMethod.POST)
public String savewifi(Wifi wifi){

    wifiService.savewifi(wifi);

    return "redirect:/wifi";
}
}
