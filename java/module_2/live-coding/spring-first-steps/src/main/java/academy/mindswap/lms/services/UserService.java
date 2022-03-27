package academy.mindswap.lms.services;

import academy.mindswap.lms.commands.UserDto;
import academy.mindswap.lms.converters.UserConverter;
import academy.mindswap.lms.persistence.models.User;
import academy.mindswap.lms.persistence.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    public List<UserDto> getUserByName(String name) {
        List<User> users = userRepository.findByName(name);
        return users.stream()
                .map(userConverter::toDto)
                .collect(Collectors.toList());
    }
    public List<UserDto> getUserByOther(String name) {
        return userRepository.findByOtherNameThatIWant(name)
                .stream()
                .map(userConverter::toDto).collect(Collectors.toList());
    }

    public UserDto save(UserDto userDto) {

        return userConverter
                .toDto(
                        userRepository.save(
                        userConverter.toEntity(userDto)
                ));
    }

    public List<UserDto> getAllUsers() {

        return userRepository.findAll()
                .stream()
                .map(userConverter::toDto).collect(Collectors.toList());
    }


    public Optional<UserDto> getUserById(int id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(userConverter::toDto);
    }
}
