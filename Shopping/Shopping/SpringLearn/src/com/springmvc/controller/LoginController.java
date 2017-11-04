package com.springmvc.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class LoginController implements HandlerInterceptor{
	@RequestMapping("/login")
	@ResponseBody
	public String login(HttpSession session,String username,String password,HttpServletResponse response){
	
		if(username!=null && username.equals("admin") && password!=null && password.equals("admin")){
			session.setAttribute("loginStatus", "1");
			return "{\"loginStatus\":\"success\"}";
		}else {
			return "{\"loginStatus\":\"error\"}";
		}

	}
	@RequestMapping("/checkLogin")
	public ModelAndView checkLogin(HttpSession session){
		Object x=session.getAttribute("loginStatus");
		if(x!=null && x.toString().equals("1")){
			return new ModelAndView("redirect:/shop/show", null);
		}
		return new ModelAndView("redirect:/login.jsp", null);
	}
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		
		HttpSession session=request.getSession();
		Object x=session.getAttribute("loginStatus");
		if(x!=null && x.toString().equals("1")){
			System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			return true;
		}
		System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		  
        response.sendRedirect("../login.jsp");
        return false;  
	}
}