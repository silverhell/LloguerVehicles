package Logica;

public class Empleat {
	private String nom;
	private boolean administraor;
	protected String getNom() {
		return nom;
	}
	protected void setNom(String nom) {
		this.nom = nom;
	}
	protected boolean isAdministraor() {
		return administraor;
	}
	protected void setAdministraor(boolean administraor) {
		this.administraor = administraor;
	}
}
