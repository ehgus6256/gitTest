package bit.com.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController extends Object{//POJO
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "first")
	public String firstMessage(Model model,@RequestParam(value = "no",required = false,defaultValue="3")int no) {
		if(no==1) {
			model.addAttribute("msg", "HelloSpring");
		}else if(no==2) {
			model.addAttribute("msg", "HiSpring");
		}else {
			model.addAttribute("msg", "OtherSpring");
		}
			
		return "message";
	}
	
	@RequestMapping(value = "second")
	public String secondMessage(Model model) {
		model.addAttribute("msg", "SecondHello");
		return "message";
	}
	
	
}
