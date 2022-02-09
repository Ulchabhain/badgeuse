package com.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Seance_formation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Boolean estEffectue;
    private double dureeEffective;
    private Boolean estValide;
    private String commentaire;

    @ManyToOne
    private Creneau creneau;
}
