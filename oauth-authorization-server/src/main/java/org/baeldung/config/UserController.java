package org.baeldung.config;

import java.security.Principal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/user/me")
	public Principal user(Principal principal) {
		System.out.println(principal);
		return principal;
	}

	@RequestMapping("/user/register")
	public String register() {
		return HttpStatus.OK.toString();
	}

}