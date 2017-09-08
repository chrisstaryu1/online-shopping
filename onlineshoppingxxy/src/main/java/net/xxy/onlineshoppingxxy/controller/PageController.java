package net.xxy.onlineshoppingxxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/", "home", "index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Spring Web MVC");
		return mv;
	}
	
/**Below are just for demonstration of "@RequestParam" and "@pathVariable"**/
//	//In this case, we have to provide url like "localhost:8080/onlineshoppingxxy/test?greeting=greetingValue",
//	//The view will display "greetingValue", because we pass "greetingValue" as greeting to the greeting object's value.
//	@RequestMapping(value = "/test")
//	public ModelAndView test(@RequestParam("greeting")String greeting) {
//		ModelAndView mv= new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//	}
//	
//	//In this case, we dont need to specify things after "test2" in url like "?greeting=greetingValue"
//	@RequestMapping(value = "/test2")
//	public ModelAndView test2(@RequestParam(value = "greeting", required = false)String greeting) {
//		if (greeting == null) {
//			greeting = "Hello there";
//		}
//		ModelAndView mv= new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//	}
//	
//	@RequestMapping(value = "/test3/{greeting}")
////	public ModelAndView test3(@PathVariable(value = "greeting", required = false)String greeting) {
//	public ModelAndView test3(@PathVariable("greeting")String greeting) {
//		if (greeting == null) {
//			greeting = "Hello there";
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//	}
}
