package fr.intech.s5.backend.hotel.intech.Backendhotelintech.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Reservation")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long reservationId;
	
	@NotNull
	public LocalDate dateDebut;
	
	@NotNull
	public LocalDate dateFin;

	public Long getIDReservation() {
		return reservationId;
	}

	public void setIDReservation(Long iDReservation) {
		reservationId = iDReservation;
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

	public Reservation()
	{
		
	}
	
	public Reservation(LocalDate checkIn, LocalDate checkOut)
	{
		dateDebut = checkIn;
		dateFin = checkOut;
	}
	
	public Reservation(LocalDate checkIn, LocalDate checkOut, Long IdReservation)
	{
		reservationId = IdReservation;
		dateDebut = checkIn;
		dateFin = checkOut;
	}
	
	@ManyToOne
	private Chambre chambre;

	public Chambre getChambre() {
		return chambre;
	}

	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}
	
	
}
