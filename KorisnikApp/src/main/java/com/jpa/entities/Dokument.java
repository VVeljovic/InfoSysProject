package com.jpa.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "dokument")
public class Dokument {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;
	
	@Column(name = "naziv")
	private String naziv;
	 
	 
	@Column(name = "cena")
	private int cena;
	
	public Dokument()
	{
		
	}
	
	public Dokument(int i, String n, int c )
	{
		id =i;
		naziv = n;
		cena = c;
	}
	
	 public int getId() 
	 {
	        return id;
	 }
	 
	 public void setId(int i)
	  {
		  id = i;
	 }
	    
	 public String getNaziv() {
	        return naziv;
	 }
	 
	 public void setNaziv(String n) {
	        this.naziv = n;
	 }
	
	 public int getCena()
	 {
		 return cena;
	 }
	 
	 public void setCena(int c)
	 {
		 cena= c;
	 }
	
	 @Override
     public String toString() 
	 {
	
	        return naziv + ";" + id + ";" + cena ;
	
	 }
}
