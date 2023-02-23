package com.jpa.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "korisnik")
public class Korisnik {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;
	
	@Column(name = "ime")
	private String ime;
	 
	 
	@Column(name = "prezime")
	private String prezime;
	@Column(name = "nazivd")
	private String nazivd;
	
	@Column(name = "adresa")
	private String adresa;
	
	@Column(name = "status")
    private String status;  
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String s)
	{
		this.status=s;
	}
	
	public int getId() 
	 {
	        return id;
	 }
	 
	 public void setId(int i )
	  {
		 this.id=i;
	 }
	 
	 public String getIme()
	 {
		 return ime;
	 }
	public void setIme(String im)
	{
		this.ime = im;
	}
	
	public String getPrezime()
	{
		return prezime;
	}
	public void setPrezime(String p)
	{
		this.prezime = p;
	}
	
	public String getNazivd()
	{
		return nazivd;
	}
	public void setNazivd(String n)
	{
		this.nazivd = n;
	}
	
	public String getAdresa()
	{
		return adresa;
	}
	public void setAdresa(String a)
	{
		this.adresa =a;
	}
	
	@Override
    public String toString() 
	 {
	
	        return id + ";" + ime + ";" + prezime + ";" + nazivd+ ";" + adresa ;
	
	 }
	public Korisnik() 
	{
		
	}
	public Korisnik(int i, String im, String p, String n, String a, String s)
	{
		this.setId(i);
    	this.setIme(im);
    	this.setPrezime(p);
    	this.setNazivd(n);
        this.setAdresa(a);
        this.setStatus(status);
	}
	
}
