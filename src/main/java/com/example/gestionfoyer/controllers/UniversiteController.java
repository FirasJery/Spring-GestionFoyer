package com.example.gestionfoyer.controllers;

import com.example.gestionfoyer.entities.Universite;
import com.example.gestionfoyer.services.IServiceUniversite;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("universites")
public class UniversiteController {
    private final IServiceUniversite serviceUniversite ;
    @PostMapping
    public Universite addUniversite(@RequestBody Universite u)
    {
        return this.serviceUniversite.addUniversite(u);
    }
    @PutMapping
    public Universite updateUniversite(@RequestBody Universite u)
    {
        return this.serviceUniversite.updateUniversite(u);
    }
    @GetMapping("{idUniversite}")
    public Universite retrieveUniversite(@PathVariable long idUniversite)
    {
        return this.serviceUniversite.retrieveUniversite(idUniversite);
    }
    @GetMapping
    public List<Universite> retrieveAllUniversities()
    {
        return this.serviceUniversite.retrieveAllUniversities();
    }

    @PostMapping("/{idFoyer}/{nomUniversite}'")
    public Universite affecterFoyerAUniversite( @PathVariable long idFoyer,@PathVariable  String nomUniversite)
    {
        return this.serviceUniversite.affecterFoyerAUniversite(idFoyer,nomUniversite);
    }
}
