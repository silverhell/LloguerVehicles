package Logica;

import java.util.Date;

public class Reserva {
	//Atributs
	private Date dataRecollida;
	private Date dataDevolucio;
	private String modalitatLloguer;
	private Categoria catReservada;
	private Client client;
	private Sucursal llocRecollida;
	private Sucursal llocDevolucio;
	private Lliurament lliurament;
	
	//Getters & Setters
	public Date getDataRecollida() {
		return dataRecollida;
	}
	public void setDataRecollida(Date dataRecollida) {
		this.dataRecollida = dataRecollida;
	}
	public Date getDataDevolucio() {
		return dataDevolucio;
	}
	public void setDataDevolucio(Date dataDevolucio) {
		this.dataDevolucio = dataDevolucio;
	}
	public String getModalitatLloguer() {
		return modalitatLloguer;
	}
	public void setModalitatLloguer(String modalitatLloguer) {
		this.modalitatLloguer = modalitatLloguer;
	}
	public Categoria getCatReservada() {
		return catReservada;
	}
	public void setCatReservada(Categoria catReservada) {
		this.catReservada = catReservada;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Sucursal getLlocRecollida() {
		return llocRecollida;
	}
	public void setLlocRecollida(Sucursal llocRecollida) {
		this.llocRecollida = llocRecollida;
	}
	public Sucursal getLlocDevolucio() {
		return llocDevolucio;
	}
	public void setLlocDevolucio(Sucursal llocDevolucio) {
		this.llocDevolucio = llocDevolucio;
	}
	public Lliurament getLliurament() {
		return lliurament;
	}
	public void setLliurament(Lliurament lliurament) {
		this.lliurament = lliurament;
	}
	
}
