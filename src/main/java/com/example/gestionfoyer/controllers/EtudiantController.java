package com.example.gestionfoyer.controllers;

import com.example.gestionfoyer.entities.Etudiant;
import com.example.gestionfoyer.services.IServiceEtudiant;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("etudiants")
public class EtudiantController {
    private final IServiceEtudiant serviceEtudiant;

    @PostMapping
    public List<Etudiant> addEtudiant(@RequestBody List<Etudiant> etudiants){
        return this.serviceEtudiant.addEtudiants(etudiants);
    }
    @PutMapping
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant){
        return this.serviceEtudiant.updateEtudiant(etudiant);
    }
    @GetMapping("{idEtudiant}")
    public Etudiant retrieveEtudiant(@PathVariable long idEtudiant){
        return this.serviceEtudiant.retrieveEtudiant(idEtudiant);
    }
    @GetMapping
    public List<Etudiant> retrieveAllEtudiants(){
        return this.serviceEtudiant.retrieveAllEtudiants();
    }
    @DeleteMapping("{idEtudiant}")
    public void removeEtudiant(@PathVariable long idEtudiant){
        this.serviceEtudiant.removeEtudiant(idEtudiant);
    }

}
