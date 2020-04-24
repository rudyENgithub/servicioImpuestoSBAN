package org.rudysorto.microservices.impuestos.services;

import java.util.ArrayList;

import org.rudysorto.microservices.impuestos.model.Impuestos;


public interface GeneratorImpuestoService {
	
	
	
	ArrayList<Impuestos> getImpuestoxparandpais(int partida, String pais);
	
	
}
