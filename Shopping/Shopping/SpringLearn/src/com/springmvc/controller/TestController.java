package com.springmvc.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
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
@RequestMapping("/mytest")
public class TestController{
	@RequestMapping("/ajax")
	@ResponseBody
	public String ajax(HttpSession session,String username,HttpServletResponse response){
		try {
			username=URLDecoder.decode(username,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("username-----------------------------------------------ajax:"+username);
		return "{\"username\":"+username+"}";

	}
	
}