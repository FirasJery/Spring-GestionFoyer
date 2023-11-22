package com.example.gestionfoyer.controllers;

import com.example.gestionfoyer.entities.Bloc;
import com.example.gestionfoyer.services.IServiceBloc;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("blocs")
public class BlocController {
    private final IServiceBloc serviceBloc ;
    @PostMapping
    public Bloc addBloc(@RequestBody Bloc bloc)
    {
       return this.serviceBloc.addBloc(bloc);
    }
    @PutMapping
    public Bloc updateBloc(@RequestBody Bloc bloc)
    {
        return this.serviceBloc.updateBloc(bloc);
    }
    @DeleteMapping("{idBloc}")
    public void removeBloc(@PathVariable long idBloc)
    {
        this.serviceBloc.removeBloc(idBloc);
    }
    @GetMapping("{idBloc}")
    public Bloc retrieveBloc(@PathVariable long idBloc)
    {
        return this.serviceBloc.retrieveBloc(idBloc);
    }
    @GetMapping("/all")
    public List<Bloc> retrieveBlocs()
    {
        return this.serviceBloc.retrieveBlocs();
    }
}
