package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Reservation;
import com.example.gestionfoyer.repositories.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceReservation implements IServiceReservation{
    private final ReservationRepository reservationRepository ;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return this.reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return this.reservationRepository.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return this.reservationRepository.findById(idReservation).orElse(null);
    }
}
