package com.medicalfile.app;

import com.medicalfile.app.config.security.RsaKeysConfig;
import com.medicalfile.app.domain.security.AppRole;
import com.medicalfile.app.domain.security.AppUser;
import com.medicalfile.app.service.security.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeysConfig.class)
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return  new BCryptPasswordEncoder();
	}

//	@Bean
//	CommandLineRunner start(AccountService accountService){
//		return args -> {
//			accountService.addNewRole(new AppRole(0,"ADMIN"));
//			accountService.addNewUser(new AppUser(0,"admin","123",new ArrayList<>()));
//			accountService.addRoleToUser("admin","ADMIN");
//
//
//		};
//	}


}
