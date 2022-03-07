package com.entities;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class Vacataire extends Utilisateur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    private Cours coursVac;

    @OneToMany(mappedBy = "vacataireSea")
    private List<Seance_formation> seancesVac;
}
