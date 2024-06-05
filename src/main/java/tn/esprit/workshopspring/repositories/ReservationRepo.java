package tn.esprit.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import tn.esprit.workshopspring.entities.Reservation;
@Repository
public interface ReservationRepo extends JpaRepository<Reservation, String> {
}
