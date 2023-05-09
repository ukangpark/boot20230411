package com.example.demo.config;

import java.util.*;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.method.configuration.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.userdetails.User.*;
import org.springframework.security.crypto.bcrypt.*;
import org.springframework.security.crypto.password.*;
import org.springframework.security.provisioning.*;
import org.springframework.security.web.*;
import org.springframework.security.web.access.expression.*;

@Configuration
@EnableMethodSecurity
public class MyConfig2 {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) 
			throws Exception {
		//http.formLogin().defaultSuccessUrl("/list", true);//로그인설정 로그인성공하면 리스트로가겠다.
		http.formLogin()
		.loginPage("/sub33/mylogin")//내가 직접 만든 로그인페이지로 이동해. (디폴트로그인페이지 나오지 않음) => 그럼 로그인페이지가 나올수있게 컨트롤러를 만들어야함
		.defaultSuccessUrl("/sub33/loginSuccess", true)
		.usernameParameter("id")
		.passwordParameter("pw");
		
		http.authorizeHttpRequests().requestMatchers("/abc").authenticated();//abc경로는 로그인해야만 가게하겠다.
		//http.authorizeHttpRequests().requestMatchers("/sub33/customCheck").authenticated();
		http.authorizeHttpRequests().anyRequest().permitAll();
		return http.build();
		
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		PasswordEncoder encoder = passwordEncoder();
		String pw1 = encoder.encode("pw1");
		System.out.println(pw1);
		String pw2 = encoder.encode("pw2");
		System.out.println(pw2);
		
		
		UserDetails user1 = User.builder()
				.username("user1")
				.password(pw1)
				.authorities(List.of())//권한 메소드를 가져야함(null이면 안되서 리스트그냥넣음)
				.build();
		UserDetails user2 = User.builder()
				.username("user2")
				.password(pw2)
				.authorities(List.of())
				.build();
		
		return new InMemoryUserDetailsManager(user1, user2);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}
