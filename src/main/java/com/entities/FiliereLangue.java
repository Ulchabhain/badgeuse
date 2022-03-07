package com.entities;

import javax.persistence.*;

import lombok.Data;

import java.util.List;

@Entity
@Data
public class FiliereLangue {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private int codeFiliereLangue;
    private String nomFiliereLangue;

    @ManyToOne
    private Composante composanteFil;

    @ManyToMany
    private List<Cours> coursFil;
}
