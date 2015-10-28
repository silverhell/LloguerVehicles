package Logica;

import java.util.ArrayList;
import java.util.Date;

public class Lliurament {
	//Atributs
	private Date data;
	private String modalitatSegur;
	private double kms;
	private double combustible;
	private Cotxe cotxe;
	private Empleat empleat;
	private Devolucio devolucio;
	private ArrayList<Desperfecte> desperfectes;
	private Reserva reserva;
	
	public Reserva getReserva() {
		return reserva;
	}
	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	//Getters & Setters
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getModalitatSegur() {
		return modalitatSegur;
	}
	public void setModalitatSegur(String modalitatSegur) {
		this.modalitatSegur = modalitatSegur;
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
	public Cotxe getCotxe() {
		return cotxe;
	}
	public void setCotxe(Cotxe cotxe) {
		this.cotxe = cotxe;
	}
	public Empleat getEmpleat() {
		return empleat;
	}
	public void setEmpleat(Empleat empleat) {
		this.empleat = empleat;
	}
	public Devolucio getDevolucio() {
		return devolucio;
	}
	public void setDevolucio(Devolucio devolucio) {
		this.devolucio = devolucio;
	}
	public ArrayList<Desperfecte> getDesperfectes() {
		return desperfectes;
	}
	public void setDesperfectes(ArrayList<Desperfecte> desperfectes) {
		this.desperfectes = desperfectes;
	}
	
	
	
}
