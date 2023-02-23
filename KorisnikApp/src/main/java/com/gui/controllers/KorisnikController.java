package com.gui.controllers;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import com.ejb.services.KorisnikService;
import com.jpa.entities.Korisnik;

@ManagedBean
public class KorisnikController {
	private String ime="";
    private String id="";
    private String prezime="";
    private String nazivd="";
    private String adresa="";
    private String brisi="";
    private String aid="";   
    private String aadresa="";
    private String izmeni="";   
    private String ckid="";
    private String status="";
    private Korisnik korisnik = new Korisnik();
    @EJB
	private KorisnikService service;
    
    public Korisnik getKorisnik()
    {
    	return korisnik;
    }
    public void setKorisnik(Korisnik k)
    {
    	korisnik=k;
    }
    public  String getId() {
		return id;
	}
    public void setId(String i) {
		this.id=i;
	}
    
    public  String getIme() {
		return ime;
	}
    public void setIme(String im) {
		this.ime=im;
	}
    
    public  String getPrezime() {
		return prezime;
	}
    public void setPrezime(String p) {
		this.prezime=p;
	}
    
    public  String getNazivd() {
		return nazivd;
	}
    public void setNazivd(String n) {
		this.nazivd=n;
	}
    
    public  String getAdresa() {
		return adresa;
	}
    public void setAdresa(String a) 
    {
		this.adresa=a;
	}
    
    public  String getAid() {
		return aid;
	}
        public void setAid(String aid) {
		this.aid=aid;
	}
        public  String getBrisi() 
        {
    		return brisi;
    	}
        public void setBrisi(String brisi) 
        {
    		this.brisi=brisi;
    	}
        
        public  String getAadresa()
        {
    		return aadresa;
    	}
        public void setAadresa(String aadresa)
        {
    		this.aadresa=aadresa;
        }
        
        public  String getStatus() 
        {
    		return status;
    	}
        
    	public void setStatus(String status) 
    	{
    		this.status=status;
        }
    	public  String getIzmeni() 
    	{
    		return izmeni;
    	}
        public void setIzmeni(String izmeni) 
        {
    		this.izmeni=izmeni;
    	}
        public void brisiKupac(String brisi)
        {
    		service.deleteKupac(brisi);
    	}
        public List<Korisnik> sviKorisnici(){
    		List<Korisnik> k = service.spisakKorisnika();
    		return k;
    	}
        public void dodajKupac(Korisnik a)
    	{
    		service.addKupac(a);
    	}
        public void azurirajKupac(String aid, String aadresa) 
    	{
    		service.updateKupac(aid,aadresa);
    	}
    	
    	public void azurirajKupacStatus(String izmeni, String status) 
    	{
    		service.updateKupacStatus(izmeni,status);
    	}
    	public  String getCkid() 
        {
        		return ckid;
        }
        public void setCkid(String ckid) 
        {
        		this.ckid=ckid;
        }
}
