package com.ejb.services.impl;
import java.util.List;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.ejb.services.KorisnikService;
import com.jpa.entities.Korisnik;
@Stateless

public class KorisnikServiceImpl implements KorisnikService {

	@PersistenceContext(name = "KorisnikApp")
	private EntityManager em;
	@Override
	public void addKupac(Korisnik a) {
		em.persist(a);
		
	}

	@Override
	public void deleteKupac(String brisi) {
		try
		{
	 
			int kid=Integer.parseInt(brisi);
			Korisnik k1 =em.find(Korisnik.class, kid);
			em.remove(k1);

	    } 
		catch(Exception ex) 
		{
		
		System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
		
		}  
		
	}

	@Override
	public void updateKupac(String aid, String aadresa) {
		try
		{
			
	    
	    int kid=Integer.parseInt(aid);
	    Korisnik k1 =em.find(Korisnik.class, kid);
	    System.out.println(aadresa);
	    k1.setAdresa(aadresa);
	    
	   

	    
	       
	    } 
		catch(Exception ex)
		{
		
		System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
		
		}  
		
	}

	@Override
	public void updateKupacStatus(String sid, String status) {
		try { int kid=Integer.parseInt(sid);
		    Korisnik k1 =em.find(Korisnik.class, kid);
		    System.out.println(status);
		    k1.setStatus(status);

		    
		       
		        } catch(Exception ex) {
			
			System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
			
			}  
		
	}

	@Override
	public List<Korisnik> spisakKorisnika() {
		List<Korisnik> sviKorisnici = em.createQuery("SELECT k FROM Korisnik k", Korisnik.class).getResultList();
		return sviKorisnici;
		
	}
	

}
