/**
 * 
 */
package org.baeldung.service;

import org.baeldung.model.ExtendedUser;
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

		User user = findUserbyUsername(username);

		UserBuilder builder = null;
		if (user != null) {
			builder = ExtendedUser.withUsername(username);
			builder.password(new BCryptPasswordEncoder().encode(user.getPassword()));
			builder.roles(user.getRoles());
			System.out.println(("UserName : " + username + "PW : " + user.getPassword()));
		} else
			throw new UsernameNotFoundException("User not found.");

		return builder.build();
	}

	/**
	 * @param username
	 *            Search for this User for ex. in DB
	 */
	private User findUserbyUsername(String username) {
		if (username.equalsIgnoreCase("ThaAdmin")) {
			return new User(username, "ThaAdmin", "USER");
		}
		return null;
	}
}
