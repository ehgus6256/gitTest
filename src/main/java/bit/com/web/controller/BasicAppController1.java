package bit.com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BasicAppController1 {
	@RequestMapping(value = "loginCheck")
	public String loginCheck(Model model, @RequestParam(value = "user_id",required = true, defaultValue = "")String userid,
			@RequestParam(value = "user_passwd")String userpasswd) {
		model.addAttribute("user_id", userid);
		model.addAttribute("user_passwd", userpasswd);
		return "/loginList";
	}
	@RequestMapping(value ="mvcApp1/paramaction")
	public String paramRequest(String data,Model model) {
		System.out.println(data);
		model.addAttribute("data", data);
		return "redirect:/paramResult";
	}
	
	@RequestMapping(value ="paramResult")
	public String paramResultAction() {
		return "/paramResult";
	}
	
	
}
