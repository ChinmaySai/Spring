package com.chinmay.SpringBootWebAppProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	  }
	/*@RequestMapping("add")
	public String add(HttpServletRequest req,HttpSession hs)
	{
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
        System.out.println("Addition Result "+(num1+num2));
        hs.setAttribute("result",(num1+num2));
		return "result.jsp";
	}*/
//	@RequestMapping("add")
//	public String add(int num1,int num2,HttpSession hs)
//	{
//		//int num1=Integer.parseInt(req.getParameter("num1"));
//		//int num2=Integer.parseInt(req.getParameter("num2"));
//        System.out.println("Addition Result "+(num1+num2));
//        hs.setAttribute("result",(num1+num2));
//		return "result.jsp";
//	}
	@RequestMapping("add")
	public String add(@RequestParam("num1") int num,int num2,HttpSession hs)
	{
		//int num1=Integer.parseInt(req.getParameter("num1"));
		//int num2=Integer.parseInt(req.getParameter("num2"));
        System.out.println("Addition Result "+(num+num2));
        hs.setAttribute("result",(num+num2));
		return "result.jsp";
	}

}
