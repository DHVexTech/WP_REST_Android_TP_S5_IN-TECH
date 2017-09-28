package fr.intech.s5.backend.hotel.intech.Backendhotelintech.converter;

import java.util.List;

import org.springframework.core.convert.converter.Converter;

import fr.intech.s5.backend.hotel.intech.Backendhotelintech.entity.Chambre;
import fr.intech.s5.backend.hotel.intech.Backendhotelintech.model.response.ChambreReservedResponse;

public class ChambresToChambresReservedResponse implements Converter<List<Chambre>, ChambreReservedResponse>{

	@Override
	public ChambreReservedResponse convert(List<Chambre> chambres) {
	
		ChambreReservedResponse ChambresReservedResponse = new ChambreReservedResponse();
		
		ChambresReservedResponse.setListChambreReservee(chambres);
		
		return ChambresReservedResponse;
	}

}
