package Controller;

import java
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Repository.UserRepository;
import entity.User;
import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
@RequestMapping("/user")


public class UserController {
UserRepository userRepository

    @PostMapping(value = "inserir")
public User saveUser name(@RequestBody User user) {
return UserRepository.save(user);    
}    
}
