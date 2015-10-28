package Logica;

import java.util.Date;

public class Client {
	//Atributs
	private String nom;
	private String direccio;
	private String poblacio;
	private int codPostal;
	private Date dataPermis;
	private int digitsTC;
	private int mesTC;
	private int anyTC;
	private int cvcTC;
	private String tipusTC;
	
	//Getters & Setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDireccio() {
		return direccio;
	}
	public void setDireccio(String direccio) {
		this.direccio = direccio;
	}
	public String getPoblacio() {
		return poblacio;
	}
	public void setPoblacio(String poblacio) {
		this.poblacio = poblacio;
	}
	public int getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}
	public Date getDataPermis() {
		return dataPermis;
	}
	public void setDataPermis(Date dataPermis) {
		this.dataPermis = dataPermis;
	}
	public int getDigitsTC() {
		return digitsTC;
	}
	public void setDigitsTC(int digitsTC) {
		this.digitsTC = digitsTC;
	}
	public int getMesTC() {
		return mesTC;
	}
	public void setMesTC(int mesTC) {
		this.mesTC = mesTC;
	}
	public int getAnyTC() {
		return anyTC;
	}
	public void setAnyTC(int anyTC) {
		this.anyTC = anyTC;
	}
	public int getCvcTC() {
		return cvcTC;
	}
	public void setCvcTC(int cvcTC) {
		this.cvcTC = cvcTC;
	}
	public String getTipusTC() {
		return tipusTC;
	}
	public void setTipusTC(String tipusTC) {
		this.tipusTC = tipusTC;
	}
	
}
