package Logica;

public class Cotxe {

	private String matricula;
	private float kms;
	private Sucursal sucursal;
	private Categoria categoria;
	protected String getMatricula() {
		return matricula;
	}
	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	protected float getKms() {
		return kms;
	}
	protected void setKms(float kms) {
		this.kms = kms;
	}
	protected Sucursal getSucursal() {
		return sucursal;
	}
	protected void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	protected Categoria getCategoria() {
		return categoria;
	}
	protected void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
}
