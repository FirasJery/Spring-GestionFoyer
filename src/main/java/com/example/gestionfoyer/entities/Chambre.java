package com.example.gestionfoyer.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(value = AccessLevel.NONE)
    long idChambre;
    long numeroChambre;
    @Enumerated(EnumType.STRING)
    typeC typeChambre ;
    @OneToMany
    Set<Reservation> reservations;
    @ManyToOne
    Bloc bloc;
}
