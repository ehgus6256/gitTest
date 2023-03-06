package bit.com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/basicMvc/")
public class BasicController {
	
	@RequestMapping(value = "messageAction")
	public String appAction(String msg,Model model) {
		if(msg.equals("java")) {
			return "redirect:appredirect1.jsp";   // basicMvc�տ� /�� ������/basicMvc/appredirect1.jsp�ε� ��밡��
		}
		model.addAttribute("msg", msg);
		return "messageActionResult";
	}
	
	
}
