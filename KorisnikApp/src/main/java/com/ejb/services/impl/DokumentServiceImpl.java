package com.ejb.services.impl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.ejb.services.DokumentService;
import com.jpa.entities.Dokument;
@Stateless
public class DokumentServiceImpl implements DokumentService {
@PersistenceContext(name = "KorisnikApp")
private EntityManager em;

@Override
public List<Dokument> spisakDokumenata() {
	List<Dokument> sviDokumenti = em.createQuery("SELECT k FROM Dokument k", Dokument.class).getResultList();
	return sviDokumenti;
}
@Override
public void addDokument(Dokument e) {
	em.persist(e);
	
}
@Override
public String checkDokument(String ckid,String cdok){
String res="";
	try {
	return sendGET(ckid,cdok);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	return res;
}	
}

private static final String USER_AGENT = "Mozilla/5.0";

public String sendGET(String ckid,String cdok) throws IOException {
	String res="";
	
	URL obj = new URL("http://192.168.99.100/?ckid="+ckid+"?cdok="+cdok);
	HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	con.setRequestMethod("GET");
	con.setRequestProperty("User-Agent", USER_AGENT);
	int responseCode = con.getResponseCode();
	System.out.println("GET Response Code :: " + responseCode);
	if (responseCode == HttpURLConnection.HTTP_OK) { 
		BufferedReader in = new BufferedReader(new InputStreamReader(
				con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// print result
		System.out.println(response.toString());
		return response.toString();
	} else {
		res="";
		System.out.println("GET request not worked");
		return res;
	}
}
}

