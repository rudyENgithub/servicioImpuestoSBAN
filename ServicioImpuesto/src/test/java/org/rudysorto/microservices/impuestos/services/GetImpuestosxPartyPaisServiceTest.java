package org.rudysorto.microservices.impuestos.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.rudysorto.microservices.impuestos.domain.ObtenerImpuesto;
import org.rudysorto.microservices.impuestos.model.Impuestos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GetImpuestosxPartyPaisServiceTest {
	
	  @MockBean
	  private GeneratorImpuestoService generatorImpuestoService;
	  
	  @Autowired
	  private GetImpuestosxPartyPaisService getImpuestosxPartyPaisService;
	  
	  @Test
	    public void createGetImpuestoTest() {
	        // given (our mocked Random Generator service will return first 50, then 30)
		  ArrayList<Impuestos>  lstImpuestos = new ArrayList<Impuestos>();
		  lstImpuestos.add(new Impuestos("IVA", 13));
		  lstImpuestos.add(new Impuestos("DAI", 7));
		  
	        given(generatorImpuestoService.getImpuestoxparandpais(1115, "SV")).willReturn(lstImpuestos);

	        // when
	        ObtenerImpuesto obtenerimpuesto = getImpuestosxPartyPaisService.createObtenerImpuesto();

	        ArrayList<Impuestos>  lstImpuestosReturn = new ArrayList<Impuestos>();
	        lstImpuestosReturn.add(new Impuestos("IVA", 13));
	        lstImpuestosReturn.add(new Impuestos("DAI", 14));//
	        // assert
	        assertThat(obtenerimpuesto.getPais()).isEqualTo("SV");
	        assertThat(obtenerimpuesto.getPartidaAran()).isEqualTo(1115);//30
	        assertThat(obtenerimpuesto.getLstImpuestos()).isEqualTo(lstImpuestosReturn);
	    }
	

}
