package com.github.stokito.service;

import com.github.stokito.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Service
public class UserDetailsManagerCustom implements UserDetailsManager {

    @Autowired
    private UserDaoService userDaoService;

    @Override
    public void createUser(UserDetails user) {
        userDaoService.save((User)user);
    }

    @Override
    public void updateUser(UserDetails user) {
        throw new NotImplementedException();
    }

    @Override
    public void deleteUser(String username) {
        throw new NotImplementedException();
    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {
        throw new NotImplementedException();
    }

    @Override
    public boolean userExists(String username) {
        return userDaoService.findOneByEmail(username) != null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDaoService.findOneByEmail(username);
        if(user == null){
            throw new UsernameNotFoundException("User with username " + username + " not found");
        }
        return user;
    }
}
