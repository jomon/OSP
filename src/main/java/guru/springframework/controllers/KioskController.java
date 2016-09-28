package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import guru.springframework.domain.Kiosk;
import guru.springframework.repositories.BrowserRepository;
import guru.springframework.repositories.KioskListRepository;
import guru.springframework.services.KioskService;

@Controller
public class KioskController {

	private KioskService kioskService;
	private BrowserRepository broserRepository;
	private KioskListRepository kioskListRepository;
	@Autowired
	public void setBroserRepository(BrowserRepository broserRepository) {
		this.broserRepository = broserRepository;
	}

	@Autowired
	public void setAuthenticationrepository(KioskListRepository kioskListRepository) {
		this.kioskListRepository = kioskListRepository;
	}

	@Autowired
	public void setKioskService(KioskService kioskService) {
		this.kioskService = kioskService;
	}

	

	@RequestMapping(value = "/kiosks", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("kiosks", kioskService.listAllKiosks());
		return "kiosks";
	}

	@RequestMapping("kiosk/new")
	public String newKiosk(Model model) {
		model.addAttribute("kiosk", new Kiosk());
		model.addAttribute("browserlist", broserRepository.findAll());
		model.addAttribute("kiosklist", kioskListRepository.findAll());
		model.addAttribute("kiosks", kioskService.listAllKiosks());
		return "kioskform";
	}

	@RequestMapping(value = "kiosk", method = RequestMethod.POST)
	public String saveKiosk(Kiosk kiosk) {

		kioskService.saveKiosk(kiosk);

		return "redirect:/kiosk/new";
	}

	@RequestMapping("kiosk/{id}")
	public String showKiosk(@PathVariable Integer id, Model model) {
		model.addAttribute("kiosk", kioskService.getKioskById(id));
		return "kioskshow";
	}

	@RequestMapping("kiosk/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		model.addAttribute("kiosk", kioskService.getKioskById(id));
		return "kioskform";
	}

}
