package org.rudysorto.microservices.impuestos.services;

import java.util.ArrayList;

import org.rudysorto.microservices.impuestos.domain.ObtenerImpuesto;
import org.rudysorto.microservices.impuestos.model.Impuestos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GetImpuestosxPartyPaisImpl implements GetImpuestosxPartyPaisService {

	private GeneratorImpuestoService generatorImpuestoservice;
	
	  @Autowired
	    public GetImpuestosxPartyPaisImpl(GeneratorImpuestoService generatorImpuestoservice) {
	        this.generatorImpuestoservice = generatorImpuestoservice;
	    }
	
	@Override
	public ObtenerImpuesto createObtenerImpuesto() {
		// TODO Auto-generated method stub
		int partidaAran = 0;
		String pais = "SV";
		 ArrayList<Impuestos>  lstImpuestos = generatorImpuestoservice.getImpuestoxparandpais(partidaAran, pais);
		return new ObtenerImpuesto(partidaAran, pais, lstImpuestos);
	}

}
