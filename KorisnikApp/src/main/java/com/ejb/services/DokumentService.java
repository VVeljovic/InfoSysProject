package com.ejb.services;

import java.io.IOException;
import java.util.List;

import com.jpa.entities.Dokument;
public interface DokumentService {
	
	public List<Dokument> spisakDokumenata();
	public void addDokument(Dokument e);
	public String checkDokument(String ckid,String cdok) throws IOException;

}
