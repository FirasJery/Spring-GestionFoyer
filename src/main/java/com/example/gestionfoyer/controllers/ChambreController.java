package com.example.gestionfoyer.controllers;

import com.example.gestionfoyer.entities.Chambre;
import com.example.gestionfoyer.services.IServiceChambre;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("chambres")
public class ChambreController {
    private final IServiceChambre serviceChambre;
    @PostMapping
    public Chambre addChambre(@RequestBody Chambre chambre)
    {
        return this.serviceChambre.addChambre(chambre);
    }
    @PutMapping
    public Chambre updateChambre(@RequestBody Chambre chambre)
    {
        return this.serviceChambre.updateChambre(chambre);
    }
    @GetMapping("{idChambre}")
    public Chambre retrieveChambre(@PathVariable long idChambre)
    {
        return this.serviceChambre.retrieveChambre(idChambre);
    }
    @GetMapping
    public List<Chambre> retrieveAllChambres()
    {
        return this.serviceChambre.retrieveAllChambres();
    }

}
