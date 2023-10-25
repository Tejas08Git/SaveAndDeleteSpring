package com.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;
import com.servicei.ServiceI;



@Controller
public class HomeController {

	@Autowired
	ServiceI si;
	
	@RequestMapping("/")
public String prelogin()
{
	
return "login";
}
	
	@RequestMapping("/register")
public String prereg()
{
	
return "register";
}
	
	
	@RequestMapping("/reg")
public String preregister(@ModelAttribute Student s)
{
	si.savedata(s);

return "login";
}
	@RequestMapping("/log")
public String getalldata(@RequestParam String uname,@RequestParam String password,Model m)
{
	Student s = si.getdata(uname,password);
m.addAttribute("t", s);
return "success";
}
	
	@RequestMapping("/delete")
	public String deletedata(@RequestParam int sid)
	{
		
		si.delete(sid);
		
	return "login";	
		
	}
	
	@RequestMapping("/edit")
	public String editalldata(@RequestParam int sid,Model m)
	{
		
	Student s= si.editdata(sid);
	m.addAttribute("t", s);
		return "edit";
	}
	
	@RequestMapping("/update")
	public String updatedata(@ModelAttribute Student s,Model m)
	{
		si.savedata(s);
		m.addAttribute("t", s);
		return "success";
	}
	
	
	
	
	
	
	
	
	
	
	
}
