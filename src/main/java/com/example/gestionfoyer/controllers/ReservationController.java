package com.example.gestionfoyer.controllers;

import com.example.gestionfoyer.entities.Reservation;
import com.example.gestionfoyer.services.IServiceReservation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("reservations")
public class ReservationController {
    private final IServiceReservation serviceReservation ;
    @GetMapping("{idReservation}")
    public Reservation retrieveReservation(@PathVariable String idReservation)
    {
        return this.serviceReservation.retrieveReservation(idReservation);
    }
    @GetMapping
    public List<Reservation> retrieveAllReservation()
    {
        return this.serviceReservation.retrieveAllReservation();
    }
    @PutMapping
    public Reservation updateReservation(@RequestBody Reservation res)
    {
        return this.serviceReservation.updateReservation(res);
    }


}
