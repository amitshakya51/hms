package hospital.management.system.hms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import hospital.management.system.hms.entity.PatientEntity;
import hospital.management.system.hms.service.PatientService;

@Controller
public class HomeController {
	
	@Autowired
	private PatientService patientService;

	@GetMapping("/registration")
	public String showregistration(Model model) {
		model.addAttribute("");
		return "registration";
	}
	
	@PostMapping("/registration")
	public String saveRegistration(@ModelAttribute PatientEntity patientEntity) {
		try {
			patientService.patientregistration(patientEntity);
			return "redirect:/registration";
		}
		catch(IllegalArgumentException ex){
			return "registration";
		}
	}
}
