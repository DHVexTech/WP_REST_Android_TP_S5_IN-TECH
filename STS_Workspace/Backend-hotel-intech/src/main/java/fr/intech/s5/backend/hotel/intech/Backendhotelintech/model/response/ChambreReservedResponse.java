package fr.intech.s5.backend.hotel.intech.Backendhotelintech.model.response;

import java.util.List;

import fr.intech.s5.backend.hotel.intech.Backendhotelintech.entity.Chambre;

public class ChambreReservedResponse {
	private List<Chambre> listChambreReservee;

	public ChambreReservedResponse() {

	}

	public ChambreReservedResponse(List<Chambre> listChambreReservee) {
		this.listChambreReservee = listChambreReservee;
	}

	public List<Chambre> getListChambreReservee() {
		return listChambreReservee;
	}

	public void setListChambreReservee(List<Chambre> listChambreReservee) {
		this.listChambreReservee = listChambreReservee;
	}
}
