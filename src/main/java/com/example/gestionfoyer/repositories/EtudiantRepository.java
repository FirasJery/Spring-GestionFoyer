package com.example.gestionfoyer.repositories;

import com.example.gestionfoyer.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
