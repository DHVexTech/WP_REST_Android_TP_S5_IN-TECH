package fr.intech.s5.backend.hotel.intech.Backendhotelintech.model.request;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class ReservationRequest {

	
	
	public ReservationRequest(Long chambreId, LocalDate dateDebut, LocalDate dateFin) {
		super();
		this.chambreId = chambreId;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	public ReservationRequest() {
		super();
	}
	public ReservationRequest(Long reservationId, Long chambreId, LocalDate dateDebut, LocalDate dateFin) {
		super();
		this.reservationId = reservationId;
		this.chambreId = chambreId;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	private Long reservationId;
	private Long chambreId;
	public Long getReservationId() {
		return reservationId;
	}
	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}
	public Long getChambreId() {
		return chambreId;
	}
	public void setChambreId(Long chambreId) {
		this.chambreId = chambreId;
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
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dateDebut;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dateFin;
}

