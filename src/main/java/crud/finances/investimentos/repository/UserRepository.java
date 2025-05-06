package crud.finances.investimentos.repository;



import crud.finances.investimentos.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

//É a parte que fala com o banco de dados.
// Ele serve para salvar, buscar, deletar ou atualizar jogadores no banco.

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
