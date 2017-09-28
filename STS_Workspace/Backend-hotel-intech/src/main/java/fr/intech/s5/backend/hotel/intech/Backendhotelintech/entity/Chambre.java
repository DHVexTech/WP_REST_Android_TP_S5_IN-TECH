package fr.intech.s5.backend.hotel.intech.Backendhotelintech.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="chambre")
public class Chambre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long chambreId;
	
	@NotNull
	private Integer numeroChambre;
	
	@NotNull
	private Integer prix;
	
	@OneToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Reservation> listeDesReservations;

	public List<Reservation> getListeDesReservations() {
		return listeDesReservations;
	}

	public void setListeDesReservations(List<Reservation> listeDesReservations) {
		this.listeDesReservations = listeDesReservations;
	}
	
	public void addReservation(Reservation pReservation)
	{
		if (null == listeDesReservations)
		{
			listeDesReservations = new ArrayList<Reservation>();
		}
		listeDesReservations.add(pReservation);
	}
	
	public void updateReservation(Reservation pReservation)
	{
		for (int i = 0; i < listeDesReservations.size(); i++)
		{
			if (listeDesReservations.get(i).getIDReservation() == pReservation.getIDReservation())
			{
				listeDesReservations.get(i).setChambre(pReservation.getChambre());
				listeDesReservations.get(i).setDateDebut(pReservation.getDateDebut());
				listeDesReservations.get(i).setDateFin(pReservation.getDateFin());
			}
		}
	}

	public Chambre() {
		super();
	}

	public Chambre(Integer numeroChambre, Integer prix) {
		super();
		this.numeroChambre = numeroChambre;
		this.prix = prix;
	}

	public Long getChambreId() {
		return chambreId;
	}

	public void setChambreId(Long chambreId) {
		this.chambreId = chambreId;
	}

	public Integer getNumeroChambre() {
		return numeroChambre;
	}

	public void setNumeroChambre(Integer numeroChambre) {
		this.numeroChambre = numeroChambre;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public Chambre(Long chambreId, Integer numeroChambre, Integer prix) {
		super();
		this.chambreId = chambreId;
		this.numeroChambre = numeroChambre;
		this.prix = prix;
	}
	
	
}
