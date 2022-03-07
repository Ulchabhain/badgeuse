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

    @OneToMany(mappedBy = "coursVac")
    private List<Vacataire> vacatairesCou;

    @ManyToMany
    private List<FiliereLangue> filiereLanguesCou;

    @OneToMany(mappedBy = "coursCre")
    private List<Creneau> creneauxCou;
}
