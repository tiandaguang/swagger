package com.thfund.app.ifinance.web.conn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="swagger")
public class MySwagger {

	@RequestMapping(value = "/getStatus", method = RequestMethod.GET)
	@ResponseBody
	public String getStatus(ModelMap model) {
		model.addAttribute("movie", "this is default movie");
		return "list";
	}

}
