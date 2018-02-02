package com.example.securityexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class SecurityexampleApplication {

	@Autowired
	private PasswordEncoder passwordEncoder;

	private Role role;
	public static void main(String[] args) {
		SpringApplication.run(SecurityexampleApplication.class, args);
	}

	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository userRepository,UserService service) throws Exception {
		builder.userDetailsService(userDetailsService(userRepository));
//		.passwordEncoder(passwordEncoder)



	}

	private UserDetailsService userDetailsService(final UserRepository userRepository) {
		return username -> new CustomUserDetails(userRepository.findByName(username));
	}
}
