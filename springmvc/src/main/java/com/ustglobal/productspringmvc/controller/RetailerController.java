package com.ustglobal.productspringmvc.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.productspringmvc.dto.ProductBean;
import com.ustglobal.productspringmvc.dto.RetailerBean;
import com.ustglobal.productspringmvc.service.RetailerService;

@Controller
public class RetailerController {

	@Autowired
	private RetailerService service;

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String login(int retailerId, String retailerPassword, HttpServletRequest request) {
		RetailerBean bean = service.login(retailerId, retailerPassword);
		if (bean == null) {
			request.setAttribute("message", "Invalid Id and Password");
			return "login";
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}

	}

	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}

	@PostMapping("/register")
	public String register(RetailerBean bean, ModelMap map) {
		int check = service.register(bean);
		if (check > 0)
			map.addAttribute("message", "Register Successfully and Your ID: " + check);
		else
			map.addAttribute("message", "Email Repeated");
		return "login";
	}

	@GetMapping("/home")
	public String home(ModelMap map, @SessionAttribute(name = "bean", required = false)RetailerBean bean) {
		if (bean == null) {
			map.addAttribute("message", "Login Please");
			return "login";
		} else {
			return "home";
		}
	}

	@PostMapping("/home")
	public String home() {
		return "home";
	}


	@GetMapping("/search") 
	public String search(@RequestParam("orderId") int id, ModelMap map) { 
		ProductBean bean = service.searchProduct(id); 
		if (bean == null) { 
			map.addAttribute("message", "Data not found"); 
		} else {
			map.addAttribute("bean", bean); 
			System.out.println(bean); 
		} 
		return "home"; 
	}


	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}

	@GetMapping("/changepassword") 
	public String changePassword(HttpServletRequest request) { 
		HttpSession session = request.getSession(false); 
		if(session!=null) {
			return "changepassword"; 
		}else{ 
			return "login";
		} 
	}

	@PostMapping("/changepassword")
	public String changePassword(String newpassword, String confirmpassword, @SessionAttribute(name="bean")RetailerBean bean, ModelMap map) { 
		if (newpassword.equals(confirmpassword)) {
			service.changePassword(bean.getRetailerId(), newpassword);
			map.addAttribute("message", "Password Changed"); 
		}else {
			map.addAttribute("message", "Password Not Changed"); 
		} 
		return "home"; 
	}
}
