package com.igortullio.workshopmongo.service;

import com.igortullio.workshopmongo.domain.User;
import com.igortullio.workshopmongo.domain.dto.UserDTO;
import com.igortullio.workshopmongo.repository.UserRepository;
import com.igortullio.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public static final String OBJETO_NÃO_ENCONTRADO = "Objeto não encontrado";

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id) {
        Optional<User> user = userRepository.findById(id);
        return  user.orElseThrow(() -> new ObjectNotFoundException(OBJETO_NÃO_ENCONTRADO));
    }

    public User insert(User user) {
        return userRepository.insert(user);
    }

    public void delete(String id) {
        findById(id);
        userRepository.deleteById(id);
    }

    public User update(User user) {
        User newUser = findById(user.getId());
        updateData(newUser, user);
        return userRepository.save(newUser);
    }

    private void updateData(User newUser, User user) {
        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());
    }

    public static User fromDTO(UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }

}
