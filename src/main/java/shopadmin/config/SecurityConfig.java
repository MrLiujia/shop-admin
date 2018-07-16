package shopadmin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

public class SecurityConfig {
	@Bean
	public UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager um = new InMemoryUserDetailsManager();
		um.createUser(User.withUsername("admin")
				.password("$2a$10$pyhoz7k3QLux1jrJmuE.ZOenAbfrGpa8cSMYa4xs9reYaDsUyXsfG").authorities("ADMIN").build());
		return um;
	}

}
