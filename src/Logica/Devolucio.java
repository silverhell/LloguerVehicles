package Logica;

import java.util.ArrayList;
import java.util.Date;

public class Devolucio {
	//Atributs
	private Date data;
	private double importACobrar;
	private double importCobrat;
	private double kms;
	private double combustible;
	private ArrayList<Desperfecte> desperfectes;
	private Lliurament lliurament;
	private Empleat empleat;
	
	//Getters & Setters
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getImportACobrar() {
		return importACobrar;
	}
	public void setImportACobrar(double importACobrar) {
		this.importACobrar = importACobrar;
	}
	public double getImportCobrat() {
		return importCobrat;
	}
	public void setImportCobrat(double importCobrat) {
		this.importCobrat = importCobrat;
	}
	public double getKms() {
		return kms;
	}
	public void setKms(double kms) {
		this.kms = kms;
	}
	public double getCombustible() {
		return combustible;
	}
	public void setCombustible(double combustible) {
		this.combustible = combustible;
	}
	public ArrayList<Desperfecte> getDesperfectes() {
		return desperfectes;
	}
	public void setDesperfectes(ArrayList<Desperfecte> desperfectes) {
		this.desperfectes = desperfectes;
	}
	public Lliurament getLliurament() {
		return lliurament;
	}
	public void setLliurament(Lliurament lliurament) {
		this.lliurament = lliurament;
	}
	public Empleat getEmpleat() {
		return empleat;
	}
	public void setEmpleat(Empleat empleat) {
		this.empleat = empleat;
	}
}
