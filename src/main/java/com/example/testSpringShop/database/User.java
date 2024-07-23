package com.example.testSpringShop.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.context.annotation.Bean;

@Entity
@Table(name = "Users")
@Data
public class User {

    @Id
    Integer id;

    String name;
    String lastName;
    String username;
    String password;
    String email;

}
