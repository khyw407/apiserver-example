package com.test.apiserver.accounts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
public class AccountsConfiguration {
	
	@Bean
	UserDetailsService userDetailsService(AccountsRepository accountsRepository) {
		return username -> accountsRepository.findByUserName(username)
				.map(
						users -> {
							return new User(users.getUserName(), users.getUserPass(), AuthorityUtils.createAuthorityList("ROLE_ADMIN","ROLE_USER"));
						})
					.orElseThrow(
							() -> new UsernameNotFoundException("no user")
							);
	}
}
