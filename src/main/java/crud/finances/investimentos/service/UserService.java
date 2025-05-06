package crud.finances.investimentos.service;
import crud.finances.investimentos.controller.CreateUserDto;
import crud.finances.investimentos.entity.User;
import crud.finances.investimentos.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

// Aqui rola a lógica do jogo. Tipo:
// "só pode criar um jogador se ele tiver menos de 40 anos”.
// O Service recebe as ordens do Controller e faz o trabalho principal.


@Service
public class UserService {

    private UserRepository userRepository;
    // Injeção de dependencia, Quando usamos uma classe dentro de outra classe
    // Injeção de dependencia
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UUID createUser(CreateUserDto createUserDto) {

        // Convertendo DTO para ENTITY
        var entity = new User();
        entity.setUserName(createUserDto.username());
        entity.setEmail(createUserDto.email());
        entity.setPassword(createUserDto.password());

        var userSaved = userRepository.save(entity);
        return userSaved.getUserId();
    }

    public Optional<User> getUserById(String userId) {
        return userRepository.findById(UUID.fromString(userId));
    }

}
