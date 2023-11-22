package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Foyer;
import com.example.gestionfoyer.entities.Universite;
import com.example.gestionfoyer.repositories.FoyerRepository;
import com.example.gestionfoyer.repositories.UniversiteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceUniversite implements IServiceUniversite{
    private final UniversiteRepository universiteRepository;
    private final FoyerRepository foyerRepository ;
    @Override
    public List<Universite> retrieveAllUniversities() {
        return this.universiteRepository.findAll() ;
    }

    @Override
    public Universite addUniversite(Universite u) {
        return this.universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return this.universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return this.universiteRepository.findById(idUniversite).orElse(null);
    }

    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
            Foyer foyer = this.foyerRepository.findById(idFoyer).orElse(null) ;
            Universite universite = this.universiteRepository.findByNomUniversite(nomUniversite);
            if (foyer != null && universite !=null)
            {
                universite.setFoyer(foyer);
                return this.universiteRepository.save(universite);
            }
            else
            {
                return null ;
            }

    }
}
