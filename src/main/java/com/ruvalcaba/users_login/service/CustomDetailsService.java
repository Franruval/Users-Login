package com.ruvalcaba.users_login.service;

import com.ruvalcaba.users_login.entity.User;
import com.ruvalcaba.users_login.entity.UserPrincipal;
import com.ruvalcaba.users_login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username.toLowerCase());

        if(user == null){
            throw new UsernameNotFoundException("Username not found");
        }

        return new UserPrincipal(user);
    }
}
