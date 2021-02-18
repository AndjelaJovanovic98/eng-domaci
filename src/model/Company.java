package model;

public class Company {
	public long id;
	public String naziv;
	public Company(long id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
	}
	public Company() {
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
