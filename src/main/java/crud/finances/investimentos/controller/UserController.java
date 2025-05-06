package crud.finances.investimentos.controller;

// Chamadas HTTP, GET, POST...
// É a parte que fala com o usuário, ou seja, recebe as requisições da internet
// (tipo “criar jogador”, “listar todos”) e passa para o Service resolver.

import crud.finances.investimentos.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/users")
public class UserController {
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody CreateUserDto createUserDto) {
        return null;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") String userId) {
        return null;
    }
}
