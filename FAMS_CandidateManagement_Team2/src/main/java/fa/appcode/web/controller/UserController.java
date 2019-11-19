package fa.appcode.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import fa.appcode.model.CandidateProfile;
import fa.appcode.model.Profile;
import fa.appcode.service.CandidateService;
import fa.appcode.service.ProfileService;
import fa.appcode.service.UserService;
import fa.appcode.service.UserServiceImpl;
@SpringBootApplication
@Controller
public class UserController {
	@Autowired  
	private CandidateService candidateService;
	@Autowired
	private ProfileService profileService;
	@Autowired
	UserService userService=new UserServiceImpl();
	
	@GetMapping("/login")
	public String login() {
		return "/views/contents/login-page";
	}
	
	@GetMapping("/")
	public String goLanding() {
		return "/views/contents/landing-page";
	}
	
	@GetMapping("/log-out")
	public String logoutSuccess() {
		return "/views/contents/logout-success";
	}
	
	@GetMapping("/goLandingPage")
	public String goLandingPage(ModelMap modelMap) {
		CandidateProfile candidateProfile= candidateService.findbyId(1);
		Profile profile=profileService.findByCandidateProfil(candidateProfile);
		
		modelMap.addAttribute("candidateProfile",candidateProfile);
		modelMap.addAttribute("profile",profile);
		
		return "/views/contents/viewdetail-result.html";
	}
	
	
	
	
}
