/**
 * 
 */
package org.baeldung.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author hayber
 *
 */
public class ExtendedUser extends org.springframework.security.core.userdetails.User {

	private static final long serialVersionUID = -4927386520907847190L;
	private String email;

	public ExtendedUser(String username, String password, String email, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		this.email = email;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
