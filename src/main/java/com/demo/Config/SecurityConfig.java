package com.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

//	@Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        return bCryptPasswordEncoder;
//	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		http.csrf().disable().authorizeHttpRequests((authorize) -> authorize.antMatchers("/save").permitAll()
//				.antMatchers("/companyList").permitAll().antMatchers("/DComPurcheRequisitionList").permitAll()
//				.antMatchers("/ListAll").permitAll()
//				.antMatchers("/DinvReqHeaderSave").permitAll().antMatchers("/itemList/{companyId}").permitAll()
//				.antMatchers("/DinvReqDetailSave").permitAll())
//				.formLogin(form -> form.loginPage("/login").loginProcessingUrl("/login").permitAll());
		
		return http.build();
	}
}