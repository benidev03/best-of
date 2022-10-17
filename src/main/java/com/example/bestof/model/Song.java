package com.example.bestof.model;

public class Song {
	
	private String titolo;
	private String genere;
	private String autore;
	private String cantante;
	private int anno;
	
	
	public Song(String titolo, String genere, String autore, int anno) {
	
		this.titolo = titolo;
		this.genere = genere;
		this.autore = autore;
		this.anno = anno;
	}
	

	public Song() {
	
		this.titolo = "Soldi";
		this.genere = "Hip-Hop";
		this.autore = "Belbeni Makani";
		this.cantante = "KBM";
		this.anno = 2022;
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public String getGenere() {
		return genere;
	}


	public void setGenere(String genere) {
		this.genere = genere;
	}


	public String getAutore() {
		return autore;
	}


	public void setAutore(String autore) {
		this.autore = autore;
	}


	public int getAnno() {
		return anno;
	}


	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	

}
