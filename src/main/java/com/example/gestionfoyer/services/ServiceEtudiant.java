package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Etudiant;
import com.example.gestionfoyer.repositories.EtudiantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceEtudiant implements IServiceEtudiant{

    private final EtudiantRepository etudiantRepository ;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return this.etudiantRepository.findAll();
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        this.etudiantRepository.saveAll(etudiants);
        return etudiantRepository.findAll();

    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return this.etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) {
        return this.etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(long idEtudiant) {
        if (this.etudiantRepository.findById(idEtudiant).orElse(null) != null)
            this.etudiantRepository.deleteById(idEtudiant);
    }
}
