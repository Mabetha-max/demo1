package com.demo.comdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Democontroller {
	@RequestMapping("/aws")
	public String indexbyjsp() {
		return "page/aws";
	}
}
