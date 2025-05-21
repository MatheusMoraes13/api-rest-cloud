package me.dio.api_rest_cloud.service;

import me.dio.api_rest_cloud.model.User;
import org.springframework.stereotype.Service;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);


}
