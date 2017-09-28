package fr.intech.s5.backend.hotel.intech.Backendhotelintech.converter;

import org.springframework.core.convert.converter.Converter;

import fr.intech.s5.backend.hotel.intech.Backendhotelintech.entity.Reservation;
import fr.intech.s5.backend.hotel.intech.Backendhotelintech.model.response.ReservationResponse;
import fr.intech.s5.backend.hotel.intech.Backendhotelintech.util.BackendConstantes;
import fr.intech.s5.backend.hotel.intech.Backendhotelintech.util.UriParameter;

public class ReservationToReservationResponseConverter implements Converter<Reservation, ReservationResponse> {

	@Override
	public ReservationResponse convert(Reservation reservation) {
		
		ReservationResponse reservationResponse = new ReservationResponse();

		reservationResponse.setDateDebut(reservation.getDateDebut());
		reservationResponse.setDateFin(reservation.getDateFin());

		Long chambreId = reservation.getChambre().getChambreId();
		UriParameter uriParameter = new UriParameter(chambreId, BackendConstantes.CHAMBRE_RESERVATION_V1 + "/" + chambreId);		
		reservationResponse.setUriParameter(uriParameter);
	
		if(reservation.getIDReservation() != null)
			reservationResponse.setReservationId(reservation.getIDReservation());
		
		return reservationResponse;
	}
}
