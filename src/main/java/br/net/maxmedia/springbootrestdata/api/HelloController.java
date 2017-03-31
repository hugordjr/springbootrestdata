package br.net.maxmedia.springbootrestdata.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String home() {
		return "hello";
	}
}
