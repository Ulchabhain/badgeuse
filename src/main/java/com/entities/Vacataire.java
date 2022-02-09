package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class Vacataire extends Utilisateur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
}
