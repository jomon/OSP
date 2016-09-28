	package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import guru.springframework.domain.App;
import guru.springframework.services.AppService;

@Controller
public class AppController {
    private AppService appService;
    
    @Autowired
    public void setAppService(AppService appService) {
        this.appService = appService;
    }
    
    @RequestMapping(value = "/apps", method = RequestMethod.GET)
    public String list(Model model){
    	model.addAttribute("app", new App());
        model.addAttribute("apps",appService.listAllApps() );
        return "apps";
    }
    
    @RequestMapping("app/new")
    public String newApp(Model model){
        model.addAttribute("app", new App());
        model.addAttribute("apps",appService.listAllApps() );
        return "appform";
    }

    @RequestMapping(value = "app", method = RequestMethod.POST)
    public String saveApp(App app){

        appService.saveApp(app);

        return "redirect:/app/new";
    }
    
    @RequestMapping("app/{id}")
    public String showApp(@PathVariable Integer id, Model model){
        model.addAttribute("app", appService.getAppById(id));
        return "appshow";
    }

    @RequestMapping("app/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("app", appService.getAppById(id));
        return "appform";
    }

}
