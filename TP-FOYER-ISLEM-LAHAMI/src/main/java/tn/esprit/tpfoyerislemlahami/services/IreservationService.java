package tn.esprit.tpfoyerislemlahami.services;

import tn.esprit.tpfoyerislemlahami.entities.Foyer;
import tn.esprit.tpfoyerislemlahami.entities.Reservation;

import java.util.List;

public interface IreservationService {
    Reservation add(Reservation reservation);
    Reservation update(Reservation reservation);
    List<Reservation> addReservation (List<Reservation> reservations);

    List<Reservation> updateReservation (List<Reservation> reservations);
    void deleteReservation(Reservation reservation);
    void deleteReservationById(long id);
    void deleteAll();
    void deleteAll(List<Reservation> reservations);
    List<Reservation> findAll();
    Reservation findById (long id);
    long count();
}
