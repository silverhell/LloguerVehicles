package Logica;

import java.util.ArrayList;

//LA DE FSO ES UNA BRASAS
public class Categoria {

	private float preuModIlimitat;
	private float preuModKm;
	private float preuKmModKm;
	private float preuSegurTR;
	private float preuSegurT;

	Categoria Superior;
	
	@SuppressWarnings("unused")
	private ArrayList<Cotxe> cotxes;

	public float getPreuModIlimitat() {
		return preuModIlimitat;
	}

	public void setPreuModIlimitat(float preuModIlimitat) {
		this.preuModIlimitat = preuModIlimitat;
	}

	public float getPreuModKm() {
		return preuModKm;
	}

	public void setPreuModKm(float preuModKm) {
		this.preuModKm = preuModKm;
	}

	public float getPreuKmModKm() {
		return preuKmModKm;
	}

	public void setPreuKmModKm(float preuKmModKm) {
		this.preuKmModKm = preuKmModKm;
	}

	public float getPreuSegurTR() {
		return preuSegurTR;
	}

	public void setPreuSegurTR(float preuSegurTR) {
		this.preuSegurTR = preuSegurTR;
	}

	public float getPreuSegurT() {
		return preuSegurT;
	}

	public void setPreuSegurT(float preuSegurT) {
		this.preuSegurT = preuSegurT;
	}

	public Categoria getSuperior() {
		return Superior;
	}

	public void setSuperior(Categoria superior) {
		Superior = superior;
	}
	
	
	
}
