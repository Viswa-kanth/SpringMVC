package com.kanth.springmvcboot;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kanth.springmvcboot.model.Programmer;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int j,HttpSession session)
	
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		int num3 = i+j;
		
		mv.addObject("num3",num3);
		
		return mv;
	}
	@RequestMapping("addProgrammer")
public String addProgrammer(@RequestParam("aid") int aid,@RequestParam("aname") String aname, Model m)
{
		Programmer a = new Programmer();
		a.setAid(aid);
		a.setAname(aname);
		m.addAttribute("Programmer",a);
		return "result.jsp";
 }
}