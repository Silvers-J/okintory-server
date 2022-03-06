package com.okizone.okintory.user.model;

import javax.persistence.*;

import com.okizone.okintory.user.enums.RolesEnum;
import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer uid;

    @NotNull
    @Column(unique = true)
    private String username;

    @NotNull
    @Column(unique = true)
    private String email;

    @NotNull
    private String password;

    @Enumerated(EnumType.STRING)
    private RolesEnum role;
}
