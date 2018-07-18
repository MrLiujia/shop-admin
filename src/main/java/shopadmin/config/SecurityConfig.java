package shopadmin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
@Configuration
@EnableWebSecurity // 获得了springSecurityFilterChain组件
@EnableGlobalMethodSecurity(prePostEnabled = true) 
public class SecurityConfig {
	@Bean
	public UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager um = new InMemoryUserDetailsManager();
		um.createUser(User.withUsername("admin")
				.password("$2a$10$pyhoz7k3QLux1jrJmuE.ZOenAbfrGpa8cSMYa4xs9reYaDsUyXsfG").authorities("ADMIN").build());
		return um;
	}

}
