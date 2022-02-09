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

    @OneToMany(mappedBy = "filiereLangue")
    private List<Composante> composantes;

    @ManyToMany
    private List<Cours> cours;
}
