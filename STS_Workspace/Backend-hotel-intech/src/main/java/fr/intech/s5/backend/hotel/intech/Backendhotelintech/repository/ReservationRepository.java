package fr.intech.s5.backend.hotel.intech.Backendhotelintech.repository;

import org.springframework.data.repository.CrudRepository;

import fr.intech.s5.backend.hotel.intech.Backendhotelintech.entity.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
	
}
