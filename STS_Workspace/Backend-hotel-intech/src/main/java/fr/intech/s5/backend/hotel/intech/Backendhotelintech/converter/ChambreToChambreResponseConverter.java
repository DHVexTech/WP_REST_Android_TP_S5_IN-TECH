package fr.intech.s5.backend.hotel.intech.Backendhotelintech.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;

import fr.intech.s5.backend.hotel.intech.Backendhotelintech.entity.Chambre;
import fr.intech.s5.backend.hotel.intech.Backendhotelintech.entity.Reservation;
import fr.intech.s5.backend.hotel.intech.Backendhotelintech.model.response.ChambreResponse;
import fr.intech.s5.backend.hotel.intech.Backendhotelintech.util.BackendConstantes;
import fr.intech.s5.backend.hotel.intech.Backendhotelintech.util.UriParameter;

public class ChambreToChambreResponseConverter implements Converter<Chambre, ChambreResponse> {
	@Override
	public ChambreResponse convert(Chambre chambre) {
		
		ChambreResponse chambreResponse = new ChambreResponse();
		
		chambreResponse.setChambreId(chambre.getChambreId());
		chambreResponse.setNumerChambre(chambre.getNumeroChambre());
		chambreResponse.setPrix(chambre.getPrix());
		
		List<Reservation> listReservation = chambre.getListeDesReservations();
		if(listReservation == null) return chambreResponse;
		
		List<UriParameter> listUriReservation = new ArrayList<UriParameter>();
		for(Reservation reservation : listReservation) {
			Long reservationId = reservation.getIDReservation();
			listUriReservation.add(new UriParameter(reservationId, BackendConstantes.CHAMBRE_RESERVATION_V1_RESERVATION + "/" + reservationId));
		}
		chambreResponse.setListUriReservation(listUriReservation);
		
		return chambreResponse;
	}
}
