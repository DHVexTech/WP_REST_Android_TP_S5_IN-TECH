package fr.intech.s5.backend.hotel.intech.Backendhotelintech.converter;



import org.springframework.core.convert.converter.Converter;

import fr.intech.s5.backend.hotel.intech.Backendhotelintech.entity.Chambre;
import fr.intech.s5.backend.hotel.intech.Backendhotelintech.model.response.ReservableChambreResponse;
import fr.intech.s5.backend.hotel.intech.Backendhotelintech.util.BackendConstantes;




public class ChambreToReservableChambreResponseConverter implements Converter<Chambre, ReservableChambreResponse>{


	@Override
	public ReservableChambreResponse convert(Chambre chambre) {
		ReservableChambreResponse reservableChambreResponse = new ReservableChambreResponse ();
		reservableChambreResponse.setChambreId(chambre.getChambreId());	
		reservableChambreResponse.setNumeroChambre(chambre.getNumeroChambre());
		reservableChambreResponse.setPrix(chambre.getPrix());
		reservableChambreResponse.setUri(BackendConstantes.CHAMBRE_RESERVATION_V1 + "/" + chambre.getChambreId());
		
		return reservableChambreResponse;
	}
 
}

