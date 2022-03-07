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

    @OneToMany(mappedBy = "composanteRes")
    private List<Responsable> responsablesCom;

    @OneToMany(mappedBy = "composanteFil")
    private List<FiliereLangue> filiereLanguesCom;
}
