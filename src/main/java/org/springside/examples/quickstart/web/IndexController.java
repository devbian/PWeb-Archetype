package org.springside.examples.quickstart.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author jinliang.bian
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController {
	@RequestMapping(method=RequestMethod.GET)
	public String index() {
		return "index/index";
	}
}
