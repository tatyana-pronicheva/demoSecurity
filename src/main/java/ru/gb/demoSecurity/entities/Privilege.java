package ru.gb.demoSecurity.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "privileges")
public class Privilege {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
