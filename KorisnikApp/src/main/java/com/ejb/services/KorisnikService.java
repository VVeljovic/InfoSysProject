package com.ejb.services;
import java.util.List;
import com.jpa.entities.Korisnik;
import java.io.IOException;
public interface KorisnikService {
	public void addKupac(Korisnik a);
	public void deleteKupac(String brisi);
	public void updateKupac(String aid, String aadresa);
    public void updateKupacStatus(String sid, String status);
	public List<Korisnik> spisakKorisnika();
	
}
