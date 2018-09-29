/**
 * 
 */
package org.baeldung.service;

import org.baeldung.model.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author hayber
 *
 */
public class UserDetailsServiceImp implements UserDetailsService {
	/*
	 * Here we are using dummy data, you need to load user data from database or
	 * other third party application
	 */

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("UserName : " + username);
		User user = findUserbyUsername(username);

		UserBuilder builder = null;
		if (user != null) {
			builder = org.springframework.security.core.userdetails.User.withUsername(username);
			builder.password(new BCryptPasswordEncoder().encode(user.getPassword()));
			builder.roles(user.getRoles());
		} else {
			throw new UsernameNotFoundException("User not found.");
		}

		return builder.build();
	}

	private User findUserbyUsername(String username) {
		if (username.equalsIgnoreCase("admin")) {
			return new User(username, "admin", "ADMIN");
		}
		return null;
	}
}
