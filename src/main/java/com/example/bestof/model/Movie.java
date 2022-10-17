package com.example.bestof.model;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	
	private String titolo;
	private String regista;
	private List<String> cast;
	private int anno;
	
	public Movie(String titolo, String regista, List<String> cast, int anno) {
		
		this.titolo = titolo;
		this.regista = regista;
		this.cast = cast;
		this.anno = anno;
	}
	
	public Movie() {
		
		this.titolo = "Io Amo Belbeni";
		this.regista = "Makani belbeni";
		this.anno = 2022;
		this.cast = new ArrayList<String>();
		cast.add("Luca Lisurici");
		cast.add("Giuseppe Salcuni");
		
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}


	public List<String> getCast() {
		return cast;
	}

	public void setCast(List<String> cast) {
		this.cast = cast;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	
	

}
