package com.SchoolOps.SchoolOps.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;


@Entity
public class Login {
    @jakarta.persistence.Id
    private
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    String username ;
    String  password ;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
