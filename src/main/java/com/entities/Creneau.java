package com.entities;

import javax.persistence.*;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Creneau {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Date date_heure;
    private double duree;
    private Type type;

    @ManyToOne
    private Cours cours;

    @OneToMany(mappedBy = "creneau")
    private List<Seance_formation> seances;
}
