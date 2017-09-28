package fr.intech.s5.backend.hotel.intech.Backendhotelintech.model.response;

import java.util.List;

import fr.intech.s5.backend.hotel.intech.Backendhotelintech.util.UriParameter;

public class ChambreResponse {

	private Long chambreId;
	
	private Integer numerChambre;
	
	private Integer prix;

	private List<UriParameter> listUriReservation;

	public ChambreResponse() {

	}

	public ChambreResponse(Integer numerChambre, Integer prix, List<UriParameter> listUriReservation) {
		this.numerChambre = numerChambre;
		this.prix = prix;
		this.listUriReservation = listUriReservation;
	}

	public ChambreResponse(Long chambreId, Integer numerChambre, Integer prix, List<UriParameter> listUriReservation) {
		this.chambreId = chambreId;
		this.numerChambre = numerChambre;
		this.prix = prix;
		this.listUriReservation = listUriReservation;
	}

	public Long getChambreId() {
		return chambreId;
	}

	public void setChambreId(Long chambreId) {
		this.chambreId = chambreId;
	}

	public Integer getNumerChambre() {
		return numerChambre;
	}

	public void setNumerChambre(Integer numerChambre) {
		this.numerChambre = numerChambre;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public List<UriParameter> getListUriReservation() {
		return listUriReservation;
	}

	public void setListUriReservation(List<UriParameter> listUriReservation) {
		this.listUriReservation = listUriReservation;
	}
}
