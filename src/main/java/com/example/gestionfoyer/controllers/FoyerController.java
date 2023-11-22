package com.example.gestionfoyer.controllers;

import com.example.gestionfoyer.entities.Foyer;
import com.example.gestionfoyer.services.IServiceFoyer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("foyers")
public class FoyerController {
    private final IServiceFoyer serviceFoyer ;
    @PostMapping
    public Foyer addFoyer(@RequestBody Foyer f)
    {
        return this.serviceFoyer.addFoyer(f);
    }

    @GetMapping("{idFoyer}")
    public Foyer retrieveFoyer(@PathVariable long idFoyer)
    {
        return this.serviceFoyer.retrieveFoyer(idFoyer);
    }
    @GetMapping
    public List<Foyer> retrieveAllFoyers()
    {
        return this.serviceFoyer.retrieveAllFoyers();
    }
    @PutMapping
    public Foyer updateFoyer(@RequestBody Foyer f)
    {
        return this.serviceFoyer.updateFoyer(f);
    }
    @DeleteMapping("{idFoyer}")
    public void removeFoyer(@PathVariable long idFoyer)
    {
        this.serviceFoyer.removeFoyer(idFoyer);
    }

}
