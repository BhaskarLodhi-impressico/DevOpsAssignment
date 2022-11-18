package com.bhaskarlodhi.service;

import java.util.List;

import com.bhaskarlodhi.dto.UserRegistrationDto;
import com.bhaskarlodhi.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService
{

	User save(UserRegistrationDto registrationDto);

	List<User> getAll();
}
