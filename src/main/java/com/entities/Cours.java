package com.entities;

import javax.persistence.*;

import lombok.Data;

import java.util.List;

@Entity
@Data
public class Cours {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String intitule;

    @ManyToMany
    private List<FiliereLangue> filiereLangues;

    @OneToMany(mappedBy = "cours")
    private List<Creneau> creneaux;
}
