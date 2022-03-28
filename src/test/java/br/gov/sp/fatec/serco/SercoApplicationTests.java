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
		
		INSERT INTO cooperados VALUES("1","1","PAULO GOMES D\'OLIVEIRA","Paulo Gomes","Lorival Gomes D\'oliveira","Maria Pia Barbiellini D\'oliveira","","0","","(12) 3953-3481","(12) 98836-0701","(__) ____-____","1955-12-06","1995-09-19","1995-10-17","2009-11-30","Demissão","NÃO","","","","","teste","Adiantamento solicitado em 22/04/03, no valor R$ 100,00 autorizado.             ","Rua Colusa, 250 - Cond Quinta dos Esteves - Cs B4","Jardim California","Jacarei","SP","12244-730","Brasil","","","","7125076-1      ","Ssp-sp","1993-05-22","739.196.598-72","","2º Grau","CASADO(a)","3","1","1","MASC","Brasileiro","N","ednilsonjabreu@gmail.com","0","50.00","0","0","12","","","","","","","","","","","","","","","","","","","","","NÃO","","0","");



	}

}
