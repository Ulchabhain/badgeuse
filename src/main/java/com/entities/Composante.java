package com.entities;

import javax.persistence.*;

import lombok.Data;

import java.util.List;

@Entity
@Data
public class Composante {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nomComposante;

    @OneToMany(mappedBy = "composante")
    private List<Responsable> responsables;

    @ManyToOne
    private FiliereLangue filiereLangue;
}
