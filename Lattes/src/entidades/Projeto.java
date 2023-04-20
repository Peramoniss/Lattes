package entidades;

import java.util.ArrayList;

import objetos.Data;

/** 
 * Classe Projeto, utilizada para representar os projetos realizados por pesquisadores registrados no site.
 * Atributos descritos no método construtor
 * @author Pera
 * @version 19-04-23
 * 
 */

public class Projeto {

//Cadastrar o título do projeto, descrição, data de início, data de final. Vincular os pesquisadores envolvidos (vetor de objetos).
	private String titulo;
	private String descricao;
	private Data inicio, termino;
	private ArrayList<Pesquisador> pesquisadores = new ArrayList<Pesquisador>();
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Data getInicio() {
		return inicio;
	}

	public void setInicio(Data inicio) {
		this.inicio = inicio;
	}

	public Data getTermino() {
		return termino;
	}

	public void setTermino(Data termino) {
		this.termino = termino;
	}

	public ArrayList<Pesquisador> getPesquisadores() {
		return pesquisadores;
	}

	/**
	 * Adiciona um pesquisador ao array list de pesquisadores do projeto que chama o método
	 * @param novo_Pesquisador Objeto da classe Pesquisador que será adicionado ao vetor de pesquisadores envolvidos no projeto
	 */
	public void addPesquisadores(Pesquisador novo_pesquisador){
		this.pesquisadores.add(novo_pesquisador);
	}

	public void setPesquisadores(ArrayList<Pesquisador> pesquisadores) {
		this.pesquisadores = pesquisadores;
	}

	/**
	 * Método que escreve no console os pesquisadores que o projeto que chamou o método possui. É diferente de getPesquisadores(), visto que um escreve os pesquisadores na tela e não possui valor de retorno, e o outro retorna o atributo "pesquisadores" do objeto que o chama
	 */
	void listarPesquisadores()
    {
    	for(int i=0; i<pesquisadores.size(); i++)
    	{
    		System.out.println(pesquisadores.get(i));
    	}
    }
	
	/**
	 * Método variante de listarPesquisadores(). Essencialmente é o mesmo método, mas só o realiza caso o projeto esteja encerrado
	 */
	void listarPesquisadoresSeTerminado()//variante
    {
		if(termino != null) {
			listarPesquisadores();		
		}else {
			System.out.println("Projeto ainda não finalizado");
		}
    }
}
