package model;

public class City {
	
	public long id;
	public String naziv;
	
	public City(long id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
	}
	public City() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	
}
