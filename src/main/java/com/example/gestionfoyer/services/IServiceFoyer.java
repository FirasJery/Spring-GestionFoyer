package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Foyer;

import java.util.List;

public interface IServiceFoyer {
    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer (Foyer f);

    Foyer updateFoyer (Foyer f);

    Foyer retrieveFoyer (long idFoyer);

    void removeFoyer (long idFoyer);
}
