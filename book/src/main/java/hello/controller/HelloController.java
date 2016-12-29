package hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/books")
public class HelloController {
	
	@RequestMapping(value = "/available")
	  public String available() {
	    return "Hibernate in Action";
	  }

}
