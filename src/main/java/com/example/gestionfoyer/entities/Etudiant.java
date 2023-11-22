package com.example.gestionfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(value = AccessLevel.NONE)
    long idEtudiant;
    String nomEtudiant;
    String prenomEtudiant;
    long cin ;
    String ecole;
    LocalDate dateNaissance;
    @ManyToMany
    Set<Reservation> reservations;
}
