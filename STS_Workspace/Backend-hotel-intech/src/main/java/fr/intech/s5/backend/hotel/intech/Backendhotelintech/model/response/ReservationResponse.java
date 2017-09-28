package fr.intech.s5.backend.hotel.intech.Backendhotelintech.model.response;

import java.time.LocalDate;

import fr.intech.s5.backend.hotel.intech.Backendhotelintech.util.UriParameter;

public class ReservationResponse {
	public Long getReservationId() {
		return reservationId;
	}
	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}
	public LocalDate getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}
	public LocalDate getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}
	private Long reservationId;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private UriParameter uriParameter;
	
	public UriParameter getUriParameter() {
		return uriParameter;
	}
	public void setUriParameter(UriParameter uriParameter) {
		this.uriParameter = uriParameter;
	}
}
