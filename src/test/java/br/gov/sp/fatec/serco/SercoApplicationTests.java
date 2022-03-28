package br.gov.sp.fatec.serco;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.gov.sp.fatec.serco.entity.Cooperados;
import br.gov.sp.fatec.serco.repository.CooperadoRespository;

@SpringBootTest
class SercoApplicationTests {

	@Autowired
	private CooperadoRespository cooperadoRepo;

	@Test
	void contextLoads() {
	}

	@Test
	void testaInsercao(){
		Cooperados cooperado = new Cooperados();
		cooperado.setNome("Kleber");


	}

}
