package fr.intech.s5.backend.hotel.intech.Backendhotelintech.converter;

import org.springframework.core.convert.converter.Converter;


import fr.intech.s5.backend.hotel.intech.Backendhotelintech.entity.Reservation;
import fr.intech.s5.backend.hotel.intech.Backendhotelintech.model.request.ReservationRequest;


public class ReservationRequestToReservationConverter implements Converter<ReservationRequest,Reservation>{



	@Override
	public Reservation convert(ReservationRequest reservationRequest) {
		
		Reservation reservation = new Reservation();
		
		reservation.setDateDebut(reservationRequest.getDateDebut());
		reservation.setDateFin(reservationRequest.getDateFin());
		
		if(reservationRequest.getReservationId() != null)
			reservation.setIDReservation(reservationRequest.getReservationId());
			
		return reservation;
	}


}

