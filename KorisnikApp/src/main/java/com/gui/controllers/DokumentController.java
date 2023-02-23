package com.gui.controllers;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import com.ejb.services.DokumentService;
import com.jpa.entities.Dokument;

@ManagedBean
public class DokumentController {
	private String naziv="";
    private String id="";
    private String cena="";
    private String ckid="";
    private String cdok="";
    private Dokument dokument = new Dokument();
    
    @EJB
	private DokumentService service;
    public Dokument getDokument() {
    	return dokument;
    	}
    	public void setDokument(Dokument employee) {
    	this.dokument = employee;
    	}

    public  String getId() {
		return id;
	}
    public void setId(String i) {
		this.id=i;
	}
    
    public  String getNaziv() {
		return naziv;
	}
    public void setNaziv(String n) {
		this.naziv=n;
	}
    
    public  String getCena() {
		return cena;
	}
    public void setCena(String c) {
		this.cena=c;
	}
    
    public List<Dokument> sviDokumenti(){
		List<Dokument> dokumenti=service.spisakDokumenata();
		return dokumenti;
	}
    public void saveDokument(Dokument emp) {
    	service.addDokument(emp);
    	}
    public  String getCkid() {
		return id;
	}
    public void setCkid(String i) {
		ckid=i;
	}
    public  String getCdok() {
		return cdok;
	}
    public void setCdok(String i) {
		cdok=i;
	}
}
