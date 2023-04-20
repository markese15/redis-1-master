package com.develhope.redis_01.entities.redis;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.*;

@RedisHash(value = "player", timeToLive = 60)
@Entity
@Table
public class PlayerRedis {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String passwordEncrypted;

    public PlayerRedis(Long id, String name, String email, String passwordEncrypted){
        this.id = id;
        this.name = name;
        this.email = email;
        this.passwordEncrypted = passwordEncrypted;
    }

    public PlayerRedis(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordEncrypted() {
        return passwordEncrypted;
    }

    public void setPasswordEncrypted(String passwordEncrypted) {
        this.passwordEncrypted = passwordEncrypted;
    }
}
