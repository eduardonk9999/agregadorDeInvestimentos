package crud.finances.investimentos.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.UUID;

// É como se fosse o modelo dos seus dados. Imagina que você está criando um jogo de futebol.
// Uma Entity pode ser o "Jogador", com atributos como nome, idade, posição, etc.

@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;

    @Column(name = "username")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @CreationTimestamp
    private Instant creationTimestamp;

    @UpdateTimestamp
    private Instant updateImestamp;


    public User() {
    }

    public User(String userName, String email, String password, Instant creationTimestamp, Instant updateImestamp) {

        this.userName = userName;
        this.email = email;
        this.password = password;
        this.creationTimestamp = creationTimestamp;
        this.updateImestamp = updateImestamp;
    }



    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Instant getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Instant creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Instant getUpdateImestamp() {
        return updateImestamp;
    }

    public void setUpdateImestamp(Instant updateImestamp) {
        this.updateImestamp = updateImestamp;
    }
}
