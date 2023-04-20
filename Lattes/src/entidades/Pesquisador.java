package entidades;

import java.util.ArrayList;

/** 
 * Classe Pesquisador, utilizada para representar os pesquisadores cadastrados no site.
 * Atributos descritos no metodo construtor
 * @author Pera
 * @version 19-04-23
 * 
 */

public class Pesquisador {

	private String nome, area;
	private Universidade universidade;
	private ArrayList<Projeto> projetos = new ArrayList<Projeto>();
	private ArrayList<Artigo> artigos = new ArrayList<Artigo>();

	/**
	 * Construtor alternativo da classe Pesquisador
	 * @param nome Nome do pesquisador
	 * @param area Area sob a qual o pesquisador atua
	 * @param universidade Universidade onde o pesquisador atua
	*/
	public Pesquisador(String nome, String area, Universidade universidade)
	{
		this.nome = nome;
		this.area = area;
		this.universidade = universidade;
		this.artigos = null;
	}
	
	/**
	 * Construtor padrao da classe Pesquisador, nao recebe nenhum parametro e assume o valor nulo para todos os atributos
	*/
	public Pesquisador()
	{
		this.nome = null;
		this.area = null;
		this.universidade = null;
		this.artigos = null;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Universidade getUniversidade() {
		return this.universidade;
	}

	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
	}

	public ArrayList<Projeto> getProjetos()
	{
		return this.projetos;
	}
	
	/**
	 * Metodo que escreve no console os projetos que o pesquisador que chamou o metodo fez parte. E diferente de getProjetos(), visto que um escreve os projetos na tela e nao possui valor de retorno, e o outro retorna o atributo "projetos" do objeto que o chama
	 */
	public void listarProjetos()
    {
    	for(int i=0; i<projetos.size(); i++)
    	{
    		System.out.println(projetos.get(i));
    	}
    }

	public void setProjetos(ArrayList<Projeto> projetos) {
		this.projetos = projetos;
	}

	/**
	 * Adiciona um projeto ao array list de projetos do pesquisador que chama o metodo
	 * @param novo_Projeto Objeto da classe Projeto que sera adicionado ao vetor de projetos
	 */
	public void addProjeto(Projeto novo_Projeto)
	{
		this.projetos.add(novo_Projeto);
	}

	/**
	 * Remove um projeto do array list de projetos do pesquisador que chama o metodo
	 * @param projeto Objeto da classe Projeto que sera removido do vetor de projetos
	 */
	public void removeProjeto(Projeto projeto)
	{
		this.projetos.remove(projeto);
	}

	public ArrayList<Artigo> getArtigos() {
		return artigos;
	}

	/**
	 * Metodo que escreve no console os artigos que o pesquisador chamou o metodo fez parte. E diferente de getArtigos(), visto que um escreve os artigos na tela e nao possui valor de retorno, e o outro retorna o atributo "artigos" do objeto que o chama
	 */
	public void listarArtigos()
    {
    	for(int i=0; i<artigos.size(); i++)
    	{
    		System.out.println(artigos.get(i));
    	}
    }

	public void setArtigos(ArrayList<Artigo> artigos) {
		this.artigos = artigos;
	}

	/**
	 * Adiciona um artigo ao array list de artigos do pesquisador que chama o metodo
	 * @param novo_Artigo Objeto da classe Artigo que sera adicionado ao vetor de artigos
	 */
	public void addArtigo(Artigo novo_Artigo)
	{
		this.artigos.add(novo_Artigo);
		//novo_Artigo.getPesquisadores().add(this); -> eu preciso fazer esse tipo de correlação ou deixo para o usuário fazer a leitura?
	}

	/**
	 * Remove um artigo do array list de artigos do pesquisador que chama o metodo
	 * @param artigo Objeto da classe Artigo que sera removido do vetor de artigos
	 */
	public void removeArtigo(Artigo artigo)
	{
		this.artigos.remove(artigo);
	}
}
