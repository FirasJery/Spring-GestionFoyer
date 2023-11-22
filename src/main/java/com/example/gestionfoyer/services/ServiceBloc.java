package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Bloc;
import com.example.gestionfoyer.repositories.BlocRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceBloc implements IServiceBloc {
    private final BlocRepository blocRepository ;
    @Override
    public List<Bloc> retrieveBlocs() {
        return this.blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return this.blocRepository.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return this.blocRepository.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return this.blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(long idBloc) {
        if (this.blocRepository.findById(idBloc).orElse(null) != null)
            this.blocRepository.deleteById(idBloc);
    }
}
