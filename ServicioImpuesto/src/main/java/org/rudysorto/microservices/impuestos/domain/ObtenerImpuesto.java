package org.rudysorto.microservices.impuestos.domain;

import java.util.ArrayList;

import org.rudysorto.microservices.impuestos.model.Impuestos;

public class ObtenerImpuesto {
	
	private int partidaAran;
	private String pais;
	
	private ArrayList<Impuestos>  lstImpuestos;
	
	

	public ObtenerImpuesto(int partidaAran, String pais, ArrayList<Impuestos>  lstImpuestos) {
		super();
		this.partidaAran = partidaAran;
		this.pais = pais;
		this.lstImpuestos = lstImpuestos;
		//this.getImpuestoxparandpais(this.partidaAran, this.pais);
	}
	
	/* public ArrayList<Impuestos> getImpuestoxparandpais(int part, String pais) {
		this.lstImpuestos.add(new Impuestos("IVA", 13));
		this.lstImpuestos.add(new Impuestos("DAI", 120));
		return this.lstImpuestos;
	}*/

	public int getPartidaAran() {
		return partidaAran;
	}

	public void setPartidaAran(int partidaAran) {
		this.partidaAran = partidaAran;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	

	public ArrayList<Impuestos> getLstImpuestos() {
		return lstImpuestos;
	}

	public void setLstImpuestos(ArrayList<Impuestos> lstImpuestos) {
		this.lstImpuestos = lstImpuestos;
	}

	@Override
	public String toString() {
		return "ObtenerImpuesto [partidaAran=" + partidaAran + ", pais=" + pais + ", lstImpuestos=" + lstImpuestos
				+ "]";
	}
	
	
	
	
	
	
}
