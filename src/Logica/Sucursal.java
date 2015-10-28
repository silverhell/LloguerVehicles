package Logica;

import java.util.ArrayList;
import java.util.HashMap;

public class Sucursal {
	private String direccio;
	
	private HashMap<String, Empleat> empleats;
	private HashMap<String, Cotxe> cotxes;
	private ArrayList<Reserva> reservaRecollida;
	private ArrayList<Reserva> reservaDevolucio;
	
	
	protected String getDireccio() {
		return direccio;
	}
	protected void setDireccio(String direccio) {
		this.direccio = direccio;
	}
}
