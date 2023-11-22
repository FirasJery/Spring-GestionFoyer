package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Chambre;
import com.example.gestionfoyer.repositories.ChambreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceChambre implements IServiceChambre{
    private final ChambreRepository chambreRepository ;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return this.chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return this.chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return this.chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return this.chambreRepository.findById(idChambre).orElse(null);
    }
}
