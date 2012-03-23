package com.dec.exp.agilewebtool.web.login;

import javax.xml.transform.dom.DOMSource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dec.exp.agilewebtool.framework.xml.XmlUtil;

@Controller
public class LoginController {

	@RequestMapping(value = "/login/login.do", method = RequestMethod.GET)
	public String login(Model model) {
		DOMSource attributeValue = new DOMSource();
		model.addAttribute("obj", attributeValue);
		return "login/login";
	}

	@RequestMapping(value = "/login/checkCredential.do", method = RequestMethod.POST)
	public String checkCredential(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
		DOMSource attributeValue = new DOMSource(XmlUtil.toXml("username", username));
		model.addAttribute("obj", attributeValue);
		return "welcome/welcome";
	}

}
