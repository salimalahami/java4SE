package tn.esprit.tpfoyerislemlahami.services;

import tn.esprit.tpfoyerislemlahami.entities.Reservation;
import tn.esprit.tpfoyerislemlahami.repositories.ReservationRepository;

import java.util.List;

public class ReservationService implements IreservationService{
    ReservationRepository reservationRepository;
    @Override
    public Reservation add(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation update(Reservation reservation) {
        return null;
    }

    @Override
    public List<Reservation> addReservation(List<Reservation> reservations) {
        return reservationRepository.saveAll(reservations);
    }

    @Override
    public List<Reservation> updateReservation(List<Reservation> reservations) {
        return null;
    }

    @Override
    public void deleteReservation(Reservation reservation) {

    }

    @Override
    public void deleteReservationById(long id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteAll(List<Reservation> reservations) {

    }

    @Override
    public List<Reservation> findAll() {
        return null;
    }

    @Override
    public Reservation findById(long id) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
