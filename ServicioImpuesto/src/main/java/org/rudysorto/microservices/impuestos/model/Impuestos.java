package org.rudysorto.microservices.impuestos.model;

public class Impuestos {
	
	private String impuesto;
	private int valorImpuesto;
	
	
	
	public Impuestos(String impuesto, int valorImpuesto) {
		super();
		this.impuesto = impuesto;
		this.valorImpuesto = valorImpuesto;
	}
	public String getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(String impuesto) {
		this.impuesto = impuesto;
	}
	public int getValorImpuesto() {
		return valorImpuesto;
	}
	public void setValorImpuesto(int valorImpuesto) {
		this.valorImpuesto = valorImpuesto;
	}
	@Override
	public String toString() {
		return "Impuestos [impuesto=" + impuesto + ", valorImpuesto=" + valorImpuesto + "]";
	}
	
	
	
	

}
