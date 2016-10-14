package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import guru.springframework.domain.Device;
import guru.springframework.services.DeviceService;

@Controller
public class DeviceController {
	private DeviceService deviceService;
	
	@Autowired
	public void setDeviceService(DeviceService deviceService) {
		this.deviceService = deviceService;
	}
	
	@RequestMapping(value = "/devices", method = RequestMethod.GET)
	public String list(Model model){
		model.addAttribute("devices",deviceService.listAllDevices() );
		return "devices";
	}
	
	@RequestMapping("device/new")
    public String newDevice(Model model){
        model.addAttribute("device", new Device());
        return "deviceform";
    }

    @RequestMapping(value = "device", method = RequestMethod.POST)
    public String saveDevice(Device device){

        deviceService.saveDevice(device);

        return "redirect:/devices";
    }
    
    @RequestMapping("device/{id}")
    public String showDevice(@PathVariable Integer id, Model model){
        model.addAttribute("device", deviceService.getDeviceById(id));
        return "deviceshow";
    }

    @RequestMapping("device/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("device", deviceService.getDeviceById(id));
        return "deviceform";
    }
    @RequestMapping(value = "/managedevice", method = RequestMethod.GET)
    public String managedevice(Model model){
        model.addAttribute("device", new Device());
    	        return "managedeviceform";
    }

}
