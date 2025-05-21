package me.dio.api_rest_cloud.service.imp;

import jakarta.validation.constraints.NotNull;
import me.dio.api_rest_cloud.model.User;
import me.dio.api_rest_cloud.repository.UserRepository;
import me.dio.api_rest_cloud.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(@NotNull User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account number already exists.");
        }

        return userRepository.save(userToCreate);
    }
}
