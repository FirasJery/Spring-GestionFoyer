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
public class Reservation {
    @Id
    @Setter(value = AccessLevel.NONE)
    String idReservation ;
    LocalDate anneeUniversitaire ;
    boolean estValide ;
    @ManyToMany(mappedBy = "reservations")
    Set<Etudiant> etudiants ;
}
