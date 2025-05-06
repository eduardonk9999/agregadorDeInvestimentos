package crud.finances.investimentos.controller;

// Chamadas HTTP, GET, POST...
// É a parte que fala com o usuário, ou seja, recebe as requisições da internet
// (tipo “criar jogador”, “listar todos”) e passa para o Service resolver.

import crud.finances.investimentos.entity.User;
import crud.finances.investimentos.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;


@RestController
@RequestMapping("/v1/users")
public class UserController {

    private UserService userService;

    // Outra injeção de dependencia
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody CreateUserDto createUserDto) {
        var userID = userService.createUser(createUserDto);

        return ResponseEntity.created(URI.create("/v1/users/" + userID.toString())).build();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") String userId) {
        return null;
    }
}
