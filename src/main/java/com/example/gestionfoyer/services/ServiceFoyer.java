package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Foyer;
import com.example.gestionfoyer.entities.Universite;
import com.example.gestionfoyer.repositories.FoyerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceFoyer implements IServiceFoyer {
    private final FoyerRepository foyerRepository;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return (List<Foyer>) this.foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return this.foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return this.foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return this.foyerRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(long idFoyer) {
        if (this.foyerRepository.findById(idFoyer).orElse(null) != null) this.foyerRepository.deleteById(idFoyer);
    }


}
