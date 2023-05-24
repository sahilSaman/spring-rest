package com.spring.rest.webservices.restfulwebservices.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
@GetMapping("/demo")
public DemoBean demo () {
	return new DemoBean("hello");
}


}
