package tn.esprit.tpfoyerislemlahami.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyerislemlahami.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
