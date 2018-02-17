package springrest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private static final String GREETING = "Hello World";
	
	@RequestMapping("/greeting")
	public String sayHello() {
		return GREETING;
	}

}
