package com.example.spring_boot_whiskey.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users", schema = "whiskey")
@Data
public class UserEntity {

    @Id
    private Long id;

    private String name;

    private Integer age;

}
