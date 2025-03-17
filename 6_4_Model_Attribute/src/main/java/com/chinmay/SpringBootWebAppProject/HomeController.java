package com.chinmay.SpringBootWebAppProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home()
	{
		return "index";
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
//	@RequestMapping("add")
//	public String add(@RequestParam("num1") int num,int num2,HttpSession hs)
//	{
//		//int num1=Integer.parseInt(req.getParameter("num1"));
//		//int num2=Integer.parseInt(req.getParameter("num2"));
//        System.out.println("Addition Result "+(num+num2));
//        hs.setAttribute("result",(num+num2));
//		return "result.jsp";
//	}
	
	//Transferring data to the client using the Model Object
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int num,int num2,ModelAndView mv)
	{
		
        System.out.println("Addition Result "+(num+num2));
       mv.addObject("result",(num+num2));
       mv.setViewName("result");
    
		return mv;
	}
	@RequestMapping("addStudentData")
	public ModelAndView addStudentData(@RequestParam("sid") int sid,String sname,ModelAndView mv)
	{
		
		Student st=new Student();
		st.setSname(sname);
		st.setSid(sid);
		mv.addObject("studentdata",st);
		mv.setViewName("result");
//        System.out.println("Addition Result "+(num+num2));
//       mv.addObject("result",(num+num2));
//       mv.setViewName("result");
//    
		return mv;
	}

}
