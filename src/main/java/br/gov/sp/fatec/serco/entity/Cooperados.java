package br.gov.sp.fatec.serco.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cooperados")
public class Cooperados{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="index_cod")
    private Long index_cod;
    
    @Column(name="matricula")
    private Long matricula;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="nomeguerra")
    private String nomeguerra;
    
    @Column(name="pai")
    private String pai;
    
    @Column(name="mae")
    private String mae;
    
    @Column(name="conjuge")
    private String conjuge;
    
    @Column(name="numfilhos")
    private Long numfilhos;
    
    @Column(name="Localnasc")
    private String localnasc;
    
    @Column(name="telefoneresidencial")
    private String telefoneresidencial;
    
    @Column(name="telefonecelular")
    private String telefonecelular;
    
    @Column(name="telefonecomercial")
    private String telefonecomercial;
    
    @Column(name="datanascimento")
    private Date datanascimento;
    
    @Column(name="datacadastro")
    private Date datacadastro;
    
    @Column(name="dataadmissao")
    private Date dataadmissao;
    
    @Column(name="datadesligamento")
    private Date datadesligamento;
    
    @Column(name="Motivo")
    private String motivo;
    
    @Column(name="cooperado")
    private String cooperado;
    
    @Column(name="dataadmissibilidade")
    private Date dataadmissibilidade;
    
    @Column(name="testepsicologico")
    private String testepsicologico;
    
    @Column(name="testetecnico")
    private String testetecnico;
    
    @Column(name="informacoes")
    private String informacoes;
    
    @Column(name="restricao")
    private String restricao;
    
    @Column(name="anotacoes")
    private String anotacoes;
    
    @Column(name="endereco")
    private String endereco;
    
    @Column(name="bairro")
    private String bairro;
    
    @Column(name="cidade")
    private String cidade;
    
    @Column(name="estado")
    private String estado;
    
    @Column(name="cep")
    private String cep;
    
    @Column(name="Pais")
    private String pais;
    
    @Column(name="datatestepsico")
    private Date datatestepsico;
    
    @Column(name="datatestetecnico")
    private Date datatestetecnico;
    
    @Column(name="foto")
    private String foto;
    
    @Column(name="RG")
    private String rg;
    
    @Column(name="rgoem")
    private String rgoem;
    
    @Column(name="rgemis")
    private Date rgemis;
    
    @Column(name="CPF")
    private String cpf;
    
    @Column(name="inss")
    private String inss;
    
    @Column(name="escolaridade")
    private String escolaridade;
    
    @Column(name="EstadoCivil")
    private String estadoCivil;
    
    @Column(name="arquivo")
    private Long arquivo;
    
    @Column(name="gaveta")
    private Long gaveta;
    
    @Column(name="pasta")
    private Long pasta;
    
    @Column(name="Sexo")
    private String sexo;
    
    @Column(name="Nacionalidade")
    private String nacionalidade;
    
    @Column(name="sel")
    private String sel;
    
    @Column(name="email")
    private String email;
    
    @Column(name="indicacao")
    private Long indicacao;
    
    @Column(name="valor_pgbl")
    private Long  valor_pgbl;
    
    @Column(name="perc_pgbl")
    private Long perc_pgbl;
    
    @Column(name="nrdep")
    private Long nrdep;
    
    @Column(name="aniversario")
    private String aniversario;
    
    @Column(name="idade")
    private Long idade;
    
    @Column(name="ocorrencias")
    private Long ocorrencias;
    
    @Column(name="passaporte")
    private String passaporte;
    
    @Column(name="dataexpedicao")
    private Date dataexpedicao;
    
    @Column(name="dt_vencto_pass")
    private Date dt_vencto_pass;
    
    @Column(name="oem_pass")
    private String oem_pass;
    
    @Column(name="nie_nr")
    private String nie_nr;
    
    @Column(name="nie_vencto")
    private Date nie_vencto;
    
    @Column(name="endereco2")
    private String endereco2;
    
    @Column(name="bairro2")
    private String bairro2;
    
    @Column(name="cidade2")
    private String cidade2;
    
    @Column(name="estado2")
    private String estado2;
    
    @Column(name="pais2")
    private String pais2;
    
    @Column(name="cep2")
    private String cep2;
    
    @Column(name="telres2")
    private String telres2;
    
    @Column(name="telcel2")
    private String telcel2;
    
    @Column(name="telcom2")
    private String telcom2;
    
    @Column(name="eb2")
    private String eb2;
    
    @Column(name="eb2_dtinicio")
    private Date eb2_dtinicio;
    
    @Column(name="eb2_dtvencto")
    private Date eb2_dtvencto;
    
    @Column(name="aposentado")
    private String aposentado;
    
    @Column(name="beneficio")
    private String beneficio;
    
    @Column(name="dep_ir")
    private Long dep_ir;
    
    @Column(name="Isqn")
    private String Isqn;

    public Long getIndex_cod() {
        return index_cod;
    }
    public void setIndex_cod(Long index_cod) {
        this.index_cod = index_cod;
    }
    public Long getMatricula() {
        return matricula;
    }
    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNomeguerra() {
        return nomeguerra;
    }
    public void setNomeguerra(String nomeguerra) {
        this.nomeguerra = nomeguerra;
    }
    public String getPai() {
        return pai;
    }
    public void setPai(String pai) {
        this.pai = pai;
    }
    public String getMae() {
        return mae;
    }
    public void setMae(String mae) {
        this.mae = mae;
    }
    public String getConjuge() {
        return conjuge;
    }
    public void setConjuge(String conjuge) {
        this.conjuge = conjuge;
    }
    public Long getNumfilhos() {
        return numfilhos;
    }
    public void setNumfilhos(Long numfilhos) {
        this.numfilhos = numfilhos;
    }
    public String getLocalnasc() {
        return localnasc;
    }
    public void setLocalnasc(String localnasc) {
        this.localnasc = localnasc;
    }
    public String getTelefoneresidencial() {
        return telefoneresidencial;
    }
    public void setTelefoneresidencial(String telefoneresidencial) {
        this.telefoneresidencial = telefoneresidencial;
    }
    public String getTelefonecelular() {
        return telefonecelular;
    }
    public void setTelefonecelular(String telefonecelular) {
        this.telefonecelular = telefonecelular;
    }
    public String getTelefonecomercial() {
        return telefonecomercial;
    }
    public void setTelefonecomercial(String telefonecomercial) {
        this.telefonecomercial = telefonecomercial;
    }
    public Date getDatanascimento() {
        return datanascimento;
    }
    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }
    public Date getDatacadastro() {
        return datacadastro;
    }
    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }
    public Date getDataadmissao() {
        return dataadmissao;
    }
    public void setDataadmissao(Date dataadmissao) {
        this.dataadmissao = dataadmissao;
    }
    public Date getDatadesligamento() {
        return datadesligamento;
    }
    public void setDatadesligamento(Date datadesligamento) {
        this.datadesligamento = datadesligamento;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public String getCooperado() {
        return cooperado;
    }
    public void setCooperado(String cooperado) {
        this.cooperado = cooperado;
    }
    public Date getDataadmissibilidade() {
        return dataadmissibilidade;
    }
    public void setDataadmissibilidade(Date dataadmissibilidade) {
        this.dataadmissibilidade = dataadmissibilidade;
    }
    public String getTestepsicologico() {
        return testepsicologico;
    }
    public void setTestepsicologico(String testepsicologico) {
        this.testepsicologico = testepsicologico;
    }
    public String getTestetecnico() {
        return testetecnico;
    }
    public void setTestetecnico(String testetecnico) {
        this.testetecnico = testetecnico;
    }
    public String getInformacoes() {
        return informacoes;
    }
    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }
    public String getRestricao() {
        return restricao;
    }
    public void setRestricao(String restricao) {
        this.restricao = restricao;
    }
    public String getAnotacoes() {
        return anotacoes;
    }
    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Date getDatatestepsico() {
        return datatestepsico;
    }
    public void setDatatestepsico(Date datatestepsico) {
        this.datatestepsico = datatestepsico;
    }
    public Date getDatatestetecnico() {
        return datatestetecnico;
    }
    public void setDatatestetecnico(Date datatestetecnico) {
        this.datatestetecnico = datatestetecnico;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getRgoem() {
        return rgoem;
    }
    public void setRgoem(String rgoem) {
        this.rgoem = rgoem;
    }
    public Date getRgemis() {
        return rgemis;
    }
    public void setRgemis(Date rgemis) {
        this.rgemis = rgemis;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getInss() {
        return inss;
    }
    public void setInss(String inss) {
        this.inss = inss;
    }
    public String getEscolaridade() {
        return escolaridade;
    }
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public Long getArquivo() {
        return arquivo;
    }
    public void setArquivo(Long arquivo) {
        this.arquivo = arquivo;
    }
    public Long getGaveta() {
        return gaveta;
    }
    public void setGaveta(Long gaveta) {
        this.gaveta = gaveta;
    }
    public Long getPasta() {
        return pasta;
    }
    public void setPasta(Long pasta) {
        this.pasta = pasta;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getSel() {
        return sel;
    }
    public void setSel(String sel) {
        this.sel = sel;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getIndicacao() {
        return indicacao;
    }
    public void setIndicacao(Long indicacao) {
        this.indicacao = indicacao;
    }
    public Long getValor_pgbl() {
        return valor_pgbl;
    }
    public void setValor_pgbl(Long valor_pgbl) {
        this.valor_pgbl = valor_pgbl;
    }
    public Long getPerc_pgbl() {
        return perc_pgbl;
    }
    public void setPerc_pgbl(Long perc_pgbl) {
        this.perc_pgbl = perc_pgbl;
    }
    public Long getNrdep() {
        return nrdep;
    }
    public void setNrdep(Long nrdep) {
        this.nrdep = nrdep;
    }
    public String getAniversario() {
        return aniversario;
    }
    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
    public Long getIdade() {
        return idade;
    }
    public void setIdade(Long idade) {
        this.idade = idade;
    }
    public Long getOcorrencias() {
        return ocorrencias;
    }
    public void setOcorrencias(Long ocorrencias) {
        this.ocorrencias = ocorrencias;
    }
    public String getPassaporte() {
        return passaporte;
    }
    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }
    public Date getDataexpedicao() {
        return dataexpedicao;
    }
    public void setDataexpedicao(Date dataexpedicao) {
        this.dataexpedicao = dataexpedicao;
    }
    public Date getDt_vencto_pass() {
        return dt_vencto_pass;
    }
    public void setDt_vencto_pass(Date dt_vencto_pass) {
        this.dt_vencto_pass = dt_vencto_pass;
    }
    public String getOem_pass() {
        return oem_pass;
    }
    public void setOem_pass(String oem_pass) {
        this.oem_pass = oem_pass;
    }
    public String getNie_nr() {
        return nie_nr;
    }
    public void setNie_nr(String nie_nr) {
        this.nie_nr = nie_nr;
    }
    public Date getNie_vencto() {
        return nie_vencto;
    }
    public void setNie_vencto(Date nie_vencto) {
        this.nie_vencto = nie_vencto;
    }
    public String getEndereco2() {
        return endereco2;
    }
    public void setEndereco2(String endereco2) {
        this.endereco2 = endereco2;
    }
    public String getBairro2() {
        return bairro2;
    }
    public void setBairro2(String bairro2) {
        this.bairro2 = bairro2;
    }
    public String getCidade2() {
        return cidade2;
    }
    public void setCidade2(String cidade2) {
        this.cidade2 = cidade2;
    }
    public String getEstado2() {
        return estado2;
    }
    public void setEstado2(String estado2) {
        this.estado2 = estado2;
    }
    public String getPais2() {
        return pais2;
    }
    public void setPais2(String pais2) {
        this.pais2 = pais2;
    }
    public String getCep2() {
        return cep2;
    }
    public void setCep2(String cep2) {
        this.cep2 = cep2;
    }
    public String getTelres2() {
        return telres2;
    }
    public void setTelres2(String telres2) {
        this.telres2 = telres2;
    }
    public String getTelcel2() {
        return telcel2;
    }
    public void setTelcel2(String telcel2) {
        this.telcel2 = telcel2;
    }
    public String getTelcom2() {
        return telcom2;
    }
    public void setTelcom2(String telcom2) {
        this.telcom2 = telcom2;
    }
    public String getEb2() {
        return eb2;
    }
    public void setEb2(String eb2) {
        this.eb2 = eb2;
    }
    public Date getEb2_dtinicio() {
        return eb2_dtinicio;
    }
    public void setEb2_dtinicio(Date eb2_dtinicio) {
        this.eb2_dtinicio = eb2_dtinicio;
    }
    public Date getEb2_dtvencto() {
        return eb2_dtvencto;
    }
    public void setEb2_dtvencto(Date eb2_dtvencto) {
        this.eb2_dtvencto = eb2_dtvencto;
    }
    public String getAposentado() {
        return aposentado;
    }
    public void setAposentado(String aposentado) {
        this.aposentado = aposentado;
    }
    public String getBeneficio() {
        return beneficio;
    }
    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }
    public Long getDep_ir() {
        return dep_ir;
    }
    public void setDep_ir(Long dep_ir) {
        this.dep_ir = dep_ir;
    }
    public String getIsqn() {
        return Isqn;
    }
    public void setIsqn(String isqn) {
        Isqn = isqn;
    }

    
}