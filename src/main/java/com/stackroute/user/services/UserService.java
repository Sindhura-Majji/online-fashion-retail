package com.stackroute.user.services;

import com.stackroute.user.domain.User;

import java.util.List;

public interface UserService {

    public User saveUser(User user);

    public List<User> getAllTracks();
}
