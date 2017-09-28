package fr.intech.s5.backend.hotel.intech.Backendhotelintech.model.response;

public class ReservableChambreResponse {

	public ReservableChambreResponse(Long chambreId, Integer numeroChambre, Integer prix, String uri) {
		super();
		this.chambreId = chambreId;
		this.numeroChambre = numeroChambre;
		this.prix = prix;
		this.uri = uri;
	}
	public ReservableChambreResponse(Integer numeroChambre, Integer prix, String uri) {
		super();
		this.numeroChambre = numeroChambre;
		this.prix = prix;
		this.uri = uri;
	}
	public ReservableChambreResponse() {
		super();
	}

	
	
	private Long chambreId;
	private Integer numeroChambre;
	private Integer prix;
	private String uri;
	
	
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
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	
	
}
