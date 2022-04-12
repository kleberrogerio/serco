package br.gov.sp.fatec.serco;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.gov.sp.fatec.serco.entity.Cooperados;
import br.gov.sp.fatec.serco.repository.CooperadoRepository;
import java.util.Date;

@SpringBootTest
class SercoApplicationTests {

	@Autowired
	private CooperadoRepository cooperadoRepo;

	@Test
	void contextLoads() {
	}

	@Test
	void testaInsercao(){
		Cooperados cooperado = new Cooperados();
		Date date = new Date();
		
		cooperado.setMatricula(1526L);
		cooperado.setNome("Kleber Nascimento");
		cooperado.setNomeguerra("Klebao");
		cooperado.setPai("Serafim");
		cooperado.setMae("Nadir");		
		cooperado.setConjuge("Vanessa");
		cooperado.setNumfilhos(2L);
		cooperado.setLocalnasc("São Paulo");
		cooperado.setTelefoneresidencial("12 39063602");
		cooperado.setTelefonecelular("12 99136-3797");
		cooperado.setTelefonecomercial("12 3908-6708");
		//cooperado.setDatanascimento(1975/05/19);
		
		/*conjuge
		telefonecomercial
		datanascimento
		datacadastro
		dataadmissao
		datadesligamento
		Motivo
		cooperado
		dataadmissibilidade
		testepsicologico
		testetecnico
		informacoes
		restricao
		anotacoes
		endereco
		bairro
		cidade
		estado
		cep
		Pais
		datatestepsico
		datatestetecnico
		foto
		RG
		rgoem
		rgemis
		CPF
		inss
		escolaridade
		EstadoCivil
		arquivo
		gaveta
		pasta
		Sexo
		Nacionalidade
		sel
		email
		indicacao
		valor_pgbl
		perc_pgbl
		nrdep
		aniversario
		idade
		ocorrencias
		passaporte
		dataexpedicao
		dt_vencto_pass
		oem_pass
		nie_nr
		nie_vencto
		endereco2
		bairro2
		cidade2
		estado2
		pais2
		cep2
		telres2
		telcel2
		telcom2
		eb2
		eb2_dtinicio
		eb2_dtvencto
		aposentado
		beneficio
		dep_ir
		Isqn
		
		
		 cooperados VALUES("1","1","PAULO GOMES D\'OLIVEIRA","Paulo Gomes","Lorival Gomes D\'oliveira","Maria Pia Barbiellini D\'oliveira","","0","","(12) 3953-3481","(12) 98836-0701","(__) ____-____","1955-12-06","1995-09-19","1995-10-17","2009-11-30","Demissão","NÃO","","","","","teste","Adiantamento solicitado em 22/04/03, no valor R$ 100,00 autorizado.             ","Rua Colusa, 250 - Cond Quinta dos Esteves - Cs B4","Jardim California","Jacarei","SP","12244-730","Brasil","","","","7125076-1      ","Ssp-sp","1993-05-22","739.196.598-72","","2º Grau","CASADO(a)","3","1","1","MASC","Brasileiro","N","ednilsonjabreu@gmail.com","0","50.00","0","0","12","","","","","","","","","","","","","","","","","","","","","NÃO","","0","");

		*/


	}

}
