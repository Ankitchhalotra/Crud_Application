package com.ankit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailingController {

//	@Autowired
//	//private MailingService mailingService;
//	
//	@RequestMapping("mail")
//	public String showMailForm() {
//		return "mailer";
//	}
//	@RequestMapping("sendmail")
//	public ModelAndView sendMail(@ModelAttribute("mail") Mail mail) {
//		//mailingService.send(mail);
//		return new ModelAndView("mail-success");
//	}
}
