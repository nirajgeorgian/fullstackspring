package io.fullstackspring.auth.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@Data
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
}
