package com.example.gestionfoyer.repositories;

import com.example.gestionfoyer.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {

    public Universite findByNomUniversite(String nomUniversite);
}
